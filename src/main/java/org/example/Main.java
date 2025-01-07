package org.example;

import org.example.platform.*;
import org.example.transmission.AdvancedLive;
import org.example.transmission.Live;
import org.example.transmission.RecordLive;

public class Main {
    public static void main(String[] args) {
        startAdvancedPlatform(new Youtube());
        startAdvancedPlatform(new TwitchTv());
        startAdvancedPlatform(new Facebook());
        startRecordLive(new DisneyPlus());
    }

    public static void startLive(IPlatform platform) {
        System.out.println("....aguarde");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
    }

    public static void startAdvancedPlatform(IPlatform platform) {
        System.out.println("....aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.subtitles();
        advancedLive.comments();
        advancedLive.result();
    }

    public static void startRecordLive(IPlatform platform){
        RecordLive recordLive = new RecordLive(platform);
        recordLive.record();
    }
}