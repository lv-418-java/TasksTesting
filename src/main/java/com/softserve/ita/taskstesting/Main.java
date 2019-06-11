package com.softserve.ita.taskstesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<String, Task<?>> tasks = new HashMap<>();

    public static void registerTask(String name, Task task) {
        tasks.put(name, task);
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                String task = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
