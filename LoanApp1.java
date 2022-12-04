package star;

import java.util.Scanner;

abstract class Loanspec
{
	abstract public void disp();
	abstract public void tNc();
	abstract public void disp1();
	abstract public void disp2();
	abstract public void Loandet();
	abstract public void homeLoan();
	abstract public void carLoan();
	abstract public void personalLoan();
	
	String name,addr,phno,addnum,accnum;
	int age,deps,cibil,choice1;
	double p,t,r,emi,i,d,accbal;
	double res=(p*r*t)/100;
	
	
}

class PersonDetails extends Loanspec

{
	
	 public void disp() 
	{
    System.out.println("\n-------Wellcome to the VinayFinance Ltd-------");
	Scanner sc = new Scanner(System.in);
	System.out.println("\nSingUp to Account ");
    System.out.println("\nEnter Your Name:");
    name=sc.next();
    System.out.println("Enter Your Adar Number:");
    addnum=sc.next();
    System.out.println("Enter Your Age :");
    age=sc.nextInt();
    System.out.println("Enter Your Address :");
    addr=sc.next();
    System.out.println("Enter Your Phnone Number :");
    phno=sc.next();
	}
	 
	 public void disp1()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("\n"+name.toUpperCase()+" Wellcome to Vinay Finance Ltd \n\nSuccesfuly Created a Account");
		 tNc();
		 System.out.println("\nEnter the ammount to deposit");
		 deps=sc.nextInt();
		 for(int i=0; i<3; i++) {
			 if(deps==0)
			 {
				 System.out.println("Plz Deposit Some ammount to get the Loan");
				 deps=sc.nextInt();
			 } 
		 }
		  System.out.println(deps+" Succesfully Deposited ");
		  System.out.println("\nEnter the CIBIL Score to get the Loan :");
		  cibil=sc.nextInt();
	 }
	 
	 public void tNc()
	 {
		 System.out.println("\nTermsand Condition for Loan");
			System.out.println("-----------------------------------------------");
			System.out.println("\n *The Age should be greater tha 18\n *CIBIL score must be more than or equal to 500\n *The Salary Sholud be more than the mothly emi\n *Minimum Account Balance must be more than 5000");
			System.out.println("\n-----------------------------------------------");
			//System.exit(0);
	 }
	 
	 public void disp2()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("\n-------Wellcome to the VinayFinance Ltd-------");
			System.out.println("\nChoice Your Loan ");
			System.out.println("\n1.Home Loan\n2.Car Loan\n3.Personal Loan\n4.Exit");
			
			
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: homeLoan();
			break;
			case 2: carLoan();
			break;
			case 3: personalLoan();
			break;
			case 4: System.exit(0);
			break;
			default:System.out.println("Invalid Choice");
			}
			
		}


	public void homeLoan() 
	{
		
		
		if(age<=18 | deps<=5000 |cibil<499 )
		{
			System.out.println("\nYour data not matching with Loan criteria so  your not eleigable for Loan\nFirst read the Terms and Condition for Loan");
			tNc();
			System.exit(0);
		}
	 
	    
	    Scanner sc = new Scanner(System.in);
	   
		System.out.println("\nEnter the Loan ammount :");
		p=sc.nextInt();
		System.out.println("\nSelect the Interst rate and Time duration:");
		System.out.println("\n1.for 3mon-5%\n2.for 6mon-7%\n3.for 9mon-9%\n4.for 1year-11%\n5.for 1.5year-12.5%");
		int choice1=sc.nextInt();
		
		switch(choice1)
		{
		case 1:System.out.println("Interest ammount is :"+(res=(p*5*0.3)/100));
		       System.out.println("\nMonthly EMI should be paid is :"+ (emi=(res+p)/3)); 
		       i=5;d=0.3;
		break;
		case 2:System.out.println("Interest ammmount is :"+(res=(p*7*0.6)/100));
				System.out.println("\nMonthly EMI should be paid is :"+ (emi=(res+p)/6));
				i=7;d=0.6;
		break;
		case 3:System.out.println("Interest ammount is :"+(res=(p*9*0.9)/100));
				System.out.println("\nMonthly EMI should be paid is :"+ (emi=(res+p)/9));
				i=9;d=0.9;
		break;
		case 4:System.out.println("Interest ammount is :"+(res=(p*11*1)/100));
		     System.out.println("\nMonthly EMI should be paid is :"+ (emi=(res+p)/12));
		     i=11;d=1;
		break;
		case 5:System.out.println("Interest ammount is :"+(res=(p*12.5*1.5)/100));
		     System.out.println("\nMonthly EMI should be paid is :"+ (emi=(res+p)/18));
		     i=12.5;d=1.5;
		break;
		case 6:System.out.println("Ivalid Choice");
		System.exit(0);
		}
		
		System.out.println("\nTotal ammount to be paid is    : "+ (res+p)+"\n");
		System.out.println(name.toUpperCase()+" select 1 to procced further or 0 to exit");
		int choice2=sc.nextInt();
		switch(choice2)
		{
		case 1: Loandet();
		break;
		case 0: System.exit(0);
		break;
		default : System.out.println("Invalid Choice");
		System.exit(0);
		}
		System.out.println("\n---------Thankyou for Selecting Vinay Finance Ltd---------- "+"\n");
		
	}
	
	public void carLoan()
	{
		homeLoan();	
	}
	public void personalLoan()
	{
		homeLoan() ;
	}
	
	public void Loandet()
	{
		System.out.println("-----------Loan Approved-----------");
		System.out.println("\nName   :"+name.toUpperCase());
		System.out.println("Age    :"+age);
		System.out.println("Adar   :"+addnum);
		System.out.println("Phno   :"+phno);
		System.out.println("Address:"+addr);
		System.out.println("Loan ammount is :"+p);
		System.out.println("Interset rate is "+i+"%");
		System.out.println("Time Duration is "+d+" Year");
		System.out.println("Interest amount is :"+res);
		System.out.println("Total ammount to be Paid :"+(res+p));
		System.out.println("Monthly EMI should be paid is :"+ emi);
	}
	
	
	
}
public class LoanApp1 {
	
	public static void main(String[] args) 
	
	{
		
		
		Loanspec l1 = new PersonDetails();
		l1.disp();
		l1.disp1();
		l1.disp2();
		
	}

}

