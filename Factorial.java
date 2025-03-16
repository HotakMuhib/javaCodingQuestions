package javaCodingQuestion;

public class Factorial {

    /*
    write a java program to find factorial of a given number
     */
    public static void main(String[] args) {
        int num = 4;
        int factorial = 1;
        for (int i=1; i<=num; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
