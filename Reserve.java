import java.util.*;
public class Reserve{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(8);

        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(min>list.get(i)){
                min=list.get(i);
            }
        }
        System.out.println(min);
    }
}