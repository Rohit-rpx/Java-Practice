class Quicksort
{
    public static void main(String args[])
    {
        int ar[]={65,78,23,45,98,13,34,23};
        System.out.println("Elements before sort:");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+"\t");
        }
        Quicksort qs=new Quicksort();
        qs.qsort(ar,0,ar.length-1);
        System.out.println("\nElements after sort:");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+"\t");
        }
    }    
    void qsort(int ar[],int low,int high)
    {
        // int min=0,max=ar.length-1;
        if(low<high)
        {
            int pi=partition(ar,low,high);
            qsort(ar,low,pi-1);
            qsort(ar,pi+1,high);
        }
    }
    int partition(int ar[],int low,int high)
    {
        int pivot=ar[low];
        int l=low+1,r=high;
        while(l<r)
        {
            while(ar[l]<=pivot)
                l++;
            while(ar[r]>pivot)
                r--;
            if(l<r)
            {
                int temp=ar[l];
                ar[l]=ar[r];
                ar[r]=temp;
            }
        }
        ar[low]=ar[r];
        ar[r]=pivot;
        return r;
    }
}
