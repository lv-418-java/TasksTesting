package com.softserve.ita.taskstesting;

import com.softserve.ita.tasks.Task182;

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

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nEnter task name:");
            String taskName = bufferedReader.readLine();

            if (taskName.equals("exit")) {
                break;
            }

            Task task = tasks.get(taskName);

            if (task == null) {
                System.out.println("Task '" + taskName + "' not found.");
            } else {
                task.setUp(bufferedReader);
                Object result = task.execute();
                System.out.println("Result: " + result);
            }
        }
    }
}
