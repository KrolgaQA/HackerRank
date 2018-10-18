package ru.hack;

public class StringIntro {
    public static String checkHex(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > b.charAt(i)) {
                return "Yes";
            } else {
                return "No";
            }
        }
        return "No";
    }
}
