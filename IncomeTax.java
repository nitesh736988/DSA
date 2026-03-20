import java.util.*;
public class IncomeTax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();

        if(income<=500000){
            System.out.println("Tax is 0%");
        }
    }
}
