package bridge;

import bridge.devices.IDevice;
import bridge.devices.Radio;
import bridge.devices.TV;
import bridge.remotes.AdvancedRemote;
import bridge.remotes.BasicRemote;

public class Demo {
    /*Пример: Мост между приборами и пультами дистанционного управления
      Этот пример показывает разделение кода пультов дистанционного управления и бытовых приборов.
      Пульты выступают «абстракцией», а приборы — «реализацией».
      Одни и те же приборы могут работать с разными пультами, а пульты управлять разными устройствами.
      Применив паттерн Мост, мы можем изменять классы пультов и приборов независимо друг от друга.*/


    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(IDevice device){
        System.out.println("Test with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Test with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
