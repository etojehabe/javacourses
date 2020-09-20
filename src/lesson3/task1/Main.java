package lesson3.task1;

import lesson3.task3.Student;

public class Main {
    public static void main(String[] args) {

        Phone[] phones = new Phone[3];
        phones[0] = new Phone(111111, "IPhone", 0.7);
        phones[1] = new Phone(222222, "Xiaomi", 0.8);
        phones[2] = new Phone(333333, "Samsung", 0.9);

        phones[0].receiveCall("Vasya");
        phones[1].receiveCall("Oleg");
        phones[2].receiveCall("Marina");
        System.out.println();
        phones[0].receiveCall("Vasya", 555555);
        phones[1].receiveCall("Oleg", 666666);
        phones[2].receiveCall("Marina", 777777);
        System.out.println();


        for (Phone phone : phones) {
            System.out.println("Номер телефона: " + phone.getNumber());
            System.out.println("Модель телефона: " + phone.getModel());
            System.out.println("Вес телефона: " + phone.getWeight());
            System.out.println();
        }

        System.out.println();

        phones[0].sendMessage(2222, 2222, 3333, 4444, 5555);

    }
}
