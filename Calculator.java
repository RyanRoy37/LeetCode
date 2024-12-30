package mca;
import java.util.*;
public class Calculator {
int a;
int b;
static int result;
 Calculator(int a, int b)
 { this.a=a;
 this.b=b;
 }
void addition()
{result=this.a+this.b;
System.out.println("Sum of "+this.a+" "+this.b+" is"+ result);
System.out.println();
System.out.println();
result=0;
}
void subtraction()
{result=this.a-this.b;
System.out.println("Difference of "+this.a+" "+this.b+" is"+ result);
System.out.println();
System.out.println();
result=0;
}
void division()
{result=this.a/this.b;
System.out.println("Quotient of "+this.a+" "+this.b+" is"+ result);
System.out.println();
System.out.println();
result=0;
}
void multiplication()
{result=this.a*this.b;
System.out.println("Product of "+this.a+" "+this.b+" is"+ result);
System.out.println();
System.out.println();
result=0;
}
public static void main (String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("This is a calculator");
	System.out.println("enter the first value");
	int c=sc.nextInt();
	System.out.println("Enter the second value");
	int d=sc.nextInt();
	Calculator obj=new Calculator(c,d);
	while(true) {
	System.out.println("Option 1: ADD");
	System.out.println(" Option 2: Subtract");
	System.out.println(" Option 3: Multiply");
	System.out.println(" Option 4: Divide");
	System.out.println(" Option 5: Exit");
	System.out.println(" Enter one option");
	int n=sc.nextInt();
	switch(n) {
		case 1:
			obj.addition();
			break;
		case 2:
			obj.subtraction();
			break;
		case 3:
			obj.multiplication();
			break;
		case 4:
			obj.division();
			break;
		case 5:
			sc.close();
			break;
		default :
			System.out.println("Invalid Input");
			System.out.println();
			System.out.println();
			break;
	}}
}
}
