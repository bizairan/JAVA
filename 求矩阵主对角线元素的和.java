import java.util.Scanner;

public class ��������Խ���Ԫ�صĺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("����������������");
		int n=input.nextInt();
		double[][] matrix=new double[n][n];
		System.out.println("����������ݣ�");
		for (int x=0;x<n;x++) {
			for (int y=0;y<n;y++) {
				matrix[x][y]=input.nextDouble();
		double sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+matrix[i][i];
		}
		System.out.println("����Խ���Ԫ�صĺ�Ϊ"+sum);
			}
		}
		
	} 
 
}
