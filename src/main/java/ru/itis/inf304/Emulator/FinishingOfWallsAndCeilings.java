package ru.itis.inf304.Emulator;

public class FinishingOfWallsAndCeilings extends BAZE {
    public FinishingOfWallsAndCeilings(String name, int days, Thread... threads) {
        super(name, days, threads);
    }

//    private String name = "Отделка стен и потолка";
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