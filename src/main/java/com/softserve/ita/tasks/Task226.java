package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import com.softserve.ita.utils.DoubleTuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task226 implements Task<List<Long>, DoubleTuple<Long, Long>> {

    /*
     * Дано натуральні n, m. Отримати усі їх натуральні спільні кратні які не пеевищують n*m
     * */

    private final static Task226 task226 = new Task226();

    public synchronized static Task<List<Long>, DoubleTuple<Long, Long>> getInstance() {
        return task226;
    }

    private DoubleTuple<Long, Long> tuple;

    private Task226() {
        tuple = new DoubleTuple<>();
    }

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter n:");
        tuple.setFirstElement(Math.abs(Long.valueOf(reader.readLine())));
        System.out.println("Enter m:");
        tuple.setSecondElement(Math.abs(Long.valueOf(reader.readLine())));
    }

    @Override
    public void setUp(DoubleTuple<Long, Long> value) throws IOException {
        tuple = value;
    }

    @Override
    public List<Long> execute() {
        // (!) n < m (!)
        long n = tuple.getFirstElement();
        long m = tuple.getSecondElement();

        if (n > m) {
            n ^= m;
            m ^= n;
            n ^= m;
        }

        long prod = m * n;
        long step = m % n == 0 ? m : prod / gcd(m, n);
        List<Long> commonMultiple = new ArrayList<>((int) (prod / step));

        for (long i = prod; i >= m; i -= step) {
            commonMultiple.add(i);
        }

        return commonMultiple;
    }

    private long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
