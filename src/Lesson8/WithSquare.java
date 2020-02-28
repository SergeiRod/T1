package Lesson8;

public interface WithSquare {
    public static final double MY_PI = 3.14; // переменные в интерфейсе public static final, можно опустить
    double calculateSquare(); // метод всегда без боди и всегда public

    default void printFromInterface () {
        System.out.println("Hello from Interface");
    }

}
