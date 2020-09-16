/**1. Создать классы Собака и Кот с наследованием от класса Животное.
 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.*/
package by.HomeWork6;

 public   class MainClass
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Мурка");

        Dog dog1 = new Dog("Мухтар");
        Dog dog2 = new Dog("Шарик");


        System.out.println();
        dog1.run(400);
        dog1.swim(5);
        dog1.jump(0.7);
        System.out.println();
        dog2.run(600);
        dog2.swim(2);
        dog2.jump(0.3);
        System.out.println();
        cat1.run(1700);
        cat1.swim(5);
        cat1.jump(2.7);
        System.out.println();
        cat2.run(200);
        cat2.swim(5);
        cat2.jump(1.7);
        System.out.println();
    }
    }

