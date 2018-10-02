package com.java8.features;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] origArr = br.readLine().split(" ");
            int[] newArr = new int[N];
            for (int i = 0; i < origArr.length; i++) {
                newArr[i] = Integer.parseInt(origArr[i]);
            }

            int out_ = SubAndSuperArray(newArr, N);
            wr.println(out_);
        }

        wr.close();
        br.close();
    }

    static int SubAndSuperArray(int[] arr, int N) {
        int[] subArr1 = new int[arr.length/2]; 
        int[] subArr2 = new int[arr.length/2];
        for(int j=0; j<arr.length/2; j++) {
            subArr1[j] = arr[j];
        }
        for(int k = arr.length/2; k<arr.length; k++) {
            subArr2[k] = arr[k];
        }
        return subArr1.length + subArr2.length;

    }
}