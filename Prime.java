import java.util.*;
class Prime
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0 && n!=1)
            {
                c++;
            }
        }
        if(c==2)
        System.out.print("yes");
        else
                System.out.print("no");

}
}






