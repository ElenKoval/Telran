package lesson24;

public class HomeWork24Pallindrom {
    public static void main(String[] args) {
        System.out.println(checkPallindrom(newStringNoSpace("А роза упала на лапу Азора")));// -> true
        System.out.println(checkPallindrom(newStringNoSpace("поп")));//-> true
        System.out.println(checkPallindrom(newStringNoSpace("школа")));// -> false
        System.out.println(checkPallindrom(newStringNoSpace("аффффа")));// -> true
        System.out.println(checkPallindrom(newStringNoSpace("retts")));// -> false
        System.out.println(checkPallindrom(newStringNoSpace("Retter")));// -> true
    }

    public static String newStringNoSpace(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    public static boolean checkPallindrom(String newStr) {
        String newStrOne = "";
        for (int i = newStr.length() - 1; i >= 0; i--) {
            newStrOne += newStr.charAt(i);
        }
        return newStrOne.equalsIgnoreCase(newStr);
    }
}

