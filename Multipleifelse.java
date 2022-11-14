import java.util.Scanner;

public class Multipleifelse {
    public static void main(String[] args) {
        System.out.println("1.Drinks");
        System.out.println("2.Sweets");
        System.out.println("3.Snacks");
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if(ch==1){
            System.out.println("Drinks");

        }
        else if(ch==2){
            System.out.println("Sweets");
        }
        else if(ch==3){
            System.out.println("Snacks");
        }
        sc.close();
        
    }
    
}
