import java.util.Scanner;

public class ÏÔÊ¾¾ØÕó {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=scan.nextInt();
		int row=0;
		int line=0;
		for (row=0;row<n;row++) {
			for(line=0;line<n;line++) {
				int randomnumber=(int)(Math.random()*2);
				System.out.print(randomnumber+" ");
			}
			System.out.println(" ");
		}

	}

}
