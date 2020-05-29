package Procedural_Programing;

public class Piggy_bank_1 {

	static int balance;
	static int lt;

	public static void main(String[] args) {

		System.out.println("Welcome to Procedural Programing Application");
		
		deposit(100);
		deposit(200);
		statement();
		withdraw(50);
		statement();
	}

	static void deposit(int v) {
		balance = balance + v;
		lt = v;
	}

	static void withdraw(int v) {
		if (balance > v) {

			balance = balance - v;
			lt = -v;
		} else {
			System.out.println("Insufficient Balance");

		}

	}

	static void statement() {
		System.out.println("Balance = " + balance);
		System.out.println("Last Transaction = " + lt);
	}

}
