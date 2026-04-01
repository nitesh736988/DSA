package GFGSTAR;

public class ReversePiramid {
    public static void main(String[] args) {
        // 1 2 3 4
        // 1 2 3
        // 1 2l
        // 1

        int number = 4;

        for(int i=1; i<=number; i++){
            for(int j=1; j<number-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
