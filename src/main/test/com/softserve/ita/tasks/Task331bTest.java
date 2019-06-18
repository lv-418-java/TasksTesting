package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task331bTest {

    private Task<List<String>, Integer> task331b;

    @BeforeTest
    public void init() throws IOException{
        task331b = Task331b.getInstance();
        task331b.setUp(50);
    }

    @Test
    public void testGetInstance() {
        Task<List<String>, Integer> task_1 = Task331b.getInstance();
        Task<List<String>, Integer> task_2 = Task331b.getInstance();
        Assert.assertSame(task_1, task_2);
    }

    @Test
    public void testExecute() {
        String[] answer = {"[3 4 5] ", "[3 5 4] ", "[4 3 5] ", "[4 5 3] ", "[5 3 4] ", "[5 4 3] "};
        Assert.assertEquals(task331b.execute(), new ArrayList<>(Arrays.asList(answer)));
    }
}