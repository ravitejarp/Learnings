package com.ravi.algos.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FractionalKnapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        List<List<Double>> listOfInputs = new ArrayList<>();
        System.out.println("Please enter the number of data fields:");
        if (scanner.hasNext()) {
            count = scanner.nextInt();
        }
        while (count-- > 0) {
            System.out.println("Enter the profit:");
            List<Double> doubleList = new ArrayList<>();
            if (scanner.hasNext()) {
                doubleList.add(scanner.nextDouble());
            }
            System.out.println("Enter the weight:");
            if (scanner.hasNext()) {
                doubleList.add(scanner.nextDouble());
            }
            listOfInputs.add(doubleList);
        }
        System.out.println("Please input the max Total:");
        int W = scanner.nextInt();
        System.out.println(listOfInputs);
        System.out.println(new FractionalKnapsack().getTheKnap(listOfInputs, W));
    }

    private int getTheKnap(List<List<Double>> listOfInputs, int W) {
        int finalVal = 0;

        List<Double> fractionsList = listOfInputs.stream().map(input -> input.get(0) / input.get(1)).sorted((v1, v2) -> Double.compare(v2, v1)).toList();
        System.out.println(fractionsList);
        // TODO Fix the actual problem now
        List<Double> profitSortedList = listOfInputs.stream().map(input -> input.get(0)).sorted((v1, v2) -> Double.compare(v2, v1)).toList();


        return finalVal;

    }

}
