package lesson28;

import myMethods.MyPrint;

public class HomeWork28 {
    public static void main(String[] args) {
//        System.out.println(roundSum(16, 17, 18));// → 60
//        System.out.println(roundSum(12, 13, 14));// → 30
//        System.out.println(roundSum(6, 4, 4));// → 10
//        System.out.println(roundSum(15, 4, 4));// → 20
//        System.out.println(roundSum(25, 4, 4));// → 30
//        System.out.println(roundSum(35, 15, 4));// → 60
        System.out.println(endOther("Hiabc", "abc"));// → true
        System.out.println(endOther("AbC", "HiaBc"));// → true
        System.out.println(endOther("abc", "abXabc"));// → true
        
    }

    private static boolean endOther(String str1, String str2) {
        String wordOneNew = str1.toLowerCase();
        String wordTwoNew = str2.toLowerCase();
        return (wordOneNew.endsWith(wordTwoNew) || wordTwoNew.endsWith(wordOneNew));
    }

    private static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private static int round10(int num) {
        int roundNum = 0;
        for (int i = 1; i < 5; i++) {
            if ((num - i) % 10 == 0) {
                roundNum = num - i;
            } else if ((num + i) % 10 == 0) {
                roundNum = num + i;
            } else if (num % 5 == 0) {
                roundNum = num + 5;
            }
        }
        return roundNum;
    }
}
