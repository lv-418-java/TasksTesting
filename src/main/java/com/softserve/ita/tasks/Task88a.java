package com.softserve.ita.tasks;

import com.softserve.ita.taskstesting.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task88a implements Task<String> {
	int number;
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
	public String execute() {
		int square = number * number;
		String str = square + "";
		int zero = 0;
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '3') {
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
