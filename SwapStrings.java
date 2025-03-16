package javaCodingQuestion;

public class SwapStrings {
    /*
    write a java program to swap two strings without using a temp variable

     */
    public static void main(String[] args) {
        String s = "hello";
        String m = "Muhib";

        s = s+m;
        m=s.substring(0,(s).length()-(m).length());
        s=s.substring(m.length());
        System.out.println(s);
        System.out.println(m);
    }
}
