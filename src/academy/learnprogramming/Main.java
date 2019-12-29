package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Reversed number= " + isPalindrome(707));

    }

    public static boolean isPalindrome(int number){

        int reversed = 0;
        int num = number;

        while(number != 0){
            int lastDigit = number % 10;
            reversed = reversed * 10;
            reversed += lastDigit;
            number /= 10;
        }
        if(num == reversed){
            return true;
        } else {
            return false;
        }
    }
}
