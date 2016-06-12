package com.deingvard.readers;

import com.deingvard.readers.IReader;

/**
 * Created by igor on 12.06.16.
 */
public class PredefinedReader implements IReader{

    private final String str;

    public PredefinedReader(final String str) {
        this.str = str;
    }

    @Override
    public String read() {
        return "change:) change:)";
    }
}
