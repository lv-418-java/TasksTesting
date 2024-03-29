package com.softserve.ita.taskstesting;

import com.softserve.ita.tasks.*;
import com.softserve.ita.utils.TripleTuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    private static Map<String, Task<?,?>> tasks = new HashMap<>();
    static{
        tasks.put("86b",  Task86b.getInstance());
        tasks.put("88b",  Task88b.getInstance());
        tasks.put("86a",  Task86a.getInstance());
        tasks.put("87",   Task87.getInstance());
        tasks.put("88a",  Task88a.getInstance());
        tasks.put("88v",  Task88v.getInstance());
        tasks.put("88g",  Task88g.getInstance());
        tasks.put("107",  Task107.getInstance());
        tasks.put("178b", Task178b.getInstance());
        tasks.put("178v", Task178v.getInstance());
        tasks.put("178g", Task178g.getInstance());
        tasks.put("178d", Task178d.getInstance());
        tasks.put("226", Task226.getInstance());
        tasks.put("243a", Task243a.getInstance());
        tasks.put("243b", Task243b.getInstance());
        tasks.put("322",  Task322.getInstance());
        tasks.put("331a",  Task331a.getInstance());
        tasks.put("323",  Task323.getInstance());
        tasks.put("108",  Task108.getInstance());
        tasks.put("330",  Task330.getInstance());
        tasks.put("554",  Task554.getInstance());
        tasks.put("332",  Task332.getInstance());
        tasks.put("555",  Task555.getInstance());
        tasks.put("559",  Task559.getInstance());
        tasks.put("331a",  Task331a.getInstance());
        tasks.put("331b",  Task331b.getInstance());
        tasks.put("560",  Task560.getInstance());
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nEnter task name:");
            String taskName = bufferedReader.readLine();
            taskName = taskName.trim()
                    .replaceAll("[ ]{2,}","")
                    .toLowerCase();


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
