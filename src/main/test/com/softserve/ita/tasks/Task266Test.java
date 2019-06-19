package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.softserve.ita.utils.DoubleTuple;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task266Test {

    private Task<List<Long>, DoubleTuple<Long, Long>> task226;

    @BeforeTest
    public void init() {
        task226 = Task226.getInstance();
    }

    @Test
    public void testGetInstance() {
        Task<List<Long>, DoubleTuple<Long, Long>> task_1 = Task226.getInstance();
        Task<List<Long>, DoubleTuple<Long, Long>> task_2 = Task226.getInstance();
        Assert.assertSame(task_1, task_2);
    }


    @Test(dataProvider = "data")
    public void testExecute(DoubleTuple<Long, Long> given, List<Long> expected) throws IOException {
        task226.setUp(given);
        System.out.println(given + "|" + expected);
        Assert.assertEquals(task226.execute(), expected);
    }

    /**
     * first column - given number, second column - expected number
     */
    @DataProvider(name = "data")
    public Object[][] getDataForTest() {
        return new Object[][] {
                { new DoubleTuple<Long,Long>((long)4,(long)5), Arrays.asList((long)20) },
                { new DoubleTuple<Long,Long>((long)1,(long)1), Arrays.asList((long)1) },
                { new DoubleTuple<Long,Long>((long)40,(long)50), Arrays.asList((long)2000, (long)1800, (long)1600, (long)1400, (long)1200, (long)1000, (long)800, (long)600, (long)400, (long)200) },
                { new DoubleTuple<Long,Long>((long)4,(long)33), Arrays.asList((long)132) },
                { new DoubleTuple<Long,Long>((long)36,(long)12), Arrays.asList((long)432, (long)396, (long)360, (long)324, (long)288, (long)252, (long)216, (long)180, (long)144, (long)108, (long)72, (long)36) },
        };
    }


}