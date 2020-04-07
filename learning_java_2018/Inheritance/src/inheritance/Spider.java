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
public class Spider extends Insect {

    boolean isPoisonous;

    public Spider(int age, boolean isPoisonous) {
        super(age, 8);
        this.isPoisonous = isPoisonous;
    }

    public void says() {
        System.out.println("HISSSS");
    }
}

