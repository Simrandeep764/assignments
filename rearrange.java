
import java.util.*;
public class rearrange
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
            {
                ++count;
            }
        }
            char ch[][]=new char[count+1][s.length()];
            int count1=0;
            int count2=0;
            for(int i=0;i<s.length();i++)
            {
    
                if(s.charAt(i)=='.')
                {
                    ++count1;
                    count2=0;
                }
                else
                {
                    ch[count1][count2]=s.charAt(i);
                    ++count2;
                }
            }
            int count3=count;
           for(int i=count;i>=0;i--)
           {
               int x=ch[i].length;
               for(int j=0;j<x;j++)
               {
                   System.out.print(ch[i][j]);
               }
               if(count3>0)
               {
               System.out.print('.');
               --count3;
               }
           }
	}
}


