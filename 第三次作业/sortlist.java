import java.util.ArrayList;
import java.util.Arrays;
public class sortlist{
	//使用this关键字引用正在被构建的对象的数据域
    ArrayList<Number> list;
    public sortlist(ArrayList<Number> list){
        this.list = list;
    }
    //排序方法
    public static void sort(ArrayList<Number> list){
    	//如果list长度为0，直接return
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
    //输出list方法
    public static void printList(ArrayList<Number> list){
        for ( int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    //测试程序功能
    public static void main(String [] args){
        Integer[] numbers = {9,8,7,6,5,4,3,2,1,0};
        ArrayList<Number> list = new ArrayList<>(Arrays.asList(numbers));
        printList(list);
        sortlist.sort(list);
        printList(list);
    }
}