package it.euris.academy.strutturali.bridge.refactoringGuruExample;

import it.euris.academy.strutturali.bridge.refactoringGuruExample.devices.Device;
import it.euris.academy.strutturali.bridge.refactoringGuruExample.devices.Radio;
import it.euris.academy.strutturali.bridge.refactoringGuruExample.devices.Tv;
import it.euris.academy.strutturali.bridge.refactoringGuruExample.remotes.AdvancedRemote;
import it.euris.academy.strutturali.bridge.refactoringGuruExample.remotes.BasicRemote;

public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();
        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
