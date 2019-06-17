package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;

public class Task555 implements Task<Integer, Integer> {

    private final static Task555 task555 = new Task555();

    public synchronized static Task<Integer, Integer> getInstance(){
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

    public Integer execute() {
        int[] old = new int[level];
        int[] cur = new int[level];
        old[0] = 1;
        for(int i = 0; i < level; i++){
            for(int k = 0; k <= i; k++){
                if(k == 0 || k == i){
                    System.out.print((cur[k] = 1) + "  ");
                }
                else {
                    System.out.print((cur[k] = old[k-1] + old[k]) + "  ");
                }
            }
            for(int k = 0; k <= i; k++){
                old[k] = cur[k];
            }
            System.out.println();
        }
        return 0;
    }
}
