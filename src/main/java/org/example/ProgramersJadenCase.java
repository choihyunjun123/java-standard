package org.example;

public class ProgramersJadenCase {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
//        String k = s.toLowerCase();
//        String answer = "";
//        answer += Character.toUpperCase(k.charAt(0));
//        for (int i = 1; i < k.length(); i++) {
//            if (k.charAt(i - 1) == ' ') {
//                answer += Character.toUpperCase(k.charAt(i));
//            } else {
//                answer += k.charAt(i);
//            }
//        }
//        System.out.println(answer);
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for (String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }
        System.out.println(answer);
    }
}