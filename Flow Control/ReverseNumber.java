// public class ReverseNumber {

//     public static void main(String[] args){
//         int number = 10899;
//         while(number>0){
//             int reverseNumber = number % 10;
//             System.out.print(reverseNumber + " ");
//             number = number/10;
//         } 
//     }
// }


public class ReverseNumber {

    public static void main(String[] args){
        int number = 10899;
        int rev = 0;
        while(number>0){
            int lastdigit = number % 10;
            rev = (rev * 10 ) + lastdigit;
            number = number/10;
        } 
        System.out.println(rev);
    }
}