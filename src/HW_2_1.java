/*
Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и
вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление и остаток
от деления. Также сделать проверку на четность этих переменных и вывести результат.
*/

public class HW_2_1  {
    public static void main(String[] args) {
        int a = 78;
        int b = 95;

        System.out.println( a + b );
        System.out.println( a * b );
        System.out.println( a - b );
        System.out.println( 1.0 * a / b );
        System.out.println( a % b );
        System.out.println( a % 2 );
        System.out.println( b % 2 );
    }
}