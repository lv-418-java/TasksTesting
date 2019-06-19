package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;
import javafx.print.Collation;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task555 implements Task<List<List<Integer>>, Integer> {

    private final static Task555 task555 = new Task555();

    public synchronized static Task<List<List<Integer>>, Integer> getInstance(){
        return task555;
    }

    private Task555(){

    }

    private int level;

    @Override
    public void setUp(BufferedReader reader) throws IOException {
        System.out.print("Level: ");
        level = Integer.valueOf(reader.readLine());
    }

    @Override
    public void setUp(Integer value) throws IOException {
        level = value;
    }

    public List<List<Integer>> execute() {
        List<List<Integer>> rezList= new ArrayList<>();

        int[] old = new int[level];
        int[] cur = new int[level];
        old[0] = 1;
        for(int i = 0; i < level; i++){
            List<Integer> row = new ArrayList<Integer>();

            for(int k = 0; k <= i; k++){
                if(k == 0 || k == i){
                    cur[k] = 1;
                    row.add(1);
                }
                else {
                    cur[k] = old[k-1] + old[k];
                    row.add(cur[k]);
                }
            }
            for(int k = 0; k <= i; k++){
                old[k] = cur[k];
            }
            rezList.add(row);
        }

        return rezList;
    }

}
