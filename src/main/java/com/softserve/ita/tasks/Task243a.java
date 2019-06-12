package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Main;
import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task243a implements Task<List> {
    static {
        Main.registerTask("243a", new Task243a());
    }

    private int n;

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        System.out.println("Enter value for n: ");
        n = Integer.parseInt(reader.readLine());
    }

    @Override
    public List execute() {
        int boundary = (int) Math.sqrt(n);

        for (int x = 1; x <= boundary; x++) {
            for (int y = 1; y <= boundary; y++) {
                if ((x * x + y * y) == n)
                    return new ArrayList<>(Collections.singleton(new int[]{x, y}));
            }
        }
        return Collections.emptyList();
    }
}
