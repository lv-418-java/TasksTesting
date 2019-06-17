package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task88b implements Task<Integer, Integer> {

	private final static Task88b task86b = new Task88b();

	public synchronized static Task<Integer, Integer> getInstance(){
		return task86b;
	}

	private Task88b(){

	}

	private int number;

	@Override
	public void setUp(BufferedReader reader) {
		try {
			number = Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setUp(Integer value) throws IOException {
		number = value;
	}

	@Override
	public Integer execute() {

		String str = number + "";
		char[] ch = str.toCharArray();
		List<Character> list = new ArrayList<>();
		for (int i = ch.length - 1; i >= 0; i--) {
			list.add(ch[i]);
		}
		StringBuilder word = new StringBuilder();
		for (char c : list) {
			word.append(c);
		}
		return Integer.parseInt(word.toString());
	}
}
