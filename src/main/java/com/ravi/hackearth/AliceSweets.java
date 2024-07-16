package com.ravi.hackearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/***
 * Problem
 * Alice has three different types of sweets. There are
 *  sweets of each type, and each sweet has a tastiness value. The tastiness values for sweets are given in three arrays
 * ,
 * , and
 * . The tastiness value of two sweets of a particular type can differ.
 *
 * Alice wants to choose three sweets, exactly one of each type. Let the chosen sweets’ tastiness values be
 * ,
 * , and
 * . You need to choose the sweets such that the value of the equation
 *  is minimized. Here,
 *  is the absolute value function.
 *
 * Input Format
 *
 * The first line contains a single integer
 *  denoting the number of sweets of each type.
 * The second line contains
 *  space-separated integers denoting the array
 * .
 * The third line contains
 *  space-separated integers denoting the array
 * .
 * The fourth line contains
 *  space-separated integers denoting the array
 * .
 * Output Format
 *
 * Print the minimum value of the equation mentioned in the problem statement if we can choose exactly one sweet of each type.
 */
public class AliceSweets {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i_A = 0; i_A < arr_A.length; i_A++) {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }
        String[] arr_B = br.readLine().split(" ");
        int[] B = new int[N];
        for (int i_B = 0; i_B < arr_B.length; i_B++) {
            B[i_B] = Integer.parseInt(arr_B[i_B]);
        }
        String[] arr_C = br.readLine().split(" ");
        int[] C = new int[N];
        for (int i_C = 0; i_C < arr_C.length; i_C++) {
            C[i_C] = Integer.parseInt(arr_C[i_C]);
        }

        int out_ = minimumValue(N, A, B, C);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    static int minimumValue(int N, int[] A, int[] B, int[] C) {
        // Write your code here
        int result = 0;

        return result;

    }
}
