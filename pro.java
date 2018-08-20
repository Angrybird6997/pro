import java.io.*;
import java.util.*;
class Pro
{
    public static void main(String args[])
    {   
       int fact=5;
       int x = intfact(fact);
       System.out.print(x);
    }
     static int intfact(int fact)
    {
        if(fact>0)
        {
            //k*=fact;
            fact= fact*intfact(fact-1);
        }
        return fact;    
        
    }
}
