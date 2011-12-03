package printSomething;

import java.util.Random;

import javax.swing.JOptionPane;

public class PrintSomething {
	public static void main(String[] args) {
		
		String n=JOptionPane.showInputDialog("What is your base number?");
		int num=Integer.parseInt(n);
		num=randomSubtract(num);
		
		//Take for example, num=0 currently. This code will print out "The number is :0".
		//How can we fix this code to ensure that it only will print positive integers?
		//-----------------------------------------------------------------------------------
		do{
			System.out.println("The number is :"+num);
			num--;
		}while(num>0);
		
		//-----------------------------------------------------------------------------------
		System.out.println("The number you entered has been reduced less than 0");
		
	}
	
	//Randomly subtracts a number from num. If num=100, then the number subtracted from it could be 110.
	public static int randomSubtract(int num){
		Random randy=new Random();
		num=num-randy.nextInt(num+30);
		return num;
	}
}
