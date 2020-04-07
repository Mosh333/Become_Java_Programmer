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
import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class Inheritance {
    public static void main(String[] args) {
        Insect insect = new Insect(5, 6);
        Spider spider = new Spider(13, true);
        Cricket cricket = new Cricket(2, 1.25);

        insect.crawl();
        insect.says();

        spider.crawl();
        spider.says();

        cricket.crawl();
        cricket.says();
        cricket.jump();

        if (spider instanceof Insect && spider instanceof Spider) {
            System.out.println("Spider is an insect and a spider");
        }

    }

}

