
import java.util.*;
public class reversestring
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
	String s=sc.nextLine();
	int n=0;
	int count=0;
	char e;
	try
	{
		for(int i=0;i<1000;i++)
		{
			e=s.charAt(i);
			++n;
		}
	}
	catch(Exception ex)
	{
		char t[]=new char[n];
		for(int i=0;i<n;i++)
		{
		t[i]=s.charAt(i);
		}
				if(t[n-1]!=' ')
				{
		for(int i=n-1;i>0;i--)
		{
				if(t[i]==' ')
				{
				if(t[i+1]!=' ')
					{
					System.out.print(t[i]);
					}
				}
					if(t[i]!=' ')
					{
					System.out.print(t[i]);
					}
		}
				}
		if(t[n-1]==' ')
		{
			for(int i=n-1;i>=0;i--)
			{
				if(t[i]!=' ')
				{
					count=i;
					break;
				}	
			}
		}
				for(int i=count;i>=0;i--)
				{
					
					if(t[i]==' ')
				{
				if(t[i+1]!=' ')
					{
					System.out.print(t[i]);
					}
				}
					if(t[i]!=' ')
					{
					System.out.print(t[i]);
					}
				}
		
	}
	}
}

