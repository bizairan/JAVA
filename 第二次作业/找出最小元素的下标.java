import java.util.Scanner;

public class �ҳ���СԪ�ص��±� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double[] number=new double[10];
		System.out.println("������10�����֣�");
		for(int i=0;i<10;i++) {
			number[i]=input.nextDouble();
		}
		int index=0;
		double min=number[0];
		for (int x=1;x<=number.length-1;x++) {
			if(number[x]<min) {
				index=x;
			}
		}
		System.out.println("��С���ֵ��±�Ϊ��"+index);
	}
}
