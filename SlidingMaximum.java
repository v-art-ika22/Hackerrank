import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SlidingMaximum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> res= new ArrayList<>();
        System.out.print("enter size of array");
        int n=sc.nextInt();
        System.out.print("enter window size");
        int p=sc.nextInt();
        int[] arr= new int[n];int max=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start=0;int end=p;
        while(start<=arr.length-p&&end<=arr.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=start;i<=end-1;i++){
                list.add(arr[i]);
               
                
            }
            max=Collections.max(list);
            res.add(max);
            start++;
            end++;
        }
        System.out.print(res);
    }}
    

