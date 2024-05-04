package ru.itis.inf304.Emulator;

import ru.itis.inf304.Emulator.Workers;

public class Plumber extends Workers {
    public Plumber(String name, Thread... threads) {
        super(name, threads);
    }
}
