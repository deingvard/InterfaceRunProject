package com.deingvard;

import com.deingvard.printer.AdvConsolePrinter;
import com.deingvard.printer.ConsolePrinter;
import com.deingvard.printer.IPrinter;
import com.deingvard.readers.IReader;
import com.deingvard.readers.PredefinedReader;

/**
 * Created by igor on 12.06.16.
 */
public class Replacer {

    private final IReader reader;

    private final IPrinter printer;

    public Replacer(final IReader reader,
                    final IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public void replace(){
        final String text = reader.read();
        final String replacedText = text.replace(":)","=)");
        printer.print(replacedText);
    }

    public static void main(String[] args) {
        final IReader reader = new PredefinedReader("rsgrgr:) gregr :)");
        final IPrinter printer = new ConsolePrinter();
        final IPrinter advPrinter = new AdvConsolePrinter();
        final Replacer replacer = new Replacer(reader,printer);
        final Replacer advReplacer = new Replacer(reader,advPrinter);
        replacer.replace();
        advReplacer.replace();
    }
}
