import java.util.Scanner;

public class 求矩阵主对角线元素的和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("输入矩阵的行列数：");
		int n=input.nextInt();
		double[][] matrix=new double[n][n];
		System.out.println("输入矩阵内容：");
		for (int x=0;x<n;x++) {
			for (int y=0;y<n;y++) {
				matrix[x][y]=input.nextDouble();
		double sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+matrix[i][i];
		}
		System.out.println("矩阵对角线元素的和为"+sum);
			}
		}
		
	} 
 
}
