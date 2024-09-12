/*
Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
 */

public class HW_3_2_2 {
    public static void main(String[] args) {
        int result = 5;
        for (int i = 1; i <= 15; i++) {
            if (result >= 10000) break;
            System.out.println("5 ** " + i + " = " + result);
            result = result * 5;
        }
    }
}
