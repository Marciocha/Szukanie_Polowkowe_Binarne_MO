package com.sdajava.szukanie_polowkowe_binarne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj element, ktorego szukasz: ");

        int n = scanner.nextInt();

        int[] a = {1, 2, 4, 6, 10};
        int s = 0;
        int p = a.length;
        int l = 1;

        boolean flaga = true;

        while (flaga) {

            if (l > p) {
                System.out.println("Element: " + n + " , ktorego szukasz, nie wystepuje w tablicy");
                break;
            }
            s = (l + p) / 2;
            if (a[s] == n) {
                System.out.println("Element: " + n + " , ktorego szukasz, wystepuje w tablicy, pod indeksem: " + s);
                flaga = false;
            } else if (a[s] < n) {
                l = s + 1;
            } else {
                p = s - 1;
            }
        }
    }
}

