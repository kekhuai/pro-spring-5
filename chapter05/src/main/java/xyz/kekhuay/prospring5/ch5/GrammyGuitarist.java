package xyz.kekhuay.prospring5.ch5;

import xyz.kekhuay.prospring5.ch2.common.Guitar;

public class GrammyGuitarist {

    public void sing() {
        System.out.println("sing: Gravity is working againt me\nAnd gravity wants to bring me down");
    }

    public void sing(Guitar guitar) {
        System.out.println("play: " + guitar.play());
    }

    public void rest() {
        System.out.println("zzz");
    }

    public void talk() {
        System.out.println("talk");
    }

}
