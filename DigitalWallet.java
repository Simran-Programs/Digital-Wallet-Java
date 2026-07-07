import java.util.Scanner;

class Wallet
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		double balance=20000.96;
		String password="1234";
		
		System.out.println("=======Welcome To My Digital Waller=======");
		while(true)
		{
			System.out.println("Choose Your Option pls ");
			System.out.println("1. Check balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Transfer Money");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice: ");
			 int choice=sc.nextInt();
			 
			 if(choice==1)
			 {
				 System.out.print("Enter Password: ");
				 String pass=sc.next();
				 if(pass.equals(password))
				 {
					 System.out.println("Your Available Balance Is: "+balance);
				 }
				 else
				 {
					 System.out.println("Wrong Password Pls Enter Right Password Or Try Again");
				 }
			 }
			 else if(choice==2)
			 {
				System.out.println("Enter Amount To Deposit: ");
				double amt=sc.nextInt();
				
				balance=balance+amt;
				System.out.println("Amount Successfully added! Available balance Is: "+balance);
			 }
			 else if(choice==3)
			 {
				System.out.println("Enter Amount To Tranfer: ");
				double transferAmt=sc.nextInt();
					
					if(transferAmt>balance)
					{
						System.out.println("Error: Insufficient Balance Please Check Again");
					}
					else
					{
						System.out.println("Enter Password To Confirm: ");
						String pas=sc.next();
						
						if(pas.equals(password))
						{
							balance=balance-transferAmt;
							System.out.println("Amount Successfully Transfer! Available Balance is: "+balance);
						}
						else
						{
							System.out.println("Wrong PAssword Please Check Again");
						}
					}
			 }
			 else if(choice==4)
			 {
				System.out.println("====Thank You! Have A Good Day====");
				break;
			 }
			 else
			 {
				System.out.println("Wrong Choice Please Recheck The Menu");
			 }
		}
	}
}