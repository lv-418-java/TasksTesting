package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.*;

public class Task560Test {

    private Task<Map<Integer, Integer>, Object> task;

    @BeforeTest
    public void setUp() {
        task = Task560.getInstance();
    }

    @Test
    public void testExecute() {
        Map<Integer, Integer> test = task.execute();
        Map <Integer, Integer> expected = new HashMap();
        expected.put(284, 220);
        assertEquals(test, expected);
    }
}