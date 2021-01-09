package lesson25;

import lesson13.BMI;

import java.util.Scanner;

public class HomeWork25BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Пожалуйста, введите Ваш вес, в киллограммах ");
        double weight = input.nextDouble();
        double high;
        System.out.println("Пожалуйста, введите Ваш рост, в сантиметрах");
        high = input.nextDouble() / 100;
        double BMI;
        BMI = weight / (high * high);
        double tempBMI = BMI * 10;
        int intBMI = (int) tempBMI;
        BMI = (double) intBMI / 10;
        if (BMI <= 16) {
            System.out.println("Ваш индекс массы равен " + BMI);
            System.out.println("Выраженный дефицит массы тела");
        } else if (BMI <= 18.5) {
            System.out.println("Ваш индекс массы равен " + BMI);
            System.out.println("Недостаточная (дефицит) масса тела");
        } else if (BMI <= 25) {
            System.out.println("Ваш индекс массы равен " + BMI);
            System.out.println("Норма");
        } else if (BMI <= 30) {
            System.out.println("Ваш индекс массы равен " + BMI);
            System.out.println("Избыточная масса тела (предожирение)");
        } else if (BMI <= 35) {
            System.out.println("Ваш индекс массы равен " + BMI);
            System.out.println("Ожирение");
        } else if (BMI <= 40) {
            System.out.println("Ваш индекс массы равен " + BMI);
            System.out.println("Ожирение резкое");
        } else {
            System.out.println("Ваш индекс массы равен " + BMI);
            System.out.println("Очень резкое ожирение");
        }
    }
}
