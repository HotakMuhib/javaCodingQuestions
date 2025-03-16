package javaCodingQuestion;

import java.util.Locale;
import java.util.Scanner;

public class CheckIfVowelIsPresent {
/*
write a java program to check if a vowel is present in a class or not.
 */
    public static boolean stringContainVowel(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }


    public static void main(String[] args) {

        String m = "hh";
        System.out.println(stringContainVowel(m));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your string to check if it contains any vowel?");
//        String str = sc.nextLine();
//        if(stringContainVowel(str)) {
//            System.out.println("this string contains at least one vowel");
//        } else {
//            System.out.println("it doesn't contain any vowel");
//        }
        //System.out.println(stringContainVowel(str));
    }
}












/*
public static boolean stringContainVowel(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
 */