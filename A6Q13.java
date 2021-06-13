package assignments;
import java.util.Scanner;

public class A6Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the water used in units");
        int waterUsed = input.nextInt();

        waterTax(waterUsed);
    }
    static int waterTax(int waterUsed){
        if (waterUsed <= 50)
        {
            double cost = waterUsed * 0.60;
            System.out.println("cost = $" + cost);

        }
        else if (waterUsed < 100)
        {
            double cost = waterUsed * 0.90;
            System.out.println("cost = $" + cost);
        }
        else if (waterUsed > 100 && waterUsed < 150)
        {
            double cost = (waterUsed * 0.90)+ 50;
            System.out.println("cost = $" + cost);
        }
        else if (waterUsed > 150)
        {
            double cost = (waterUsed * 0.90)+ 100;
            System.out.println("cost = $" + cost);
        }
        else
        {
            System.out.println("ERROR");
        }

        return 0;
    }
}
