package by.HomeWork6;

public class Cat extends  Animal
{

        protected Cat(String name) {
            super(name);// наследуюемый признак
            this.maxJump = Math.random() * 0.7 + 0.8;
            this.maxRun = random.nextInt(100) + 100;
            this.type = "Кот";
        }

        @Override
        protected void swim(int dist)
        {
            System.out.println("Коты не умеют плавать");
        }
    }

