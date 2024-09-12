/*
Задача со звездочкой
Дан массив из десяти произвольных целых чисел (например, { 1, 2, …, 9, 10 } )
Необходимо изменить порядок элементов массива на противоположный (т.е. чтобы получилось { 10, 9, …, 2, 1 } ). Не НАПЕЧАТАТЬ в обратном порядке, а переставить элементы массива.
*/

public class HW_4_4 {
    public static void main(String[] args) {
        int[] array;
        array = new int[11];
        for (int i=0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 110);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < array.length/2; i++){
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        for (int i: array){
            System.out.print(i + " ");
        }
    }
}

