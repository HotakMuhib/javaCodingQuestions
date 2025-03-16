package javaCodingQuestion;

public class SwapTwoNumbers {
    /*
    how do you swap 2 numbers without using a third variable
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        a = a +b; //15
        b = a -b;
        a = a-b;
        System.out.println("a " + a);
        System.out.println("b " + b);

    }
}
