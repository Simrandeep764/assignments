
import java.util.*;
public class duplicate
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ab[]=new char[s.length()];
		ab[0]=s.charAt(0);
		int count=1;
		for(int i=1;i<s.length()-1;i++)
		{
		    if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)!=s.charAt(i-1))
		    {
		        
		
		        ab[count]=s.charAt(i);
		        ++count;
		    }
		}
	        if(ab[count]!=s.charAt(s.length()-1))
	        {
	            ++count;
	            ab[count]=s.charAt(s.length()-1);
	            
	        }
	        //System.out.println(count);
	        for(int i=0;i<=count+1;i++)
	        {
	            System.out.print(ab[i]);
	        }
	}
}

