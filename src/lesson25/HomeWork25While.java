package lesson25;

public class HomeWork25While {
    public static void main(String[] args) {
        aPrintBTimes(10,6);
        printFromAtoB(5, 17);
    }

    private static void printFromAtoB(int a, int b) {
        int printNum = 0;
        do {
            System.out.println(a);
            a++;
        }
        while (a <= b);
    }

    private static void aPrintBTimes(int a, int b) {
        int count = 0;
        do {
            System.out.println(a);
            count++;
        }
        while (count < 6);
    }
}
