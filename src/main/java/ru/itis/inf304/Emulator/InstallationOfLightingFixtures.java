package ru.itis.inf304.Emulator;

public class InstallationOfLightingFixtures extends BAZE {
    public InstallationOfLightingFixtures(String name, int days, Thread... threads) {
        super(name, days, threads);
    }

//    private String name = "Установка осветительных приборов";
//    private int days = 1;
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