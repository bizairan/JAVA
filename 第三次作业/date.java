import java.util.Date;
public class date {

	//输出日期的方法
	public static void printDate(long seconds, Date date) {
		System.out.println(seconds + ": " + date.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long seconds = 10000;//seconds为从格林威治时间1970年1月1日起，流逝的时间
		int i=0;//用于控制循环
		while(i<=7) {
			Date date = new Date(seconds);
			date.setTime(seconds);
			printDate(seconds, date);
			seconds =seconds*10;
			i++;//通过循环设置新的流逝时间并显示日期
		}
	}

}
