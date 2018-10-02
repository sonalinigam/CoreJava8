package com.practise.hackerearth;

import java.time.LocalDate;

public class MonthInADay {

	public static void main(String[] args) {

		LocalDate birthday = LocalDate.of(Integer.valueOf(1987), Integer.valueOf(03), Integer.valueOf(28));
		System.out.println(birthday.getDayOfWeek().toString());

	}

}
