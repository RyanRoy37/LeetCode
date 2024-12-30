package mca;
import java.util.*;
public class Banking {
	static int accounts=0;
	String name;
	int amt;
	String acctype;
Banking(){
	accounts++;
}
Banking(String name){
	this.name=name;
	accounts++;
}
Banking(String name, int amt){
	this.name=name;
	this.amt=amt;
	accounts++;
}
Banking(String name, int amt, String acctype){
	this.name=name;
	this.amt=amt;
	this.acctype=acctype;
accounts++;
}
void debit(int money) {
	if(money<=this.amt ) {
		System.out.println(money+" has been debited from your account");
		this.amt=this.amt-money;
		System.out.println("Balance:"+ this.amt);
	}
else
	System.out.println("Insufficient balance");
}
void debit(int money, String type) {
	if(money<=this.amt ) {
		System.out.println(money+" has been debited from your account via "+type);
		this.amt=this.amt-money;
		System.out.println("Balance:"+ this.amt);
	}
else
	System.out.println("Insufficient balance");
}
void deposit(int money) {
		System.out.println(money+" has been credited to your account");
		this.amt=this.amt+money;
		System.out.println("Balance:"+ this.amt);
	}
void deposit(int money, String type) {
	System.out.println(money+" has been credited to your account via "+type);
	this.amt=this.amt+money;
	System.out.println("Balance:"+ this.amt);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
	System.out.println("Enter 1 for Debit and 2 for Credit, 3 to exit");
	int option=sc.nextInt();
	if(option==1) {
		System.out.println("Enter amount to be debited");
		int money=sc.nextInt();
		System.out.println("Enter transaction type");
		String type=sc.next();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter account type");
		String acctype=sc.next();
		Banking ac1=new Banking(name,1000000, acctype);
		ac1.debit(money,type);
	}
	else if(option==2) {
		System.out.println("Enter amount to be credited");
		int money=sc.nextInt();
		System.out.println("Enter transaction type");
		String type=sc.next();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter account type");
		String acctype=sc.next();
		Banking ac2=new Banking(name,1000000, acctype);
		ac2.deposit(money,type);
	}
	else if(option==3) {
		break;
	}
	else {
		System.out.println("Invalid");
	Banking acc3=new Banking("Ryan");
	acc3.deposit(3331);
	acc3.debit(1200);}
	System.out.println("Total number of accounts:"+ accounts);
}
}
}