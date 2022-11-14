import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        System.out.println("Enter the Cost Price");
        System.out.println("Enter the Selling Price");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int x = sc.nextInt();
        int y =sc.nextInt();
        int val = x-y;
        if(val<0){
            System.out.println("Profit"+val);
        }
        else{
            System.out.println("Loss"+val);
        }
        sc1.close();
        sc.close();
    

    }
    
}
