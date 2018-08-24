package oop;

import net.println.kotlin.chapter4.Latitude;

/**
 * Created by benny on 4/4/17.
 */
public class StaticJava {
    public static void main(String... args) {
        Latitude latitude = Latitude.ofDouble(3.0);
        System.out.println(Latitude.TAG);
    }
}
