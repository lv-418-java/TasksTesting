package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task88a implements Task<String, Integer> {
	private final static Task88a task86a = new Task88a();

	public synchronized static Task<String, Integer> getInstance(){
		return task86a;
	}

	private Task88a(){

	}

	private int number;

	@Override
	public void setUp(BufferedReader reader) {
		reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			number = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setUp(Integer value) throws IOException {
		number = value;
	}

	@Override
	public String execute() {
		int square = number * number;
		String str = square + "";
		int zero = 0;
		char[] ch = str.toCharArray();
		for (char ch1 : ch) {
			if (ch1 == '3') {
				zero++;
				break;
			}
		}
		if (zero == 0) {
			return "Square of number doesn't containts 3";
		}
		return "Square of number contains 3";
	}
}
