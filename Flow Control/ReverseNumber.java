// public class ReverseNumber {
//     public static void main(String[] args){
//         int Number = 12345;
//         int rev = 0;
//         for(int i=1; i<=Number; i++){
//             rev  = Number %10;
//             rev = rev + Number;
//             System.out.println(rev);
//         }
        
//     }
    
// }

public class ReverseNumber {
    public static void main(String[] args){
        int Number = 12345;
        int rev = 0;
        while(Number>0){
            rev  = Number %10;
            rev = rev + Number;
            System.out.println(rev);
        }
        
    }
    
}
