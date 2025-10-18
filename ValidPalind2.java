import java.util.Scanner;
class ValidPalind2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter a string");
        String s=sc.nextLine();
        boolean ans= plain(s);
        System.out.print(ans);
    }
    public static boolean plain(String s){
        StringBuilder sb=new StringBuilder();
        int i=0;String str=" ";String str1=" ";
        if(isPalindrome(s)){
            return true;
        }
        else{
            while(i>=0&&i<s.length()){
           

            }
            return false;
        }
    }
    public static boolean isPalindrome(String s){
        char ch=' '; char ch1=' ';
        if(s.length()==0){
            return true;
        }
        for(int i=0;i<=s.length()/2;i++){
            ch=s.charAt(i);
            ch1=s.charAt(s.length()-i-1);
            if(ch!=ch1){
                return false;
            }
        }
        return true;
    }
}