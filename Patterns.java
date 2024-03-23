/*1.Find no.of rows and no.of columns
  2.Basic boiler plate code
  3.Each row no.of stars
  4.Relate stars---->i,j
  5.Write code
*/
import java.util.*;
public class Patterns{
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args){
        // int n=s.nextInt();
        // squarePattern(n);
        // rightHalfPyramid(n);
        // leftHalfPyramid(n);
        // fullPyramid(n);
        // invertedLeftHalfPyramid(n);
        // invertedRightHalfPyramid(n);
        // invertedFullPyramid(n);
        // rhombusPattern(n);
        // floydsTriangle(n);
        // namePattern();
    }
    public static void squarePattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rightHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void leftHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void fullPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void invertedLeftHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=(n+1)-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedRightHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public static void invertedFullPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=n-i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rhombusPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void floydsTriangle(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((k++)+" ");
            }
            
        System.out.println();
        }
    }
    public static void namePattern(){
        String S=s.nextLine();
        int n=S.length();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(S.charAt(j));
            }
            System.out.println();
        }
        
    }
}