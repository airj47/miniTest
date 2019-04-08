import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class junitTest1 {
    int count=0;
    ArrayList<String> al=new ArrayList<String>();
    public void permutation(char[] array,int start,int end){
        if(array == null || start > end || start < 0 || end < 0){
            return;//非法检测
        }
        if(start == end){
            String sb=new String(array);
            al.add(sb);
            count++;
        }else{
            for(int j = start; j <= end;j++){
                if(isSwap(array,start,j)){
                    swap(array,start,j);
                    permutation(array, start + 1, end);
                    swap(array,start,j);
                }
            }
        }
    }
    /**
     * 判断下标为j的位置元素是否与start...j-1元素相等，相等返回false，不等返回true
     * @param array
     * @param start
     * @param j
     * @return
     */
    private boolean isSwap(char[] array, int start, int j) {
        for (int i = start; i < j; i++) {
            if(array[j] == array[i]){
                return false;
            }
        }
        return true;
    }
    private void swap(char[] array, int start, int j) {
        char temp = array[start];
        array[start] = array[j];
        array[j] = temp;
    }

    @Test
    public void main() {
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                char[] arr={Character.forDigit(3,10),Character.forDigit(i,10),Character.forDigit(j,10)};
                permutation(arr, 0, arr.length-1);
            }
        }
        System.out.println("count:"+count);
        Collections.sort(al, Collections.reverseOrder());
        Iterator it=al.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }




}
