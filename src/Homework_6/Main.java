package Homework_6;
// 1. Создать классы Собака и Кот с наследованием от класса Животное.
// 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
// В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
// 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
// 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
// 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

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
