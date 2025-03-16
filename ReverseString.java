package javaCodingQuestion;

public class ReverseString {
    /*
    How do you reverse a String in Java?
     */
    public static String revString(String input) {
        if (input.equals("") || input.equals(" ")) {
            System.out.println("String has no value");
        }
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str="Hi";
        System.out.println(revString(str));
    }
}
