package ru.mail.polis.ads.part5.kuzo_liza;

import java.util.Scanner;

public class Diplomas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextInt();
        long h = sc.nextInt();
        long n = sc.nextInt();
        long left = Math.max(w, h);
        long right = n * left;
        long m, v;
        while (left < right) {
            m = (left + right) / 2;
            v = (m / w) * (m / h);
            if (v >= n) {
                right = m;
            } else {
                left = m + 1;
            }
        }
        System.out.println(right);
    }
}