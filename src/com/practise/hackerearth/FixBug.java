package com.practise.hackerearth;

import java.util.Arrays;

public class FixBug {
	public static void main(String[] args) {
		int[] a = {212,111}; 
			//{1,3,2,1};
		int[] b = {32312,111,321}; 
			//{4,2,5,3,2};
		int value = solution(a, b);
		System.out.println(value);
	}
	static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }

}
https://www.hackerearth.com/challenge/test/clm-java-dev-screening-test-2/?login=f0d2717a4cf191ad929c1940b4f04402