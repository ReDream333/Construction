package ru.itis.inf304.Emulator;

public class LayingCommunications extends BAZE {
    public LayingCommunications(String name, int days, Thread... threads) {
        super(name, days, threads);
    }

//    private String name = "Прокладка коммуникации";
//    private int days = 4;
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