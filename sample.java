public class sample{
    public static void smaple(int marks[]){
        for (int i=0;i<marks.length;i++){
            int current=marks[i];
            for(int j=i+1;j<marks.length;j++){
                System.out.print("("+current+","+marks[j]+")");

            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int marks[]={67,54,56,456,343,53};
        smaple(marks);
    }
}

