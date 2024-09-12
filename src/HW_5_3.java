/*
Вывести следующие строки с соответствующим форматированием (как пирамиды):
Задача №1
0 1 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8
0 1 2 3 4 5 6 7
0 1 2 3 4 5 6
0 1 2 3 4 5
0 1 2 3 4
0 1 2 3
0 1 2
0 1
0

Задача №2
0 1 2 3 4 5 6 7 8 9
  0 1 2 3 4 5 6 7 8
    0 1 2 3 4 5 6 7
      0 1 2 3 4 5 6
        0 1 2 3 4 5
          0 1 2 3 4
            0 1 2 3
              0 1 2
                0 1
                  0

Задача №3
9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
  8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
    7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
      6 5 4 3 2 1 0 1 2 3 4 5 6
        5 4 3 2 1 0 1 2 3 4 5
          4 3 2 1 0 1 2 3 4
            3 2 1 0 1 2 3
              2 1 0 1 2
                1 0 1
                  0
*/

public class HW_5_3 {

    public static void main(String[] args) {

        System.out.println("Задача №1: \n");
        for (int i = 10; i > -1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Задача №2: \n");
        for (int i = 10; i > -1; i--) {
            String temp = "";
            for (int j = 0; j < i; j++) {
                temp += (j + " ");
            }
            System.out.format("%20s ", temp + "\n");
        }

        System.out.println("Задача №3: \n");
        for (int i = 0; i < 10; i++) {
            String temp = "";
            String temp2 = "";
            for (int j = 9; j > i; j--) {
                temp += (j - i + " ");
                temp2 += ((10 - j) + " ");
            }
            System.out.format("%17s0 %s\n ", temp, temp2);
        }
    }
}