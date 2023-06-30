import java.util.*;
public class string1 {
    public static void main(String args[]){
        StringBuilder sb= new StringBuilder("Pranjal");
        System.out.println(sb);
        // charat(0)
        // System.out.println(sb.charAt(0));
       sb.setCharAt ( 0, 'e');
       System.out.println(sb);
        sb.insert(2,'n');
        System.out.println(sb);

        sb.delete(2,3);
        System.out.println(sb);
    }
}
