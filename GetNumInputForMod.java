import java.util.Scanner;

public class GetNumInputForMod {
    public static void main(String[] args) {
        int x, y, mod;
        Scanner myobj = new Scanner(System.in);

        System.out.println("Your First Number:");
        x = myobj.nextInt();

        System.out.println("Your Second Number:");
        y = myobj.nextInt();

        mod = x % y;
        System.out.println(" Calculatyion is " + mod);
    }
    
}
