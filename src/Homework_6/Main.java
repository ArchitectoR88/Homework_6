package Homework_6;

public class Main {
    // В абстрактном классе мы пишем правила для всех животных (общее поведение для всех животных) и любой объект который
    // хочет стать животным, обязан следовать этим правилам.
    public static void main(String[] args) {
        System.out.println("Кошка Мурка: ");
        Animal murka = new Cat(200,2,2);
        murka.run(200);
        murka.swim(3);
        murka.jump(2);
        System.out.println();

        System.out.println("Собака Мухтар: ");
        Animal muhtar = new Dog(400,10,0.5f);
        muhtar.run(400);
        muhtar.swim(10);
        muhtar.jump(0.5f);
        System.out.println();

        System.out.println("Собака Арчи: ");
        Animal archi = new Dog(600,10,0.5f);
        archi.run(700);
        archi.swim(10);
        archi.jump(0.5f);
    }
}
