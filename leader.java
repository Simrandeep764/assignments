import java.util.*;
class leader{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Leaders are:-");
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    ++count;
                }
            }
            if(count==0)
            {
                System.out.print(arr[i]+" ");
            }
            count=0;
        }
        System.out.print(arr[n-1]);
    }
}
