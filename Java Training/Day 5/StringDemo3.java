import java.util.Scanner;
public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s=sc.nextLine();
        System.out.println("value of a"+a);
        System.out.println("value of s"+s);
        System.out.println(a+" "+s.trim());
    }
}
