import java.util.Scanner;

public class DigitCharSpe {
    public static void main(String[] args) {
        System.out.println("Press the any key");
        Scanner sc = new Scanner(System.in);
        char s = (sc.nextLine()).charAt(0);
        
        if(s>='a'&&s<='z'||s>='A'&&s<='Z'){
            System.out.println("This is Alphabate");
        }
        else if(s>='0'&&s<='9'){
            System.out.println("This is Digit");
        }
        else{
            System.out.println("It is a Special Character");
        }
        sc.close();
    }
    
}
