import java.util.Date;
public class date {

	//������ڵķ���
	public static void printDate(long seconds, Date date) {
		System.out.println(seconds + ": " + date.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long seconds = 10000;//secondsΪ�Ӹ�������ʱ��1970��1��1�������ŵ�ʱ��
		int i=0;//���ڿ���ѭ��
		while(i<=7) {
			Date date = new Date(seconds);
			date.setTime(seconds);
			printDate(seconds, date);
			seconds =seconds*10;
			i++;//ͨ��ѭ�������µ�����ʱ�䲢��ʾ����
		}
	}

}
