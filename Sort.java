import java.util.*;
class Sort{
    static Scanner sc=new Scanner(System.in);
    public static void ssN(){
        System.out.print("Enter the no. of elements:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter "+n+" nos.:");
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++)
            if(ar[j]<ar[min])
            min=j;
            int t=ar[i];
            ar[i]=ar[min];
            ar[min]=t;
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        System.out.println(ar[i]);
    }
    public static void ssW(){
        System.out.print("Enter a Word:");
        String s=sc.next().toUpperCase(),s1="";
        char ar[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        ar[i]=s.charAt(i);
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++)
            if(ar[i]>ar[j]){
            char t=ar[i];
            ar[i]=ar[j];
            ar[j]=t;
        }
        }
        for(int i=0;i<s.length();i++)
        s1+=ar[i];
        System.out.println("Sorted Word:"+s1);
    }
}