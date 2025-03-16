package javaCodingQuestion;

public class CheckOnlyOddNum {
    /*
    write a java program to check if a list of integers contains only odd numbers
     */

    public static void main(String[] args) {
        int[] num = {1,3,5};
        for (int i=1; i<num.length; i++) {
            if (i %2 ==0) {
                System.out.println("list contains odd and even numbers");
                break;
            }
            if (i%2!=0) {
                System.out.println("list contains only odd numbers");
            }

        }
    }
}
