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
class Cricket extends Insect {

    double length;

    public Cricket(int age, double length) {
        super(age, 6);
        //System.out.println(super.age);
        this.length = length;
    }

    public void says() {
        System.out.println("CHIRP");
    }

    public void jump() {
        System.out.println("A cricket jumped!");
    }

}
