import java.util.Scanner;
public class VowelConstant {
    public static void main(String[] args) {
        System.out.println("Enter the Alphabate");
        Scanner sc= new Scanner(System.in);
        char s = (sc.nextLine()).charAt(0);
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
            System.out.println("This is vowel");
        }
        else if(s=='A'||s=='E'||s=='I'||s=='O'||s=='U') {
            System.out.println("This is a Vowel");
        }
        else{
            System.out.println("This is a Constant");
        }
        sc.close();
    
    }
    
}
