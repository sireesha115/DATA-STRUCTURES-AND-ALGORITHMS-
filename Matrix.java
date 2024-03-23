import java.util.*;
public class Matrix{
    public static void main(String[] args){
        //reverseMatrix();
        //transposeMatrix();
        //antiClockwiseRotate();
        //snakePattern();
        //sumOfDiagonal();
        //spiralMatrix();
        //boundaryTraversal();
        //reverseMatrix();
    }
    public static void reverseMatrix(){
        int [][]a=readMatrix();
        //int[][] a={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        printMatrix(a);
        for(int i=0;i<a.length;i++){
            int k=a[i].length-1;
            for(int j=0;j<a[i].length/2;j++){
                int temp=a[i][j];
                a[i][j]=a[i][k];
                a[i][k]=temp;
                k--;
            }
        }
        printMatrix(a);
    }
    public static void transposeMatrix(){
        int[][] a=readMatrix();
        printMatrix(a);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
                System.out.println(i+" "+j);
            }
        }
        printMatrix(a);
    }
     public static void snakePattern(){
        int [][]a=readMatrix();
        for(int i=0;i<a.length;i++){
            if((i%2) ==0){
                for(int j=0;j<a[i].length;j++){
                    System.out.print(a[i][j]+" ");
                }
            }
            else{
                for(int j=a[i].length-1;j>=0;j--){
                    System.out.print(a[i][j]+" ");
                }
            }
            
        }
    }
    public static void sumOfDiagonal(){
        int [][] a=readMatrix();
        int sum=0;
        int j=a.length-1;
        for(int i=0;i<a.length;i++){
            sum+=a[i][j];
            sum+=a[j][i];
            j--;
        }
        if((a.length&1)==1){
            sum-=a[(a.length)/2][(a.length)/2];
        }
        System.out.print(sum);
    }
     public static void spiralMatrix(){
        //int[][]a=readMatrix();
        int[][] a={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        printMatrix(a);
        int top=0;
        int left=0;
        int right=a[0].length-1;
        int bottom=a.length-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                System.out.print(a[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(a[i][right]+" ");
            }
            right--;
            for(int i=right;i>=left;i--){
                System.out.print(a[bottom][i]+" ");
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                System.out.print(a[i][left]+" ");
            }
            left++;
        }
    }
    public static void boundaryTraversal(){
        int[][] a=readMatrix();
        for(int i=0;i<a.length;i++){
            System.out.print(a[0][i]+" ");
        }
        System.out.println();
        for(int i=1;i<a.length;i++){
            System.out.print(a[i][a.length-1]+" ");
        }
        System.out.println();
        for(int i=a[0].length-2;i>=0;i--){
            System.out.print(a[a.length-1][i]+" ");
        }
        System.out.println();
        for(int i=a.length-2;i>0;i--){
            System.out.print(a[i][0]+" ");
        }
        System.out.println();
    }
    public static void antiClockwiseRotate() {
        int[][]a=readMatrix();
         for(int i=0;i<a.length;i++) {
            for(int j=i+1; j<a.length;j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(int i=0;i<a.length;i++){
            int start=0;
            int end=a.length-1;
            while(start<end){
                int temp=a[start][i];
                a[start][i]=a[end][i];
                a[end][i]=temp;
                start++;
                end--;
            }
        }
        printMatrix(a);
    }
    public static void printMatrix(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
  
    }
    public static int[][] readMatrix(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of rows:");
        int m=sc.nextInt();
        System.out.println("enter no.of columns");
        int n=sc.nextInt();
        int[][] a=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        return a;
    }

}