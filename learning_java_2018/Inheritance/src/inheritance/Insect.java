/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author namehere
 */
public class Insect {
    int age;
    int numberOfLegs;

    public Insect(int age, int numberOfLegs) {
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }

    public void says() {
        System.out.println("...");
    }

    public void crawl() {
        System.out.println("The insect crawled");
    }

}

