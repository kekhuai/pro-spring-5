package xyz.kekhuay.prospring5.ch5;

import xyz.kekhuay.prospring5.ch2.common.Guitar;
import xyz.kekhuay.prospring5.ch2.common.Singer;

public class Guitarist implements Singer {

    @Override
    public void sing() {
        System.out.println("Just keep me where the light is");
    }

    @AdviceRequired
    public void sing(Guitar guitar) {
        System.out.println("play: " + guitar.play());
    }

    public void sing2() {
        System.out.println("Just keep me where the light is");
    }

    public void rest() {
        System.out.println("zzz");
    }

}
