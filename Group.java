import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Group {
   
    public static  List<List<String>> groupAnagrams(String[] arr) {
        boolean[] used= new boolean[arr.length];
        int n=arr.length;
       List<List<String>> list= new ArrayList<>();

        for(int i=0;i<n-1;i++){
            if(used[i]) continue;
             List<String> list1= new ArrayList<>();
             used[i]=true;
            list1.add(arr[i]);
            for(int j=i+1;j<n;j++){
                if(!used[j]&&isAnagram(arr[i],arr[j])){
                    list1.add(arr[j]);
                    used[j]=true;

                }

            }
            list.add(list1);
            
        }
        return list;
    }

        
    
    public static boolean isAnagram(String s, String t){

        int count[]= new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;

        }
        for(int c:count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a size");
    int n=sc.nextInt();
    String[]arr=new String[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextLine();
    }
    System.out.print(groupAnagrams(arr));
}}

