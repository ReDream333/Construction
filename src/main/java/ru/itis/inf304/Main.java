package ru.itis.inf304;

import ru.itis.inf304.Emulator.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Thread> thList = new ArrayList<>();
        thList.add(new Thread(new BAZE("Начало работы", 0)));
        thList.add(new Thread(new BAZE("Проект", 7, thList.get(0))));
        thList.add(new Thread(new BAZE("Изготовление окон", 7, thList.get(1))));
        thList.add(new Thread(new BAZE("Изготовление дверей", 7, thList.get(1))));
        thList.add(new Thread(new BAZE("Возведение фундамента", 14, thList.get(1))));
        thList.add(new Thread(new BAZE("Прокладка коммуникаций", 4, thList.get(4))));
        thList.add(new Thread(new BAZE("Возведение стен", 14, thList.get(4))));
        thList.add(new Thread(new BAZE("Возведение крыши", 3, thList.get(6))));
        thList.add(new Thread(new BAZE("Установка окон", 1, thList.get(2), thList.get(7))));
        thList.add(new Thread(new BAZE("Установка дверей", 1, thList.get(3), thList.get(7))));
        thList.add(new Thread(new BAZE("Установка отопительных приборов", 3, thList.get(5), thList.get(8), thList.get(9))));
        thList.add(new Thread(new BAZE("Прокладка электропроводки", 3, thList.get(5), thList.get(7))));
        thList.add(new Thread(new BAZE("Oтделка стен и потолка", 7, thList.get(8), thList.get(9), thList.get(11))));
        thList.add(new Thread(new BAZE("Oтделка пола", 7, thList.get(12))));
        thList.add(new Thread(new BAZE("Установка осветительных приборов", 1, thList.get(12))));
        thList.add(new Thread(new BAZE("Установка сантехники", 2, thList.get(5), thList.get(11), thList.get(12))));
        thList.add(new Thread(new BAZE("Завершение строительства", 0,thList.get(0), thList.get(1), thList.get(2), thList.get(3), thList.get(4), thList.get(5), thList.get(6), thList.get(7), thList.get(8), thList.get(9), thList.get(10), thList.get(11), thList.get(12), thList.get(13), thList.get(14), thList.get(15))));

//        BeginningOfWork beginningOfWork = ((new BeginningOfWork("Начало работы", 0)));
//        thList.add(beginningOfWork);
//        Project project = ((new Project("Проект", 7, thList.get(0))));
//        thList.add(project);
//        ManufacturingOfWindows manufacturingOfWindows = ((new ManufacturingOfWindows("Изготовление окон", 7, thList.get(1))));
//        thList.add(manufacturingOfWindows);
//        MakingDoors makingDoors = ((new MakingDoors("Изготовление дверей", 7, thList.get(1))));
//        thList.add(makingDoors);
//        FoundationConstruction foundationConstruction = ((new FoundationConstruction("Возведение фундамента", 14, thList.get(1))));
//        thList.add(foundationConstruction);
//        LayingCommunications layingCommunications = ((new LayingCommunications("Прокладка коммуникаций", 4, thList.get(4))));
//        thList.add(layingCommunications);
//        ErectionOfWalls erectionOfWalls = ((new ErectionOfWalls("Возведение стен", 14, thList.get(4))));
//        thList.add(erectionOfWalls);
//        RoofConstruction roofConstruction = ((new RoofConstruction("Возведение крыши", 3, thList.get(6))));
//        thList.add(roofConstruction);
//        InstallationOfWindows installationOfWindows = ((new InstallationOfWindows("Установка окон", 1, thList.get(2), thList.get(7))));
//        thList.add(installationOfWindows);
//        DoorInstallation doorInstallation = ((new DoorInstallation("Установка дверей", 1, thList.get(3), thList.get(7))));
//        thList.add(doorInstallation);
//        InstallationOfHeatingDevices installationOfHeatingDevices = ((new InstallationOfHeatingDevices("Установка отопительных приборов", 3, thList.get(5), thList.get(8), thList.get(9))));
//        thList.add(installationOfHeatingDevices);
//        ElectricalWiring electricalWiring = ((new ElectricalWiring("Прокладка электропроводки", 3, thList.get(5), thList.get(7))));
//        thList.add(electricalWiring);
//        FinishingOfWallsAndCeilings finishingOfWallsAndCeilings = ((new FinishingOfWallsAndCeilings("Oтделка стен и потолка", 7, thList.get(8), thList.get(9), thList.get(11))));
//        thList.add(finishingOfWallsAndCeilings);
//        FloorFinishing floorFinishing = ((new FloorFinishing("Oтделка пола", 7, thList.get(12))));
//        thList.add(floorFinishing);
//        InstallationOfLightingFixtures installationOfLightingFixtures = ((new InstallationOfLightingFixtures("Установка осветительных приборов", 1, thList.get(12))));
//        thList.add(installationOfLightingFixtures);
//        InstallationOfPlumbing installationOfPlumbing = ((new InstallationOfPlumbing("Установка сантехники", 2, thList.get(5), thList.get(11), thList.get(12))));
//        thList.add(installationOfPlumbing);
//        CompletionOfConstruction completionOfConstruction = ((new CompletionOfConstruction("Завершение строительства", 0,thList.get(0), thList.get(1), thList.get(2), thList.get(3), thList.get(4), thList.get(5), thList.get(6), thList.get(7), thList.get(8), thList.get(9), thList.get(10), thList.get(11), thList.get(12), thList.get(13), thList.get(14), thList.get(15))));
//        thList.add(completionOfConstruction);



        Mason mason = new Mason("Каменьщик", thList.get(0), thList.get(4), thList.get(6));
        Carpenter carpenter = new Carpenter("Плотник", thList.get(0), thList.get(2), thList.get(3),  thList.get(7),  thList.get(8),  thList.get(9));
        Plumber plumber= new Plumber("Сантехник", thList.get(0), thList.get(5), thList.get(10), thList.get(15));
        Plasterer plasterer = new Plasterer("Штукатур", thList.get(0), thList.get(12), thList.get(13));
        Electrician electrician = new Electrician("Электрик", thList.get(0), thList.get(11), thList.get(14));


        thList.add(mason);
        thList.add(carpenter);
        thList.add(plumber);
        thList.add(plasterer);
        thList.add(electrician);


        long start = System.currentTimeMillis();
        thList.forEach(t -> t.start());

        for (Thread t: thList) {
            t.join();
        }
        long stop = System.currentTimeMillis();
        System.out.println((stop-start)/1000 + " - общая длительность строительства");

        System.out.println(mason.getTime() + " - общая длительность работы каменщиков");
        System.out.println(carpenter.getTime() + " - общая длительность работы плотников");
        System.out.println(plumber.getTime() + " - общая длительность работы сантехников");
        System.out.println(plasterer.getTime() + " - общая длительность работы штукатуров");
        System.out.println(electrician.getTime() + " - общая длительность работы электриков");
//        System.out.println((endOfWork-start)/1000 + " - общая длительность работы каменщиков");





    }
}