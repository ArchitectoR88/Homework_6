package Homework_6;

public abstract class Animal {
    // Инициализируем переменные
    private int runMaxDistance; // Дистанция бега
    private int swimMaxDistance; // Дистанция плавания
    private float jumpMaxDistance; // Дистанция прыжка

    // Дергаем конструктор
    public Animal(int runMaxDistance, int swimMaxDistance, float jumpMaxDistance) {
        // Стучимся к самому классу Animal и его поле fullName
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
        this.jumpMaxDistance = jumpMaxDistance;
    }

    // Задаем 3 вида поведения, однако как они должны себя вести будет описано в самих классах, а не в Animal.
    public void run(int runDistance) { // Бегать
        System.out.println("run: " + (runDistance <= runMaxDistance));
    }
    public void swim(int swimDistance) { // Плыть
        System.out.println("swim: " + (swimDistance <= swimMaxDistance));
    }
    public void jump(float jumpHeight) { // Прыгать
        System.out.println("jump: " + (jumpHeight <= jumpMaxDistance));
    }
}
