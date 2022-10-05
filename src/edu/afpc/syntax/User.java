package edu.afpc.syntax;

public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV turned on? " + smartTv.turnedOn);
        System.out.println("TV channel: " + smartTv.channel);
        System.out.println("TV volume: " + smartTv.volume);
        smartTv.toggleOn();
        System.out.println("TV turned on? " + smartTv.turnedOn);
        smartTv.toggleOn();
        System.out.println("TV turned on? " + smartTv.turnedOn);
        smartTv.changeChannel(10);
        smartTv.raiseVolume();
        smartTv.raiseVolume();
        smartTv.raiseVolume();
        smartTv.raiseVolume();
        smartTv.raiseVolume();
        smartTv.raiseVolume();
        smartTv.raiseVolume();
        smartTv.raiseVolume();
        smartTv.raiseVolume();
        smartTv.raiseVolume();
        System.out.println("TV volume: " + smartTv.volume);


    }
}

