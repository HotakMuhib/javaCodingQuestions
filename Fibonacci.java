package javaCodingQuestion;

public class Fibonacci {
/*
write a java program to print fibonacci series of a given number
 */


    public static void printFib(int count) {
        int start = 0;
        int current = 1;
        int next;

        for (int i=1; i<=count; i++) {
            System.out.print(start+" ");
            next = start + current;
            start = current;
            current = next;
        }
    }
    public static void main(String[] args) {
       printFib(10);


    }
}
