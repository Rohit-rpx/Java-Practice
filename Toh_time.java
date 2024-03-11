import java.util.Scanner;
class Toh_time
{
    static void toh(int n,char S,char A,char D)
    {
        if(n==1)
        {
            System.out.println("Disk 1 is moved from "+S+" to "+D);
            return;
        }
        toh(n-1,S,D,A);
        System.out.println("Disk "+n+" is moved from "+S+" to "+D);
        toh(n-1,A,S,D);
            
    }    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of disks: ");
        int n=sc.nextInt();
        sc.close();
        long st=System.currentTimeMillis();
        toh(n,'S','A','D');
        long end=System.currentTimeMillis();
        long t=end-st;
        System.out.println("n= "+n+"      time: "+(t/1000)+" seconds     "+(t%1000)+" ms");   
    }
}    