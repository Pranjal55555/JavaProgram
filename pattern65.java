import java.util.Scanner;
public class pattern65
{
   public static void pyramidPattern(int num_rows) 
    {  
        
        for (int i = 0; i < num_rows; i++) {
            String spaces = " ".repeat(num_rows - i - 1);  // Number of spaces before each row
            String stars = "*".repeat(2 * i + 1);  // Number of stars in each row
            System.out.println(spaces + stars);
        }
    }

    
  
    public static void main(String args[]) //driver function
    { 
        
        pyramidPattern(6); 
    } 
}
