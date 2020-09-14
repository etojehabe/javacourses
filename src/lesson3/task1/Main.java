package lesson3.task1;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone(111111, "IPhone", 0.7);
        Phone phone2 = new Phone(222222, "Xiaomi", 0.8);
        Phone phone3 = new Phone(333333, "Samsung", 0.9);

        phone1.receiveCall("Vasya");
        phone2.receiveCall("Oleg");
        phone3.receiveCall("Marina");
        System.out.println();
        phone1.receiveCall("Vasya", 555555);
        phone2.receiveCall("Oleg", 666666);
        phone3.receiveCall("Marina", 777777);
        System.out.println();


        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());
        System.out.println();
        System.out.println(phone2.getNumber());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());
        System.out.println();
        System.out.println(phone3.getNumber());
        System.out.println(phone3.getModel());
        System.out.println(phone3.getWeight());
        System.out.println();
        phone1.sendMessage(2222, 2222, 3333, 4444, 5555);

    }
}
