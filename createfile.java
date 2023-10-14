public class createfile{
    public static void main(String args[]){
        try{
            fileReader r=new fileReader("");
            try{
                int i;
                while((i=r.read())!=1){
                    System.out.println((char)i);
                }
            }
            finally{
                r.close();
            }
        }
    }
}