import java.util.Scanner;
class Palindrome{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s= sc.nextLine();
        char ch1=' '; char ch2=' ';int flag=0;
        for(int i=0;i<s.length()/2;i++){
            ch1=s.charAt(i);
            ch2=s.charAt(s.length()-1-i);
            if(ch1!=ch2){
                System.out.println("Not Palindrome");
                
                flag=1;
                break;
            }
           

        }
        if(flag==0){
            System.out.println("Yes");
        }
    }
}