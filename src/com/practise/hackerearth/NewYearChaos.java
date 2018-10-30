package com.practise.hackerearth;

public class NewYearChaos {

	public static void main(String[] args) {
		//int[] q = { 1, 2, 5, 3, 7, 8, 6, 4 };
		int[] q = { 1, 2, 5, 3, 4, 7, 8, 6};
		// int[] q = {2, 1, 5, 3, 4};
		int jumps = 0;
		boolean chaos = false;
		for (int i = 0; i < q.length; i++) {
			if (q[i] - i - 1 > 0) {
				if (q[i] - i - 1 >= 3) {
					chaos = true;
				}
				if(q[i] < q[i+1]) {
					jumps += q[i+1] - q[i];
				}
				jumps += q[i] - i - 1;
			}
		}
		if (chaos) {
			System.out.println("Too chaotic");
		} else {
			System.out.println(jumps);
		}
	}
}
