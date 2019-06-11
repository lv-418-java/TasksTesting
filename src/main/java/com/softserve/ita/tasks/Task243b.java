package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Main;
import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task243b implements Task<List> {
    static {
        Main.registerTask("243b", new Task243b());
    }

    private int n;

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        n = Integer.parseInt(reader.readLine());
    }

    @Override
    public List execute() {
        int boundary = (int) Math.sqrt(n);
        List<int[]> resultList = new ArrayList<>();

        for (int x = 1; x <= boundary; x++) {
            for (int y = 1; y <= x; y++) {
                if ((x * x + y * y) == n) {
                    resultList.add(new int[]{x, y});
                }
            }
        }

        return resultList.get(0) != null ? resultList : null;
    }
}

