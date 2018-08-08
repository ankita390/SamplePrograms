import java.util.Scanner;

public class Fibonacci {
	  public static void main(String[] args) 
	    {
	      
	      //to find fibonicci series
	       int n, a = 0, b = 0, c = 1;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter value of n:");
	        n = s.nextInt();
	        System.out.print("Fibonacci Series:");
	        for(int i = 1; i <= n; i++)
	        {
	        		
	        		a=a+b;
	        		System.out.println(a);
	            	b=c;
	            	c=a;
	            
	        }
	        /*
		  //to remove junk chanracters
		  String str = "@#$&&&Anup";
		  System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
		  
		  
		  //to find duplicate string in an array
		  String[] str = {"java","C","net","java"};
		  for(int i=0;i<str.length;i++){
			  for (int j=i+1;j<str.length;j++){
				  if (str[i].equals(str[j])){
					  System.out.println("duplicate string is:" +str[i]);
				  }
			  }
		  }
		  
		  //to find even odd
		  
		  int n = 24;
		  if (n%2==0){
			  System.out.println("number is even");
		  }
		  else{
			  System.out.println("number is odd");
		  }
		  
		  
		  //reverse a string
		  String str = "Anup";
		  String revString = "";
	        for(int i=str.length()-1; i>=0; i--)
	        {
	        	  revString = revString + str.charAt(i);
	        }
	     
			System.out.println(revString);
			
		  //to find number is prime
		  
		  int n =17;
		  int m =n/2;
		  int flag =0;
		  
		  if(n==0|n==1){
			  System.out.println("number is not prime");
		  }
		  for(int i =0;i<m;i++){
			  if(n%i==0){
				  System.out.println("number is not prime");
				  flag=1;
				  
			  }
			  if(flag==0){
				  System.out.println("number is prime");
			  }
		  }
		  
		  // to find largest number in an array
		  int[] numbers = {16,12,178,-98,746};
		  int largest = numbers[0];
		  
		  for (int i =0;i<numbers.length;i++){
			  if(numbers[0]<numbers[i]){
				  largest = numbers[i];
			  }
			  
		  }
		  System.out.println(largest);
		  
		  // to find missing number in an array
		  
		  int[] num = {1,2,3,4,6};
		  int sum =0;
		  int totalSum =0;
		  for (int i =0;i<num.length;i++){
			  sum = sum + num[i];
		  }
		  for (int j=0;j<=6;j++){
			  totalSum = totalSum+j;
		  }
		  int missingNum = totalSum - sum;
		  System.out.println(missingNum);
		 
		  
		  //swapping of string
		  String a = "Anup";
		  String b = "Kumar";
		  String c = a+b; 
		  b=c.substring(0, c.length()-b.length());
		  a=c.substring(b.length());
		   System.out.println(a);
		   System.out.println(b);
		   
		  
	
		  //reverse a number
		  int num =12345;
		  int rev =0;
		  while (num !=0){
		  int rem= (num%10);
		  rev = rev *10 + rem;
		  num = num/10;
		}
		  System.out.println(rev);
		  
		  
		  String str = "verifying";
		  String str1 = "i";
		  int occur = 0;
		  for (int i =0 ; i<str.length();i++){
			  str1.regionMatches(true, i, str1, 0, str.length());
			  
		  }
		 */
		 
		  
	    }
		  

}
