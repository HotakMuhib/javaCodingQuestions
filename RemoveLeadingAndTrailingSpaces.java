package javaCodingQuestion;

public class RemoveLeadingAndTrailingSpaces {
    /*
    how do you remove leading and trailing spaces from a string
     */
    public static void main(String[] args) {
        String str = "    Hello  how   ";
        System.out.println(str);
        System.out.println(str.trim());
        //System.out.println(str.strip());
    }
}
