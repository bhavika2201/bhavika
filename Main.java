import java.util.*;
class MyException extends Exception{
   
MyException(String s)
{
super(s);
}
}
class Main
{
    
   
    public static void main(String s[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        try
        {
         if(a<1000)
         throw new MyException("Insufficient amount");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}