import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Fibonacci {
	  public static void main(String[] args) 
	    {
		  
		  
		  
		  
		  Random rand;
		  int randomNum = rand.nextInt((1000 - 1) + 1) + 1;

		   System.out.println(randomNum);
		    
		    
		  /*	for (int m=8;m>1;m--)
		  		
		  	  {
			  for (int n=1;n<m;n++)
			  {
				  System.out.print(" ");
			  }
			 
			  for(int k = 8; k>=m;k--)
			  {
				  System.out.print("* ");
			  }
			  	 System.out.println("");
			  	 m=m-1;*/
		  	  
		  

	     
		  	  
		  	  
		  	  
		  	  
		  	  
		  	  
		  	  
		  	  
		  	  
		  	  
		  	  
		  	  
		  	  
		  	  
		  	  
		  	  
		  	  
		  	  
		  	  //to find fibonicci series
	     /*  int n, a = 0, b = 1, c ;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter value of n:");
	        n = s.nextInt();
	        System.out.print("Fibonacci Series:");
	        System.out.println(a);
	        System.out.println(b);
	        for(int i = 2; i <= n; i++)
	        {

	        		
	        		a=a+b;
	        		System.out.println(a);
	            	b=c;
	            	c=a;
	            
	        }
	        

	            
	           
	            c= a+b;
	            System.out.println(c);
	            a=b;
	            b=c;
	          
	        }*/
	         

		  //to remove junk chanracters
		 /* String str = "@#$&&&Anup";
		  System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));*/
		  
		  
		  //to find duplicate string in an array
		 /* String[] str = {"java","C","net","java"};
		  for(int i=0;i<str.length;i++){
			  for (int j=i+1;j<str.length;j++){
				  if (str[i].equals(str[j])){
					  System.out.println("duplicate string is:" +str[i]);
				  }
			  }
		  }*/
		  
		  //to find even odd
		  
		 /* int n = 24;
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
	     
			System.out.println(revString);*/
			
		  //to find number is prime
		  
		  /*int n =17;
		  int m =n/2;
		  int flag =0;
		  
		  if(n==0|n==1){
			  System.out.println("number is not prime");
		  }
		  for(int i=2;i<m;i++){
			  if(n%i==0){
				  System.out.println("number is not prime");
				  flag=1;
				  break;
				  
			  }
		  }
			  if(flag==0){
				  System.out.println("number is prime");
			  
		  }*/
		  
		  // to find largest number in an array
		  /*int[] numbers = {16,12,178,-98,746};
		  int largest = numbers[0];
		  
		  for (int i =0;i<numbers.length;i++){
			  if(numbers[0]<numbers[i]){
				  largest = numbers[i];
			  }
			  
		  }
		  System.out.println(largest);*/
		  
		  // to find missing number in an array
		  
		 /* int[] num = {1,2,3,4,6};
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
		 
		  */
		  //swapping of string
		/*  String a = "Anup";
		  String b = "Kumar";
		  String c = a+b; 
		  b=c.substring(0, c.length()-b.length());
		  a=c.substring(b.length());
		   System.out.println(a);
		   System.out.println(b);
		   */
		  
	
		  //reverse a number
		/*  int num =12345;
		  int rev =0;
		  while (num !=0){
		  int rem= (num%10);
		  rev = rev *10 + rem;
		  num = num/10;
		}
		  System.out.println(rev);*/
		  
		/*  String str = "verifying";
		  String str1 = "i";
		  int occur = 0;
		  for (int i =0 ; i<str.length();i++){
			if(Character.toString(str.charAt(i)).equals(str1)){
				occur++;
			}
			  
			  
		  }
		  System.out.println(occur);*/
		 
		 
		 /* public  void removeElement() {
			  
			  
			
			  ArrayList<String> list = new ArrayList<String>();
			  list.add("D");
			  list.add("X");
			  list.add("P");
			  list.add("X");
			  list.add("A");
			  list.add("X");
			  


			    for (int i =0;i<list.size();i++){
			        if (list.get(i)=="X"){
			        	
			        	list.set(i, "ABCD");
			        	}
			      
			    }
			    
		
			    System.out.println(list);
			 
			      String [] newArray = list.toArray(new String[list.size()+1]);
			      for(String str : newArray){
			    	  System.out.println(str);  
			      }
			      
			      
			        
			        for(int j=0;j<newArray.length;j++){
			        
			        	newArray[j+1] = newArray[j];
			        	System.out.println(newArray);
			        	
			        }
			        
			        
			        
			        	ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(newArray));
			        
			        
			        for (int k=0;k<arrayList.size();k++){
			        	if(arrayList.get(k).equals("ABCD")){
			        		arrayList.add("1");
			        	}
			        	System.out.println(arrayList.get(k));
			        }*/
			           
			        }
		  
		  
	    
		  


}
