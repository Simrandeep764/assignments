import java.util.*;
public class anagrams
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String s1=sc.nextLine();
	    int count=0;
	    int count1=0;
	    char arr[]=new char[s.length()];
	    char brr[]=new char[s1.length()];
	    for(int i=0;i<s.length();i++)
	    {
	        arr[i]=s.charAt(i);
	    }
	    for(int i=0;i<s1.length();i++)
	    {
	        brr[i]=s1.charAt(i);
	    }
	    Arrays.sort(arr);
	    Arrays.sort(brr);
	    if(s.length()==s1.length())
	    {
	        for(int i=0;i<s.length();i++)
	        {
	            if(arr[i]!=brr[i])
	            {
	                ++count;
	               System.out.println("Not Anagrams");
	               break;
	            }
	        }
	        if(count==0)
	        {
	            System.out.println("Anagrams");
	        }
	    }
		else
		{
		    System.out.println("not Anagrams");
		}
		if(count==0)
		{
		System.out.println("The frequency of alphabets is:-");
		for(int j=0;j<s.length();j++)
		{
		for(int i=0;i<s.length();i++)
		{
		    if(arr[i]==arr[j])
		    {
		        ++count;
		    }
		}
			 if(j==0)
		 {
		       System.out.println(arr[j]+ " is "+count);
		 }
		 if(j!=0 && arr[j]!=arr[j-1])
		 {
		     System.out.println(arr[j]+ " is "+count);
		 }
	        count=0;
		}
		    
		}
	}
}
