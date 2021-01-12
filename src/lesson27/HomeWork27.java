package lesson27;

public class HomeWork27 {
    public static void main(String[] args) {
//        System.out.println(blackjack(19, 21));// → 21
//        System.out.println(blackjack(21, 19));// → 21
//        System.out.println(blackjack(19, 22));// → 19
//        System.out.println(blackjack(23, 22));// → 0
//        System.out.println(loneSum(1, 2, 3));// → 6
//        System.out.println(loneSum(3, 2, 3));// → 2
//        System.out.println(loneSum(3, 3, 3));// → 0
//        System.out.println(loneSum(1, 3, 3));// → 1
//        System.out.println(starOut("ab*cd"));// → "ad"
//        System.out.println(starOut("ab**cd"));// → "ad"
//        System.out.println(starOut("sm*eilly"));// → "silly"
//        System.out.println(starOut("sm*ei**lly"));// → "sly"
//        System.out.println(starOut("sm*eil*ly"));// → "siy"
        System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2
    }

    private static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i')
//            if (str.startsWith("hi", i))
                count += 1;
        }
        return count;
    }

    private static String starOut(String str) {
        //работает только с заданными условиями. поломается например, на  "sm*eil*ly" → "siy" (a выдаст sy)
        String newWord = "";
        newWord = str.substring(0, str.indexOf('*') - 1) + str.substring(str.lastIndexOf('*') + 2);
        return newWord;
    }


    private static int loneSum(int a, int b, int c) {
        int sum = a + b + c;
        if (a != b && b != c && c != a) {
            sum = sum;
        } else if (a == b && b == c) {
            sum = sum - a - b - c;
        } else if (a == b) {
            sum = c;
        } else if (a == c) {
            sum = b;
        } else if (b == c) {
            sum = a;
        }
        return sum;
    }

    private static int blackjack(int a, int b) {
        if (a > 21 & b > 21) {
            return 0;
        } else if (a == 21 && b <= 21) {
            return a;
        } else if (b == 21 && a <= 21) {
            return b;
        }
        return a;
    }
}

