class Mergesort
{
    public static void main(String args[])
    {
        int ar[]={23,56,78,53,28,76};
        System.out.println("Elements before sort:");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+"\t");
        }
        Mergesort ms=new Mergesort();
        ms.msort(ar,0,ar.length-1);
        System.out.println("\nElements after sort:");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+"\t");
        }
    }
    void msort(int ar[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            msort(ar,low,mid);
            msort(ar,mid+1,high);
            merge(ar,low,high,mid);
        }
    }
    void merge(int ar[],int low,int high,int mid)
    {
        int n1=mid-low+1;
        int n2=high-mid;
        int a1[]=new int[n1];
        int a2[]=new int[n2];  
        for(int i=0;i<n1;i++)  
        {
            a1[i]=ar[low+i];
        }
        for(int i=0;i<n2;i++)
        {
            a2[i]=ar[mid+1+i];
        }
        int i=0,j=0,k=low;
        while(i<n1 && j<n2)
        {
            if(a1[i]<=a2[j])
            {
                ar[k++]=a1[i++];
            }
            else
                ar[k++]=a2[j++];
        }
        while(i<n1)
        {
            ar[k++]=a1[i++];
        }
        while(j<n2)
        {
            ar[k++]=a2[j++];
        }

    }
}
