package xyz.kekhuay.prospring5.ch5;

import xyz.kekhuay.prospring5.ch2.common.Singer;

public class GreatGuitarist implements Singer {

    @Override
    public void sing() {
        System.out.println("I shot the sheriff, \nBut I did not shoot the deputy");
    }

}
