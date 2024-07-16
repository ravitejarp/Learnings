package com.ravi.hackearth;

/* IMPORTANT: Multiple classes and nested static classes are supported */


//import for Scanner and other utility classes

import java.util.*;
import java.util.stream.Collectors;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MazeMax {
    public static void main(String args[]) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        String rxc = s.nextLine();                 // Reading input from STDIN
        String[] rowxcol = rxc.split(" ");
        int row = Integer.parseInt(rowxcol[0]);
        int col = Integer.parseInt(rowxcol[1]);
        int[][] matrix = new int[row][col];
        int[][] matrixPivot = new int[col][row];
        int ro = 0;
        int tempRow = row;
        TreeSet<Integer> arrayList = new TreeSet<>(Collections.reverseOrder());
        TreeSet<Integer> arrayListPivot = new TreeSet<>(Collections.reverseOrder());
        while (tempRow-- > 0) {
            String rowData = s.nextLine();
            String[] rowDataArr = rowData.split(" ");
            int curr = Integer.MAX_VALUE;
            for (int i = 0; i < col; i++) {
                matrix[ro][i] = Integer.parseInt(rowDataArr[i]);
                matrixPivot[i][ro] = Integer.parseInt(rowDataArr[i]);
                if (curr > matrix[ro][i]) curr = matrix[ro][i];
            }
            arrayList.add(curr);
            ro++;
        }
        int max;
        for (int i = 0; i < col; i++) {
            int curr = Integer.MAX_VALUE;
            for (int sub : matrixPivot[i]) {
                curr = Math.min(curr, sub);
            }
            arrayListPivot.add(curr);
        }
        if (arrayList.first() > arrayListPivot.first()) {
            max = arrayListPivot.first();
        } else {
            max = arrayList.first();
        }


        System.out.printf("%d", max);
    }

}

