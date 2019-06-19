package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task559 implements Task<List<Long>, Long> {

    /*
     * Дано натуральне n. Знайти усі менші n числа Мерсена. (2^p - 1, p - просте число)
     * */

    private final static Task559 task559 = new Task559();

    public synchronized static Task<List<Long>, Long> getInstance() {
        return task559;
    }

    private static Map<Long, Byte> primeNumbers = new HashMap<Long, Byte>() {{
        put(2L, (byte) 1);
    }};

    private long n;

    private Task559() {
    }

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter n:");
        n = Long.valueOf(reader.readLine());
        if (n < 0) {
            n = -n;
        }
    }

    @Override
    public void setUp(Long value) throws IOException {
        n = value;
    }

    @Override
    public List<Long> execute() {
        List<Long> mersenneNumbers = new ArrayList<>();

        long number = 3;
        long power = 3;

        while (number <= n) {
            if (isPrime(power)) {
                mersenneNumbers.add(number);
                number = (2 << (power - 1)) - 1;
            }
            power++;
        }

        return mersenneNumbers;
    }

    private boolean isPrime(long number) {
        byte state = primeNumbers.getOrDefault(number, (byte) -1);

        if (state == 1) {
            return true;
        } else if (state == 0) {
            return false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    primeNumbers.put(number, (byte) 0);
                    return false;
                }
            }
            primeNumbers.put(number, (byte) 1);
            return true;
        }
    }
}
