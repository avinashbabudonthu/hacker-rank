package com.hacker.rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Problem1 {

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println("a = " + a + ", b = " + b + ", n = " + n);

            List<Integer> series = problem1.buildSeries(a, b, n);
            problem1.print(series);
        }
    }

    private List<Integer> buildSeries(int a, int b, int n) {
        List<Integer> series = new ArrayList<>();
        int value = a;
        for(int i=0;i<n;i++) {
             value = value + (int) (Math.pow(2, i) * b);
             series.add(value);
        }

        return series;
    }

    private void print(List<Integer> series) {
        String str = series.stream().map(Object::toString).collect(Collectors.joining(" "));
        System.out.println(str);
    }
}