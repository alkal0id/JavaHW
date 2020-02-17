package com.alpha.work1;

public class Runner {
    public static void run(){
//        Device dev = new Device("weqweqweq", "sony", 100.500);
//        System.out.println(dev.toString());
//        Monitor mon = new Monitor("dddsd32323dsdsd", "Samsung", 12500.00, 1024, 768);
//        System.out.println(mon.toString());
//        EthernetAdapter ea = new EthernetAdapter("asasas3223wef23f", "TP-Link", 250.50, 128000, "aa-88-ff-dd-00-fa");
//        System.out.println(ea.toString());

        Device[] devices = {new Device("weqweqweq", "sony", 100.500), new Monitor("dddsd32323dsdsd", "Samsung", 12500.00, 1024, 768), new EthernetAdapter("asasas3223wef23f", "TP-Link", 250.50, 128000, "aa-88-ff-dd-00-fa")};
        for (Device dev:devices){
            System.out.println(dev.hashCode());
            System.out.println(dev.equals(dev));
        }
    }
}
