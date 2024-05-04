package ru.itis.inf304.Emulator;

public class FoundationConstruction extends BAZE{




    public FoundationConstruction(String name, int days, Thread... threads) {
        super(name, days, threads);
    }

//    private String name = "Возведение фундамента";
//    private int days = 14;
//
//
//    @Override
//    public void run() {
//        System.out.println("Start-> " + name);
//        try {
//            Thread.sleep(1000 * days);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("End-> " + name);
//    }
}