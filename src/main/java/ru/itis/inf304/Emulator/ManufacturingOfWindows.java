package ru.itis.inf304.Emulator;

public class ManufacturingOfWindows extends BAZE {
    public ManufacturingOfWindows(String name, int days, Thread... threads) {
        super(name, days, threads);
    }

//    private String name = "Изготовление окон";
//    private int days = 7;
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