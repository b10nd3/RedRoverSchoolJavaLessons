public class Cat {

    static int counter = 0;
    static int counter2 = 0;
    String name;
    int age;

    public Cat(String name, int age) {

        this.name = name;
        this.age = age;
        counter++;
    }

    public Cat(int age) {
        this.age = age;
        counter2++;
    }

    public static void main(String[] args) {
        int numberOfCats = 100;

        Cat[] array = new Cat[numberOfCats];
        for (int i = 0; i < numberOfCats; i++) {
            if (i % 2 == 0) {
                array[i] = new Cat("barsik" + i, i);
            } else {
                array[i] = new Cat("delitsaNaTri", i);
            }
        }

        for (int i = 0; i < numberOfCats; i++) {
            System.out.println(array[i].name + " " + array[i].age);
        }
        System.out.println(counter);
        System.out.println(counter2);
    }
}