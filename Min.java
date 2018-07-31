import java.util.*;
class Min
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine().replace(" ","");
        int[] b=new int[a.length()];
        for(int i=0;i<a.length();i++)
        {
            b[i]=Integer.valueOf(a.charAt(i))-'0';
        }
        Arrays.sort(b);
        System.out.print(b[0]);
}
}






