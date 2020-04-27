public class CountNumbers {

    public static void main(String[] args) {

        int countOddNumbers = 0;
        int countEvenNumbers = 0;

        int num;
        for (num=1;num<=1000;num++){
            if(num%2==0){
                countEvenNumbers +=1;
            }
           else {
               countOddNumbers += 1;
            }

        }
        System.out.println("Total no. of Evens " +countEvenNumbers);
        System.out.println("Total no. of Odds " +countOddNumbers);
    }


}
