import java.util.Scanner;
public class UpperLower {
    public static void main(String[] args) {
        System.out.println("Enter the Character");
        Scanner sc =new Scanner(System.in);
        char s = (sc.nextLine()).charAt(0);
        if(s>='A'&&s<='Z'){
            System.out.println("It is a Uppercase");
        }
        else if(s>='a'&&s<='z'){
            System.out.println("It is a Lowercase");
        }
        sc.close();
        
    }
    
}
