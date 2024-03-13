package OOPS;

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Bank{
	Scanner sc=new Scanner(System.in);
	int bal=10000;
	int acc_num=12345;
	int pass=1212;
	
	SimpleDateFormat formate=new SimpleDateFormat(" dd/MM/yyyy \n HH:mm:ss ");
	Date date= new Date();
//    void details() {
////		Scanner sc=new Scanner(System.in);
//	int bal=10000;
//	System.out.println("Enter the Account No.");
//	int acc_num=sc.nextInt();
////		int acc_num=12345;
//
//		System.out.println("Enter the 4 digit PIN CODE");
//	     	int pass=sc.nextInt();
////		int pass=1212;
////	}
}

class Balance extends Bank{
	void show() {
		System.out.println("Your Curreent balance is: Rs"+bal);
		System.exit(0);
	}
}

class Deposite extends Balance{
	
	void dep() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Deposite amount: ");
		int d=sc1.nextInt();
		System.out.println("Enter the Passcode: ");
		int pswd=sc1.nextInt();
		if (pswd==pass) {
		bal+=d;
		System.out.println("Deposited Successfully........");
		System.out.println("Balance amount is : "+bal);
		}
		else {
			System.out.println("Incorrect Passcode!!!!!");
		}
		System.exit(0);
	
	}
}

class Withdraw extends Deposite{
	void wit() {
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the Withdraw amount: ");
		int w=sc2.nextInt();
		System.out.println("Enter the Passcode: ");
		int pswd=sc2.nextInt();
		if (pswd==pass) {
		bal-=w;
		System.out.println("Withdaw Successfully.......");
		System.out.println("Balance amount is : "+bal);
		}
		else {
			System.out.println("Invalid Passcode!!!!!!");
		}
		System.exit(0);
	}
}

class Receipt extends Withdraw{
	void recp() {
		System.out.println("Thank You For Visiting........ ");
		System.out.println("Address: Group no.2 Opposite to PD Hall,\n Vikhroli. ");
		System.out.println("Branch: Vikhroli(East)");
		System.out.println(formate.format(date));
		System.out.println("Your Net Balance is: Rs"+bal);
		System.exit(0);
	}
}

class Exit extends Receipt{
	void exit() {
		System.out.println("Thank You For Visiting us........ ");
		System.exit(0);
	}
}



public class ATM {

	public static void main(String[] args) {
//		Bank d=new Bank();
		Exit app=new Exit();
		
		while(true) {;
//			System.out.println("Press 1 for Details");
			System.out.println("Press 2 for Balance");
			System.out.println("Press 3 for Deposite Money");
			System.out.println("Press 4 for Withdraw Money");
			System.out.println("Press 5 for Receipt");
			System.out.println("Press 6 to Exit");
			
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operation: ");
		int operation=sc.nextInt();
		
		switch (operation) {
//		case 1: 
//			app.details();
//			break;
		
		
		case 2:
			app.show();
			
			
			break;
			
		case 3:	
			app.dep();
			
			
			break;
			
			
		case 4:
			app.wit();
			
			
			break;
			
			
		case 5:
			app.recp();
			
			break;
			
		case 6:
			app.exit();
			break;
			
			
		default:
			System.out.println("Invalid Opweration!!!!!!..");
			break;
		}

	 }

 }
}
