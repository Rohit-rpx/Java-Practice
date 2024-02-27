import java.util.Scanner;
class Binsearch
{
    public static void main(String args[])
    {
        int ar[]={12,23,34,45,56,67,78};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to search:");
        int num=sc.nextInt();
        int index=bsearch(ar,num);
        if(index==-1)
            System.out.println(num+" is not found");
        else
            System.out.println(num+" is found at index "+index);
        sc.close();
    }
    static int bsearch(int ar[],int n)
    {
        int min=0,max=ar.length-1,mid;
        while(min<=max)
        {
            mid=(min+max)/2;
            if(ar[mid]==n)
                return mid;
            else if(ar[mid]>n)
                max=mid-1;
            else
                min=mid+1;
        }
        return -1;
    }
}