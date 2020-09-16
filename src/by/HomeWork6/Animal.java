package by.HomeWork6;

import java.util.Random;

public  class Animal
{

        protected  String name;
        protected String type;
        protected int maxRun;
        protected int maxSwim;
        protected double maxJump;
        protected Random random = new Random();

        protected Animal(String name){
            this.name = name;
        }

        protected void run(int dist) {
            if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " " +  "бегает "  + dist + " м." +"(максимальное растояние - " + maxRun +") ");
                else System.out.println(this.type + " " + this.name + " " + dist + " -  не допустимый диапазон для бега.(максимальное растояние) - " + maxRun);
        }

        protected void swim(int dist) {
            if (this.maxSwim >= dist) System.out.println(this.type + " " + this.name + " плавает " + " " + dist + " м." +"(максимальное растояние - " + maxSwim +") ");
            else System.out.println(this.type + " " + this.name + " " + dist + "- не допустимый диапазон для плавания.(максимальное растояние) -  " + maxSwim);
        }

        protected void jump(double height) {

            if (this.maxJump >= height)
                System.out.println(  this.type + " " + this.name + " прыгает(максимальное " + maxJump+") " + height + " м.");
            else System.out.println(this.type + " " + this.name + " " + height +" - не допустимый диапазон для прыжка (максимальное " + maxJump+")");
        }

        public void info() { // выводит сведения об объекте в разрезе дейсвтий
            System.out.println(this.type + " " + this.name + " пробежал: " + this.maxRun + " м., проплыл " + this.maxSwim + " М., прыгнул на: " + this.maxJump + " м.");
        }
    }

