import java.util.*;
public class Arrays{
    public static void main(String[] args){
        // readArray()
        // int[] a={1,2,3,4,5};
        // printArray(a);
        // reverseArray(a);
        // reverseArrayItsSelf(a);
        // rightRotateUnOptimized();
        // rightRotateArray();
        // leftRotateArray();
        // dutchNationalFlag();
        // kadanesAlgo(); //subarray maximum sum
        //boyerMooreVotingAlgo(); //majority element
        //maxConsecutiveOnes();
        // removeDuplicates();
        // twoSum(); //hash map
        // buyAndStock();
        //moveZeroes();
        //bubbleSort();
        //hashMap();
    }
    public static void hashMap(){
        int[]a={1,2,3,4,5,6};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<a.length;i++){
             map.put(a[i],i);
        }
       for(int i:map.keySet()){
        System.out.print(i+" ");
        System.out.print(map.get(i)+" ");
        System.out.print("\n");
       // System.out.print(map.getOrDefault(a[i],0)+" ");
       }
          System.out.print(map.containsKey(5));
    }

    public static int[] readArray(){
        int n;
        System.out.print("enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        int i=0;
        while(i<n){
            a[i++]=sc.nextInt();
        }
        printArray(a);
        return a;

    }
    public static void printArray(int a[]){
        int i=0;
        while(i<a.length){
            System.out.print(a[i]+" ");
            i++;
        }
        System.out.println();
    }
    public static void reverseArray(int[] a){
        int[] b=new int[a.length];
        int j=0;
        for(int i=a.length-1;i>=0;i--){
            b[j]=a[i];
            j++;
        }
        printArray(b);

    }
    public static void reverseArrayItsSelf(int[] a){
        int start=0;
        int end=a.length-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        printArray(a);
    }
    public static void rightRotateUnOptimized(){
        //first element should go to last
        int[] a=readArray();
        System.out.println("how many times do you want to right rotate the array:");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int temp=a[0];
            for(int j=1;j<a.length;j++){
                a[j-1]=a[j];
            }
            a[a.length-1]=temp;
        }
        printArray(a);
    }
    public static void rightRotateArray(){
        int a[]=readArray();
        System.out.println("how many times do you want to right rotate the array:");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
        int first=a[0];
        for(int j=0;j<a.length-1;j++){
            a[j]=a[j+1];
        }
        a[a.length-1]=first;
        }
        System.out.println("Right rotated array is: ");
        for(int i:a){
            System.out.print(i+" ");
        }
        }
    public static void leftRotateArray() {
        Scanner sc=new Scanner(System.in);
        int a[]=readArray();
        System.out.print("how many times do you want to left rotate??");
        int k=sc.nextInt();
        int n=a.length;
        for(int i= 0;i<k;i++) {
            int last=a[n-1];
            for(int j=n-1;j>0;j--) {
                a[j]=a[j-1];
            }
            a[0]=last;
        }
        System.out.print("array after left rotating: ");
        for (int i = 0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void dutchNationalFlag(){
        //int[]a =readArray();
        int[] a={1,0,1,2,1,0};
        int left=0;
        int mid=0;
        int right=a.length-1;
        while(mid<=right){
            if (a[mid]==0) {
                int temp=a[mid];
                a[mid]=a[left];
                a[left]=temp;
                left++;
                mid++;
            }
            else if(a[mid]==1) mid++;
            else {
                int temp=a[right];
                a[right]=a[mid];
                a[mid]=temp;
                right--;
            }
        }
        printArray(a);
    }
    public static void kadanesAlgo(){
        int[] a=readArray();
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            currSum+=a[i];
            if(currSum<0)currSum=0;
            maxSum=Math.max(maxSum,currSum);
        }
        System.out.println(maxSum);
    }
    public static void boyerMooreVotingAlgo(){
        int[] a=readArray();
        int votes=0;
        int majority=-1;
        for(int i=0;i<a.length;i++){
            if(votes==0){
                majority=a[i];
                votes++;
            }
            else{
                if(majority==a[i]) votes++;
                else votes--;
            }
          }

        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==majority)count++;
        }
        if(count>(a.length-1)/2)
        System.out.print(majority);
        else System.out.print("there is no majority element");
    }
    public static void maxConsecutiveOnes(){
        int max=0;
        int count=0;
        int[] a={1,0,1,1,1,1,0,0,0,1,0,1,1,0,0};
        for(int i=0;i<a.length;i++){
            if(a[i]==1)count++;
            else count=0;
            max=Math.max(max,count);
        }
        System.out.println(max);
    }
    public static void removeDuplicates(){
        //int[] a=readArray();
        int[] a={0,0,1,1,1,2,2,3,3,4};
        int right=1;
        int left=0;
        while(right<a.length){
            if(a[left]!=a[right]) {
                left++;
                a[left]=a[right];
            }
            right++;
        }
        printArray(a);
    }
    public static void twoSum(){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map =new HashMap<>();
        int[] a=readArray();
        int[] b=new int[2];
        System.out.println("enter the target element:");
        int target=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(target-a[i])){
                b[0]=i;
                b[1]=map.get(target-a[i]);
            }
            else{
                map.put(a[i],i);
            }
        }
        System.out.print(b[0]+" "+b[1]);
    }
    public static void buyAndStock(){
        int []prices={2,3,4,1,5,2};
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            profit=Math.max(profit,prices[i]-min);
        }
        System.out.print(profit);
    }
    public static void moveZeroes(){
        int []a={10,0,20,0,30};
        int left=0;
        int right=0;
        while(right<a.length){
            if(a[right]!=0){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
            }
            right++;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void bubbleSort(){
        int []a=readArray();
        int count=0;
        for (int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1]){
                count++;
            }
        }
        if(count==a.length-1) return;
        for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length-1;j++){
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
        printArray(a);
    }

}