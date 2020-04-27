import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any Value : ");
        String givenString = input.nextLine();
        int output = givenString.length();
        boolean isPalindrome = true;
        for(int index =0 ; index <= output/2;index++){
            if(givenString.charAt(index) != givenString.charAt(output-index -1)){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
                System.out.println("Given input is a palidrome.");
            }
        else
            {
                System.out.println("Given input is not a palidrome.");
            }
    }

}
 /*   int length = givenString.length();
        char[] output = new char[givenString.length()];
        for (int index = length -1;index>=0;index--) {
             output[index] = givenString.charAt(index);
        }
        String outputString = new String(output);
        System.out.println(outputString);*/