import java.util.Date;
import java.util.Scanner;

public class Acount {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("������id��");
		int id=in.nextInt();
		System.out.println("�������");
		double balance=in.nextDouble();
		System.out.println("���������ʣ�");
		double rate=in.nextDouble();
		System.out.println("������ȡ���");
		double withdraw=in.nextDouble();
		System.out.println("���������");
		double deposit=in.nextDouble();
		Account account = new Account(id,balance);
		account.setAnnualInterestRate(rate);
		account.withDraw(withdraw);
		account.deposit(deposit);
		System.out.println("�˻����: " + account.getBalance() + "\n"
				+ "������: " + account.getMonthlyInterestRate() + "\n"
				+ "����ʱ��: " + account.getDateCreated());

	}

}

class Account {
	
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account() {
		dateCreated = new Date();
	}
	
	public Account(int i, double k) {
		this.id = i;
		this.balance = k;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double i) {
		this.balance = i;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double i) {
		this.annualInterestRate = i;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		double i = annualInterestRate / 12;
		return balance * i / 100;
	}
	
	public void withDraw(double i) {
		balance = balance-i;
	}
	
	public void deposit(double i) {
		balance = balance + i;
	}
	
}

