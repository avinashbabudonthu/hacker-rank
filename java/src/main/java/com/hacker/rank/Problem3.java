package com.hacker.rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if("EOF".equalsIgnoreCase(str)){
                break;
            }
            lines.add(str);
        }
        new Problem3().print(lines);
    }

    private void print(List<String> lines) {
        for(int i=0;i<lines.size();i++) {
            System.out.println((i+1) + " " + lines.get(i));
        }
    }
}
