/*
Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
a == b - если переменные равны
a < b - если переменная a меньше b
a > b - если переменная b меньше a
*/

public class HW_3_1_1{
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        System.out.println("a=" + a +" b="+ b);
        if (a == b) {
            System.out.println("a == b");
        }
        if (a > b) {
            System.out.println("a >= b");
        }
        if (a < b) {
            System.out.println("a <= b");
        }
    }
}
