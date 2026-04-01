package Pattern;

public class HollowStar {
    public static void main(String[] args){
        int number = 4;
        for(int i=0; i<=number; i++){
            for(int j=1; j<=number*i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
