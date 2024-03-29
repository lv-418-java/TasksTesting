package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Task182 implements Task<Task182.Resault, int[]> {

    private final static Task182 task182 = new Task182();

    public synchronized static Task<Resault, int[]> getInstance(){
        return task182;
    }

    private int[] params;

    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter 1,2,3,n where n is natural number");
        try {
            String params = reader.readLine();
            System.out.println(params);

            String[] stringNumbers = params.split("-");
            System.out.println(Arrays.toString(stringNumbers));
            int[] numbers = new int[stringNumbers.length];
            for(int i = 0; i < stringNumbers.length; i++){
                numbers[i] = Integer.parseInt(stringNumbers[i]);
            }

            this.params = numbers;
            this.params = new int[]{1,23,3};
        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void setUp(int[] value) throws IOException {
        params = new int[value.length];
        System.arraycopy(value,0,params,0,value.length);
    }

    public Resault execute(){
        try {
            return handle(params);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    public Resault handle(int... numbers) throws IllegalArgumentException {

        for (int n : numbers) {
            if (n <= 0) throw new IllegalArgumentException("Number `" + n + "` is not natural");
        }

        int[] rezArr = Arrays.stream(numbers).filter((n) -> (n % 5 == 0) && (n % 7 != 9)).toArray();

        int count = rezArr.length;

        int sum = Arrays.stream(rezArr).reduce(0, (rez, next) -> rez + next);

        return new Resault(count, sum);
    }

    public class Resault {

        private int quantity;
        private int sum;

        Resault(int q, int s) {
            quantity = q;
            sum = s;
        }

        public int getQuantity() {
            return quantity;
        }

        public int getSum() {
            return sum;
        }

        @Override
        public String toString() {
            return "Resault is quantity " + quantity + " sum " + sum;
        }
    }

}
