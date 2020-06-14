package academy.learnprogramming.challenge9.javacode;

import academy.learnprogramming.challenge9.kotlincode.Challenge;
import academy.learnprogramming.challenge9.kotlincode.KotlinEmployee;
import academy.learnprogramming.challenge9.kotlincode.KotlinStuff;

public class Main {

    public static void main(String[] args) {

        KotlinStuff.sayHelloToJava("Student");

        KotlinEmployee employee1 = new KotlinEmployee("John", "Smith", 2010);
        employee1.startYear = 2009;

        Challenge.doMath(5, 4);

        employee1.takesDefault(null);

    }

}
