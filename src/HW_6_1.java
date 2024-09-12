/*
Задача №1
Необходимо создать класс Employee со следующими методами:
getBaseSalary - получить базовую ставку
setBaseSalary
getName - получить имя
setName
getSalary - получить зарплату

Задача №2
Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.
Необходимо создать класс Manager в который нужно добавить следующие методы:
getNumberOfSubordinates - получить количество подчиненных
setNumberOfSubordinates

в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.

Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
Если количество подчиненных 0, то результат как у обычного рабочего.

Задача №3
Необходимо создать утилитарный класс (класс только со статическими полями и методами) со следующими методами:
поиск сотрудника в массиве по его имени
поиск сотрудника в массиве по вхождению указанной строки в его имени
подсчет зарплатного бюджета для всех сотрудников в массиве
поиск наименьшей зарплаты в массиве
поиск наибольшей зарплаты в массиве
поиск наименьшего количества подчиненных в массиве менеджеров
поиск наибольшего количества подчиненных в массиве менеджеров
поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
*/

import java.util.Arrays;


public class HW_6_1 {
    static double BaseSalary = 100;
    static int NumberOfSubordinates = 3;
    static String[] Employees = new String[]{"Michelle, Nicholas, Petr, Paul, Matthew"};


    public static void main(String[] args) {
        Employee ivan = new Employee();
        ivan.setBaseSalary(40);
        ivan.setName("Ivan Petrov");
        Worker Mike = new Worker();
        Director firstDirector = new Director();
        Manager firstManager = new Manager();
        System.out.println("Зарплата рабочего " + BaseSalary);
        System.out.println("Количество рабочих " + NumberOfSubordinates);
        System.out.println("Зарплата директора " + firstDirector.getSalary());
        System.out.println("Зарплата менеджера " + firstManager.getSalary());
        System.out.printf("у Менеджера %d подчиненных", NumberOfSubordinates);
        MyUtilites.myPrint();
        System.out.println(Arrays.toString(Employees));

    }

    static final class MyUtilites {
        public static void myPrint() {
            System.out.println("\n\n!!!!!\nmyFirstUtil");
        }
    }

    static class Employee {
        String name;

        public double getBaseSalary() {
            return BaseSalary;
        }

        public void setBaseSalary(int x) {
            BaseSalary = x;
        }

        public String getName() {
            return name;
        }

        public void setName(String x) {
            name = x;
        }

    }

    static class Worker {
        public double getSalary() {
            return BaseSalary;
        }

    }

    static class Manager {
        public double getNumberOfSubordinates() {
            return NumberOfSubordinates;
        }

        public void setNumberOfSubordinates(int numberOfSubordinates) {
            NumberOfSubordinates = numberOfSubordinates;
        }

        public double getSalary() {
            if (NumberOfSubordinates != 0) {
                return BaseSalary * ((double) NumberOfSubordinates / 100 * 3);
            } else {
                return BaseSalary;
            }
        }

    }

    static class Director {
        public double getNumberOfSubordinates() {
            return NumberOfSubordinates;
        }

        public void setNumberOfSubordinates(int numberOfSubordinates) {
            NumberOfSubordinates = numberOfSubordinates;
        }

        public double getSalary() {
            if (NumberOfSubordinates != 0) {
                return BaseSalary * ((double) NumberOfSubordinates / 100 * 9);
            } else {
                return BaseSalary;
            }
        }
    }
}





