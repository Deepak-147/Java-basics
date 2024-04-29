package com.ldeepak.tips.enums;

enum Season {
	WINTER, SPRING, SUMMER, FALL;
	// 0,1,2,3
}

public class EnumsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Season season = Season.WINTER;
		System.out.println(season.ordinal());
	}

}
