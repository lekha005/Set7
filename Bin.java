import java.util.*;
class Bin
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        int f=0;
        for(int i=0;i<a.length();i++)
        {
            int j=Integer.valueOf(a.charAt(i))-'0';
            if(j==1 || j==0)
            {
                f++;
            }
        }
        if(f==a.length())
        System.out.print("yes");
        else
        System.out.print("no");
}
}






