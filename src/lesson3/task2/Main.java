package lesson3.task2;

public class Main {
    public static void main(String[] args) {

        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Мясо", "Дом в деревне", "Дворняга");
        animals[1] = new Cat("Рыба", "Квартира");
        animals[2] = new Horse("Отруби", "Ипподром");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
