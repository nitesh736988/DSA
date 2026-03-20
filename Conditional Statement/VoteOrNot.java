// import java.util.*;
// public class VoteOrNot{
//     public static void main(String args[]){
//         int age = 3;
//         if(age>=18){
//             System.out.println("You are eligible to vote");

//         }
//         else{
//             System.out.println("You are not eligible to");
//         }
        
        

//     }

// }

import java.util.*;
public class VoteOrNot{
    public static void main(String args[]){
        int age = 17;
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else if(age>=17 && age<18){
            System.out.println("After some year we can vote");
        }
        else{
            System.out.println("You are not eligible to");
        }
        
        

    }

}