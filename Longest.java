import java.util.ArrayList;
import java.util.Scanner;
public class Longest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> list= new ArrayList<>();
        System.out.println("enter a string");
        String s=sc.nextLine();int p=1;
        String[]arr=new String[s.length()];
        for(int i=0;i<arr.length;i++){
            if(p<s.length()){
            arr[i]=s.substring(0,p);
            p++;}
        }
        for(String i:arr){
            if(i!=null&&isUnique(i)){
                list.add(i);
            }
        }
        int max=list.get(0).length();
        for(int i=0;i<list.size();i++){
            if(list.get(i).length()>max){
                max=list.get(i).length();
            }
        }
        System.out.print(max);


    }
    public static boolean isUnique(String s){
        int[]count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int c:count){

            if(c!=1){
                return false;
            }
        }
        return true;
    }
}
    

