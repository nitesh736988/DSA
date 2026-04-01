package Pattern;

public class HollowStar {
    public static void main(String[] args){
        int number = 5;
        for(int i=0; i<number; i++){
            for(int j=0; j<number; j++){
                if((i == 0 || i == number-1 || j==0 || j == number-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();

        }
    }
    
}
