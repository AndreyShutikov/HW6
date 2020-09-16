package by.HomeWork6;

public class Dog extends  Animal
{
    public Dog(String name) {
        super(name);
        this.type = "Cобака";
        this.maxRun = random.nextInt(300) + 400;
        this.maxSwim = random.nextInt(6) + 5;
        this.maxJump = Math.random() * 0.7 + 0.1;
    }

}
