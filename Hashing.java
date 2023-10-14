import java.util.*;
public class Hashing {
    public static void main(String args[]){
        HashMap<String, Integer>miap=new HashMap<>();

        miap.put("India",120);
        miap.put("America",140);
        miap.put("china",320);
        System.out.println(miap);

        miap.put("china",180);
        System.out.println(miap);

        // if(miap.containsKey("china")){
        //     System.out.println("key is present");}
        // else
        // {
        //     System.out.println(" key is not present");
        //     }
            //  System.out.println(miap.get("china"));

            //  iteration means loop
            // int arr[]={45,67,45,78};
            // for(int i=0;i<=3;i++)
            // {
            //     System.out.print(arr[i]+" ");
                
            // }
            Set<string>keys=miap.keyset();
            // for(int val: arr){
            //     System.out.print(val+" ");
            // }
            for(Map.Entry<String,Integer>e: miap.entrySet()){
                System.out.println(e.getKey());
                System.out.println(e.getValue());
            }
            for(Map.Entry<String,Integer>e:miap.entrySet()){
                System.out.println(e.getKey());
                System.out.println(e.getValue());
            }
        }
        
    }

