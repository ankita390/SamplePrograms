import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Please enter the Max value of the range : ");
        int dividend = value.nextInt();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the divisor : " );
        int divisor = input.nextInt();
        for(int index = 0 ; index <=dividend;index ++){
            double modulus = index%divisor;
            System.out.println(index + " % " + divisor + " = " + modulus );
        }
    }
}
