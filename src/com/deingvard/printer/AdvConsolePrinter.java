package com.deingvard.printer;

/**
 * Created by igor on 12.06.16.
 */
public class AdvConsolePrinter implements IPrinter{


    @Override
    public void print(String text) {
        System.out.println(text);
        System.out.println(String.format("String length:%d",text.length()));
    }
}
