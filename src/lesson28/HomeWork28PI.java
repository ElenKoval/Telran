package lesson28;

import myMethods.MyPrint;

public class HomeWork28PI {
    public static void main(String[] args) {
        MyPrint.print(makePi());// → [3, 1, 4]
    }

    private static int[] makePi() {
        int[] piArray = new int[3];
        double PI = Math.PI * 100;
        String piForArray = String.valueOf(PI);
//        piArray[0] = Integer.parseInt(piForArray.substring(0, 1));
//        piArray[1] = Integer.parseInt(piForArray.substring(1, 2));
//        piArray[2] = Integer.parseInt(piForArray.substring(2, 3));
        for (int i = 0; i < piArray.length; i++) {
            piArray[i] = Integer.parseInt(piForArray.substring(i, i + 1));
        }
        return piArray;
    }
}
