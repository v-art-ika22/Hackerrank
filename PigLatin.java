import java.util.Arrays;
import java.util.Scanner;
class PigLatin{
    public static String pigLatin(String s1){
        int p=0;
      
        for(int i=0;i<s1.length();i++){
    

            
            if(s1.charAt(p)=='a'||s1.charAt(p)=='e'||s1.charAt(p)=='i'||s1.charAt(p)=='o'||s1.charAt(p)=='u'){
                
                break;
            }
            else{
                if(p<s1.length()){
                
                char ch=s1.charAt(p);
                s1=s1.substring(p+1,s1.length())+ch;
                
                
            }
        }
    }
    s1=s1+"ay";
    
    
        
    
        return s1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        String[]arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(pigLatin(arr[i])+" ");
        }
    }
}
