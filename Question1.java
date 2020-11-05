import java.util.*;
public class Question1{
    public static long perm(int[] arr,int tsum){
            long[] strg=new long[tsum+1];
            strg[0]=1;
            
            for(int i=1;i<=tsum;i++){
                for(int j=0;j<arr.length;j++){
                 if((i-arr[j])>=0){
                     strg[i]+=strg[i-arr[j]];
                 }    
                }
            }
            return strg[tsum];
    }
    public static long comb(int[] arr,int tsum){
        long[] strg=new long[tsum+1];
            strg[0]=1;
            for(int j=0;j<arr.length;j++){
            for(int i=1;i<=tsum;i++){
                 if((i-arr[j])>=0){
                     strg[i]+=strg[i-arr[j]];
                 }    
                }
            }
            return strg[tsum];
    }
   
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int[] arr={10,20,50,100,200,500,1000,2000};//{2,3,5,6}//
       long ans=perm(arr, 2000);
        System.out.println("permuatation-"+ans);
        long ans1=comb(arr, 2000);
        System.out.println("combination-"+ans1);
    }
}