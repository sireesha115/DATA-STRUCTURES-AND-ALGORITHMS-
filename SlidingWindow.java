import java.util.*;
public class SlidingWindow{
    public static void main(String args[]){
        int [] a={2,-3,5,2,-10,2,-3,5};
        // Scanner sc=new Scanner(System.in);
        // int k= sc.nextInt();
        // maxSumOfSubarray1(a,k);
        // maxSumOfSubarray2(a);
        // firstNegativeInteger(a,k);
        // countOccurencesOfAnagram();
        // highestSubArray();
        uniqueElementsSubArray();
    }
    public static void maxSumOfSubarray1(int[] a,int k){
        int left=0;
        int right=k;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=left;i<k;i++){
            sum+=a[i];
        }
        maxSum=Math.max(sum,maxSum);
        while(right<a.length){
            sum+=a[right];
            sum-=a[left];
            left++;
            maxSum=Math.max(sum,maxSum);
            right++;
        }
        System.out.println(maxSum);
    }//2,-3,5,2,-10,2,-3,5
    public static void maxSumOfSubarray2(int[] a){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int left=0;
        int right=0;
        int maxsum=0;
        int sum=0;
        while(right<a.length){
            sum+=a[right];
            // if(right-left+1<k)right++;
            // else{
            //     maxsum=Math.max(maxsum,sum);
            //     sum-=a[left];
            //     right++;
            //     left++;
            // }
            if((right-left+1)==k){
                maxsum=Math.max(maxsum,sum);
                sum-=a[left];
                left++;
            }
            right++;
        }
        System.out.println(maxsum);
    }
    public static void firstNegativeInteger(int[] a,int K){
        ArrayList<Integer>neg=new ArrayList<>();
        int[] ans=new int[a.length-K+1];
        int left=0;
        int right=0;
        int k=0,z=0;
        while(right<a.length){ 
            if(a[right]<0)neg.add(a[right]);
            if(right-left+1==K){
                if(k==neg.size())ans[z++]=0;
                else ans[z++]=neg.get(k);
                if(k!=neg.size()&&a[left]==neg.get(k)) k++;
                left++;
            }
           right++;
        }
        for(int i=0;i<ans.length;i++)
        System.out.print(ans[i]+" ");
    }
    public static void highestSubArray(){
        Scanner sc=new Scanner(System.in);
        int k=3;
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int left=0;
        int right=0;
        int ans=0;
        int sum=0;
        while(right<n){
            sum+=a[right];
            if(sum==k)ans=Math.max(ans,right-left+1);
            else if(sum>k){
                while(sum>k){
                sum-=a[left];
                left++;
                }
            if(sum==k)ans=Math.max(ans,right-left+1);
            }
            right++;
        }
       System.out.println(ans);
    }
    public static void uniqueElementsSubArray(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] s=new char[n];
        
        int maxlength=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        for(int right=0;right<s.length;right++){
            char c1=s[right];
            if(map.containsKey(1)){
                left=Math.max(left,map.get(c1)+1);
            }
            map.put(c1,right);
            maxlength=Math.max(maxlength,right-left+1);
        }
        System.out.println(maxlength);
    }
}