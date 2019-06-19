package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;


public class Task178vTest {
    private Task<Integer,int[]> t;

    @BeforeTest
    public void init() throws IOException {
        t = Task178v.getInstance();
        int array[] = {1,16,36,64};
        t.setUp(array);
    }

    @Test
    public void testExecute() {
        Assert.assertTrue(t.execute() == 3);
    }


}