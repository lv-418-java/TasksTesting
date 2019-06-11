package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task88b implements Task<Integer> {
	int number;
	@Override
	public void setUp(BufferedReader reader) {
		try {
			number = Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public Integer execute() {

		String str = number + "";
		char ch[] = str.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (int i = ch.length - 1; i >= 0; i--) {
			list.add(ch[i]);
		}
		String word = "";
		for (char c : list) {
			word = word + c;
		}
		int finalNumber = Integer.parseInt(word);
		return finalNumber;
	}
}
