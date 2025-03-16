package javaCodingQuestion;

public class PrimeNumber {
    /*
    write a java program to check if a number is prime or not
     */
    public static boolean isPrime(int number) {
        if (number <=1) return false;

        for (int i=2; i<number; i++) {
            if (number %i ==0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
}



















//    public static void main(String[] args) {
//        //int num = 7;
//        System.out.println(isPrime(7));
////        boolean isPrime = true;
////
////        if (number >1) {
////            for(int i=2; i<number; i++) {
////                if(number %i ==0) {
////                    isPrime = false;
////                    break;
////                }
////            }
////        }
////        else {
////            isPrime = false;
////        }
////        System.out.println("the given number is " + isPrime);
//
//public static boolean isPrime(int given) {
//    if (given <= 1) return false;
////        if (given == 2 || given == 3) return true;
////        if (given % 2 == 0) return false; // Eliminate even numbers
//
////        for (int i = 3; i * i <= given; i += 2) { // Check odd numbers up to sqrt(n)
//    for (int i=2; i<given; i++) {
//        if (given % i == 0) {
//            return false;
//        }
//    }
//    return true;
//}
//    }

