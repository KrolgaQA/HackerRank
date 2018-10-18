package ru.hack;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\r\n\t");
        int numOfLines = 1;
        while (sc.hasNext()) {
            try {
                System.out.println(numOfLines + " " + sc.nextLine());
                numOfLines++;
            } catch (Exception e) {
                System.out.println(sc.next());
            }

        }
    }
}
