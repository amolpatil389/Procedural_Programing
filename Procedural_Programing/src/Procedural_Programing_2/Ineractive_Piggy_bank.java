package Procedural_Programing_2;

import javax.swing.JOptionPane;

public class Ineractive_Piggy_bank {
	
	static int balance;
	static int lt;

	public static void main(String[] args) {
		
		boolean flag = true;
		String ch = "Q";
		
		while(flag){
			ch = read("Welcome to Piggy bank \n"
					+ "D-Deposit"+"\n"
					+ "W-Withdraw "+ "\n"
					+"S-Statement"+ "\n"
					+"Q-Quit"+"\n"     );
			
			switch(ch)
			{
			case "d":
			case "D" : deposit(readValue("Enter Amount to be deposited") );
			break;
			
			case "w":
			case "W": withdraw(readValue("Enter Amount to be Withdrawn "));
			break;
			
			case "s":
			case "S": Statement();
			break;
			
			case "q":
			case "Q": JOptionPane.showMessageDialog(null, "Thank you for using Piggy Bank :-)");
			flag = false;
			break;
			
			default : JOptionPane.showMessageDialog(null, "Sorry You have Enter an Wrong Command");
			
				
			}
			
		}

		
	}
	
	static String read(String s)
	{
		String r = JOptionPane.showInputDialog(s);
		return(r==null) ? "Q":r;
	}
	
	
	static int readValue(String s)
	{
		String v1 = JOptionPane.showInputDialog(s);
		int v= 0;
		try{
			v = Integer.parseInt(v1);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Invalid Input");
		}
		return v;
	}
	
	
	
	static void deposit(int v)
	{
		balance = balance + v;
		lt = v;
	}
	
	static void withdraw(int v)
	{
		if(balance>v)
		{
			balance = balance +v;
			lt = -v;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"I am Sorry .....you Cannot Withdraw More Than your Balance");
		}
	}
	
	static void Statement()
	{
		JOptionPane.showMessageDialog(null, "Balance = "+balance+"\n"+"Last transaction = "+lt);
	}

}
