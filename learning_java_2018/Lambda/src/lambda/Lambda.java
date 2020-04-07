/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author namehere
 */
public class Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Answerable phone = () -> "Hello";

         System.out.println(phone.answer());

         Predicate isOdd = n -> n % 2 != 0;
         System.out.println(isOdd.test(2));

         Predicate isEven = n -> n % 2 == 0;
         System.out.println(isEven.test(2));
    }
    
}
