import java.util.ArrayList;
import java.util.Arrays;
public class sortlist{
	//ʹ��this�ؼ����������ڱ������Ķ����������
    ArrayList<Number> list;
    public sortlist(ArrayList<Number> list){
        this.list = list;
    }
    //���򷽷�
    public static void sort(ArrayList<Number> list){
    	//���list����Ϊ0��ֱ��return
    	if (list.size()==0){
            return ;
        }
        else {
        	for (int i = 0; i < list.size()-1; i++){
                Number number = list.get(i);
                int min = i;
                for (int k = i + 1; k < list.size(); k++){
                    if (list.get(k).intValue() < number.intValue()){
                        min = k;
                        number = list.get(k);
                    }
                }
                if (min != i){
                    list.set(min, list.get(i));
                    list.set(i, number);
                }
            }
        }
    }
    //���list����
    public static void printList(ArrayList<Number> list){
        for ( int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    //���Գ�����
    public static void main(String [] args){
        Integer[] numbers = {9,8,7,6,5,4,3,2,1,0};
        ArrayList<Number> list = new ArrayList<>(Arrays.asList(numbers));
        printList(list);
        sortlist.sort(list);
        printList(list);
    }
}