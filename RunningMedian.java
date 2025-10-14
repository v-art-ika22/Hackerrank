import java.util.*;
public class RunningMedian {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of array");
        int n=sc.nextInt();int[]arr=new int[n];double median;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int p=0;
        while(p<arr.length){
            ArrayList<Integer> list=new ArrayList<>();
          
            for(int i=0;i<=p;i++){
                list.add(arr[i]);
            }
             int[]arr1=new int[list.size()];
            for(int i=0;i<list.size();i++){
             
                arr1[i]=list.get(i);
            }
            Arrays.sort(arr1);
            if(arr1.length%2!=0){
                int k=arr1.length/2;
                median=arr1[k];
                System.out.println(median);
            }
            else{
                int a=arr1.length/2;
                int b=(arr1.length-1)/2;
                median=(arr1[a]+arr1[b])/2.0;
                System.out.println(median);
            }
            p++;
        }
    }
   
    
}
