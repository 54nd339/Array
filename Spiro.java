import java.util.*;
class Spiro{
    static Scanner sc=new Scanner(System.in);
    static Spiro ob=new Spiro();
    static int n,ar[][],k,c1,c2,r1,r2;
    void input(){
        System.out.print("Enter a no.:");
        n=sc.nextInt();
        ar=new int[n][n];k=1;c1=0;c2=n-1;r1=0;r2=n-1;
    }
    void print(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            System.out.print(ar[i][j]+"\t");
            System.out.println();
        }
    }
    public static void sp1(){
        ob.input();
        do{
            for(int i=c1;i<=c2;i++){
            ar[r1][i]=k;k++;}
            for(int i=r1+1;i<=r2;i++){
            ar[i][c2]=k;k++;}
            for(int i=c2-1;i>=c1;i--){
            ar[r2][i]=k;k++;}
            for(int i=r2-1;i>=r1+1;i--){
            ar[i][c1]=k;k++;}
            c1++;c2--;r1++;r2--;
        }while(k<=n*n);
        ob.print();
    }
    public static void sp2(){
        ob.input();
        do{
            for(int i=r1;i<=r2;i++){
            ar[i][c2]=k;k++;}
            for(int i=c2-1;i>=c1;i--){
            ar[r2][i]=k;k++;}
            for(int i=r2-1;i>=r1;i--){
            ar[i][c1]=k;k++;}
            for(int i=c1+1;i<=c2-1;i++){
            ar[r1][i]=k;k++;}
            c1++;c2--;r1++;r2--;
        }while(k<=n*n);
        ob.print();
    }
    public static void sp3(){
        ob.input();
        do{
            for(int i=c2;i>=c1;i--){
            ar[r2][i]=k;k++;}
            for(int i=r2-1;i>=r1;i--){
            ar[i][c1]=k;k++;}
            for(int i=c1+1;i<=c2;i++){
            ar[r1][i]=k;k++;}
            for(int i=r1+1;i<=r2-1;i++){
            ar[i][c2]=k;k++;}
            c1++;c2--;r1++;r2--;
        }while(k<=n*n);
        ob.print();
    }
    public static void sp4(){
        ob.input();
        do{
            for(int i=r2;i>=r1;i--){
            ar[i][c1]=k;k++;}
            for(int i=c1+1;i<=c2;i++){
            ar[r1][i]=k;k++;}
            for(int i=r1+1;i<=r2;i++){
            ar[i][c2]=k;k++;}
            for(int i=c2-1;i>=c1+1;i--){
            ar[r2][i]=k;k++;}
            c1++;c2--;r1++;r2--;
        }while(k<=n*n);
        ob.print();
    }
    public static void sp5(){
        ob.input();
        do{
            for(int i=c1;i<=c2;i++){
            ar[r2][i]=k;k++;}
            for(int i=r2-1;i>=r1;i--){
            ar[i][c2]=k;k++;}
            for(int i=c2-1;i>=c1;i--){
            ar[r1][i]=k;k++;}
            for(int i=r1+1;i<=r2-1;i++){
            ar[i][c1]=k;k++;}
            c1++;c2--;r1++;r2--;
        }while(k<=n*n);
        ob.print();
    }
    public static void sp6(){
        ob.input();
        do{
            for(int i=r1;i<=r2;i++){
            ar[i][c1]=k;k++;}
            for(int i=c1+1;i<=c2;i++){
            ar[r2][i]=k;k++;}
            for(int i=r2-1;i>=r1;i--){
            ar[i][c2]=k;k++;}
            for(int i=c2-1;i>=c1+1;i--){
            ar[r1][i]=k;k++;}
            c1++;c2--;r1++;r2--;
        }while(k<=n*n);
        ob.print();
    }
    public static void sp7(){
        ob.input();
        do{
            for(int i=c2;i>=c1;i--){
            ar[r1][i]=k;k++;}
            for(int i=r1+1;i<=r2;i++){
            ar[i][c1]=k;k++;}
            for(int i=c1+1;i<=c2;i++){
            ar[r2][i]=k;k++;}
            for(int i=r2-1;i>=r1+1;i--){
            ar[i][c2]=k;k++;}
            c1++;c2--;r1++;r2--;
        }while(k<=n*n);
        ob.print();
    }
    public static void sp8(){
        ob.input();
        do{
            for(int i=r2;i>=r1;i--){
            ar[i][c2]=k;k++;}
            for(int i=c2-1;i>=c1;i--){
            ar[r1][i]=k;k++;}
            for(int i=r1+1;i<=r2;i++){
            ar[i][c1]=k;k++;}
            for(int i=c1+1;i<=c2-1;i++){
            ar[r2][i]=k;k++;}
            c1++;c2--;r1++;r2--;
        }while(k<=n*n);
        ob.print();
    }
}