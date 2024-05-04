package ru.itis.inf304.Emulator;

public class InstallationOfPlumbing extends BAZE {
    public InstallationOfPlumbing(String name, int days, Thread... threads) {
        super(name, days, threads);
    }

//    private String name = "Установка сантехники";
//    private int days = 2;
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