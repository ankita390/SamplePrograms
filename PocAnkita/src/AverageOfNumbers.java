import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the max value of the range : ");
        int numbers = input.nextInt();
        int sumOfEvenNumbers = 0 ;
        int sumOfOddNumbers = 0 ;
        double countOfEvenNumbers = 0;
        double countOfOddNumbers = 0;
        for(int index = 1 ; index <= numbers;index++){
           if (index%2 == 0){
                sumOfEvenNumbers = sumOfEvenNumbers + index;
                countOfEvenNumbers +=1;
            }
           else{
               sumOfOddNumbers = sumOfOddNumbers + index;
               countOfOddNumbers +=1;

           }
        }
        System.out.println("Sum of even no is " + sumOfEvenNumbers);
        System.out.println("Sum of odd no is " + sumOfOddNumbers);
        System.out.println("Count of even no is "+ countOfEvenNumbers);
        System.out.println("Count of odd no is "+ countOfOddNumbers);
        double averageOfEvenNumbers = sumOfEvenNumbers/countOfEvenNumbers;
        double averageOfOddNumbers = sumOfOddNumbers/countOfOddNumbers;

        System.out.println("The Average of even numbers in the range : " + averageOfEvenNumbers);
        System.out.println("The Average of odd number in the range : " + averageOfOddNumbers);

    }


}