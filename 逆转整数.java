import java.util.Scanner;

public class ax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入一个整数: ");
		int i=scan.nextInt();
		int r=0;
		do {
			r=r*10+i%10;
			i=i/10;
		}
		while(i>0);
		System.out.print(r);
	}

}
