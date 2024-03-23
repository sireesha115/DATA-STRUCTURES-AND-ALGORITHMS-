import java.util.*;
class Numbers{
    public static void armStrong(){
        Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int c=0,rem=0;
            int new_n=0;
            int temp=n;
            while(temp!=0){
                c++;
                temp/=10;
            }
            temp=n;
            while(n!=0){
                rem=n%10;
                new_n+=Math.pow(rem,c);
                n/=10;
            }
        if(temp==new_n)System.out.print(temp+" is a armstrong number");
        else System.out.print(temp+" is a not armstrong number");
    }
    public static void noOfDigits(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n!=0){
            n/=10;
            c++;
        }
        System.out.print(c);
    }
    public static void largestOf3Numbers(int a,int b,int c){
        if (a>b){
            if (a>c)
            System.out.println("a is largest");
            else
            System.out.println("c is largest");
        }
        else if (b>c){
            System.out.println("b is largest");
        }
        else
        System.out.println("c is largest");
    }public static void evenOrOdd(int n){
        if ((n&1)==1) {
            System.out.print((n^0)+" is ");
            System.out.print("odd");
        }
        else {
            System.out.print((n^0)+" is ");
            System.out.print("even");
        }
    }
    public static void reverseNumber(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            int ld=n%10;
            rev=rev*10+ld;
            n/=10;
        }
        System.out.print(rev);
    }
    public static void main(String[] siri){
        // armStrong();
        // noOfDigits();
        //largestOf3Numbers(10,20,30);
        //evenOrOdd(5);
        //reverseNumber();
    }
    
}