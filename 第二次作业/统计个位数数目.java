
public class ͳ�Ƹ�λ����Ŀ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times=0;
		int[] counts= {1,2,3,4,5,6,7,8,9,0};
		int[] number=new int[100];
		for(int i=0;i<number.length;i++) {
			number[i]=(int)(Math.random()*10);
		}
		for(int x=0;x<counts.length;x++) {
			for(int y=0;y<number.length;y++) {
				if(number[y]==counts[x]) {
					times=times+1;
				}
			}
			System.out.println(counts[x]+"������"+times+"��");
			times=0;
		}
	}

}
