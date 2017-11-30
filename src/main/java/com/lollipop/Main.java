package com.lollipop;

import java.util.Scanner;

/**
 * Created by zhuxh on 2017/11/28.
 */
public class Main {
    private static int[] num = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
    static int count;
    static char[] cArr;
    static String temp;
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            String[] s1 = new String[N];
            String[] s2 = new String[M];
            for (int i = 0; i < N; i++) {
                s1[i] = scanner.next();
            }
            for (int i = 0; i < M; i++) {
                s2[i] = scanner.next();
            }
            for (int i = 0; i < M; i++) {
                System.out.println(getMatchCount(s1, s2[i]));
            }
        } catch (Exception e) {

        }
    }


    public static int getMatchCount(String[] s1, String matStr) {
        count = 0;
        for (String s : s1) {
            temp = "";
            cArr = s.toCharArray();
            for (char c : cArr) {
                temp += String.valueOf(num[c % 65]);
            }
            if (temp.equals(matStr)) {
                count++;
            }
        }
        return count;
    }
}
