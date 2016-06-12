package com.deingvard.printer;

import com.deingvard.printer.IPrinter;

/**
 * Created by igor on 12.06.16.
 */
public class ConsolePrinter implements IPrinter {

    @Override
    public void print(final String text){
        System.out.println(text);
    }

}
