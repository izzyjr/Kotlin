package academy.learnprogramming.javacode;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Car {

    private String color;
    private String model;
    private int year;
    private Object javaObject;
    public static int x = 5;

    public Car(String color, String model, int year, Object anobject) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.javaObject = anobject;
    }

    public void demoMethod(Runnable r) {

        new Thread(r).start();

//        new Thread( () -> System.out.println("I'm in a thread") ).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("I'm in a thread");
//            }
//        }).start();
    }

    public static String xString() {
        return "This is x: " + x++;
    }

    public Object getJavaObject() {
        return javaObject;
    }

    public void setJavaObject(Object javaObject) {
        this.javaObject = javaObject;
    }

    public @NotNull String getColor() {
        return color;
    }

    public void setColor(@NotNull String color) {
        this.color = color;
    }

    public @Nullable String getModel() {
        return model;
    }

    public void setModel(@Nullable String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void variableMethod(int num, String... strings) {
        for (String string: strings) {
            System.out.println(string);
        }
    }

    public void wantsIntArray(int[] theArray) {
        for (int i: theArray) {
            System.out.println("Here's the int: " + i);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
