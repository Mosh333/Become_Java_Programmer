
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.text.SimpleDateFormat;  

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author namehere
 */
public class java_basics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Moshiur");
//        
//        Car first_car = new Car(25.5,"1BC32E", Color.BLUE,true);
//        
//        first_car.changePaintColor(Color.red);
//        
//        System.out.println("Car's paint color is: "+first_car.paintColor.toString());
//
//        Scanner sc = new Scanner(System.in);
//        int userNumber = sc.nextInt();
//        System.out.println(userNumber);
//        double usernumber2 = sc.nextDouble();
//        System.out.println(usernumber2);
//        
//        String userInput = sc.next();
//
//        String uppercased = userInput.toUpperCase();
//        System.out.println(userInput);
//        System.out.println(uppercased);
//
//        char firstCharacter = userInput.charAt(0);
//        System.out.println(firstCharacter);
//        
//        System.out.println("Contains: " + userInput.contains("Enter".toLowerCase()));
//        
//        int[] numbers = new int[5];
//        
//        numbers[0] = 31;
//        numbers[1] = 45;
//        numbers[2] = 22;
//        numbers[3] = 98;
//        numbers[4] = 10;
//        
//        int[] numbers2 = {31,45,22,98,10};
//        Arrays.sort(numbers2);
//        System.out.println(Arrays.toString(numbers2));
//        
//        String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};
//        System.out.println("Index 1: " + myFavoriteCandyBars[1]);
//        myFavoriteCandyBars[2] = "Butterfinger";
//        System.out.println("Index 2: " + myFavoriteCandyBars[2]);
//        System.out.println(myFavoriteCandyBars.length);
//        
//        System.out.println(Array.get(myFavoriteCandyBars, 2));
//
//
//        Car first_car = new Car(25.5,"1BC32E", Color.BLUE,true);
//        
//        double myCarSpeed = 50;
//        myCarSpeed = first_car.speedingup(myCarSpeed);
//        
//        System.out.println(myCarSpeed);
//
//        String s = "dog";
//        String replacedF = s.replace('d','f');
//        System.out.println(replacedF);

        CashRegister newCompanyCashRegister = new CashRegister("Microsoft");
        newCompanyCashRegister.doTransaction(200.00, "1988-09-29");
        newCompanyCashRegister.doRefund(-100.00, "1988-09-30");
        newCompanyCashRegister.showRegister();
        
    }
    
}
