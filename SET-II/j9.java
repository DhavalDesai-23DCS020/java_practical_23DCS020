public class j9 {
   static  String double_char(String str)
    {
        String result ="";
        for(int i=0;i<str.length();i++)
        {
            // char s=str.charAt(i);
            result=result+str.charAt(i)+str.charAt(i);
            // result=result+s+s;
        }

        return result;

    }
    public static void main(String[] args) {
        // j9 j=new j9();
    //    String s= double_char("The");
        System.out.println(double_char("The"));

        
    }
    
    
}
