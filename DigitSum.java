import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter a number");
        int sum=0;
        int n= sc.nextInt();
        while(n>0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        System.out.print(sum);
    }}
    

