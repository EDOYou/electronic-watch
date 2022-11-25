package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();

        int secs, mins, hours;
        hours = in / 3600 % 24;
        mins = in % 3600 / 60;
        secs = in % 3600 % 60;
        System.out.printf("%d:%02d:%02d", hours, mins, secs);
    }
}