package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Task322 implements Task<Integer> {
	private static List<Integer> sumDilnukOfEveryNumber = new ArrayList<Integer>();
	private static List<Integer> list = new ArrayList<Integer>();
	private static int maxNum = 0;
	private static int zero = 0;

	public int max(int max) {
		for (int i = 0; i < sumDilnukOfEveryNumber.size() - 1; i++) {
			if (sumDilnukOfEveryNumber.get(i + 1) > max) {
				max = sumDilnukOfEveryNumber.get(i + 1);
				maxNum = i + 2;
			}
		}
		return maxNum;
	}
	@Override
	public Integer execute() {
		for (int j = 1; j <= 10000; j++) {
			for (int i = 1; i <= 10000; i++) {
				if (j % i == 0) {
					list.add(i);
				}
			}
			for (int k = 0; k < list.size(); k++) {
				zero += list.get(k);
			}
			sumDilnukOfEveryNumber.add(zero);
			zero = 0;
			list.clear();
		}
		Task322 t = new Task322();
		return t.max(sumDilnukOfEveryNumber.get(0));

	}
	@Override
	public void setUp(BufferedReader reader) {
		
	}
}
