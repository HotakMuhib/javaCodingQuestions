package javaCodingQuestion;

public class Palindrome  {

/*
write a java program to check if a string is palindrome
 */
    public static String revString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "HiH";
        String revStr = revString(s);
        System.out.println(revStr);
        if(s.equals(revStr)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
