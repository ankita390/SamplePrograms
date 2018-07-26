import java.sql.Timestamp;
import java.text.SimpleDateFormat;  
import java.util.Date;   
import java.util.Random;
import java.util.Scanner;

import org.testng.annotations.Test;

public class TestArray {
	@Test
	

	public void hello() {
		
	/*	 SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy");  
		    Date date = new Date();  
		    System.out.println(formatter.format(date));  
	}*/
		
				System.out.println("Enter the string");
		        Scanner scr = new Scanner(System.in);
		        String str = scr.nextLine();
		        String revString = "";
		        for(int i=str.length()-1; i>=0; i--)
		        {
		        	  revString = revString + str.charAt(i);
		        }
		     
				System.out.println(revString);
		    }
		
		int i,j,k=1;
		{
		
		for (i=0;i<5;i++){
			for(j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (i=0;i<5;i++){
			for(j=0;j<=k;j++){
				System.out.print("* ");
			}
			k=k+2;
			System.out.println();
		}
		for (i=0;i<5;i++){
			for(j=0;j<k+7;j++){
				System.out.print("");
			}
			k=k-(-5);
			System.out.println("* ");
		}
		
		for(i=5;i>0;i--){
			for(j=0;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=5;k<=i;k--){
				System.out.println("*");
			}
		
		
		}
		
		
		int[] x=new int[3];
		System.out.println(x);
		System.out.print(x[0]);
		System.out.print(x[1]);
		System.out.print(x[2]);
	}

}
