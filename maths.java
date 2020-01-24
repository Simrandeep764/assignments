import java.util.*;
public class maths
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //no. of elements
		int arr[]=new int[n];
		int count1=0;
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++)
		{
		    for(int j=i+1;j<n-1;j++)
		    {
		        int x=arr[i]*arr[i];
		        int y=arr[j]*arr[j];
		        int z=arr[j+1]*arr[j+1];
		        if((x+y)==z)
		        {
		            System.out.print("yes");
		            ++count1;
		            break;
		        }
		    }
		    if(count1>0)
		    break;
		}
		if(count1==0)
		{
		    System.out.println("no");
		}
	}
}
