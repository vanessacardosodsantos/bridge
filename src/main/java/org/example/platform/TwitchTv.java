package org.example.platform;

public class TwitchTv implements IPlatform{

    public TwitchTv() {
        configureRmtp();
        System.out.println("TwitchTv: Transmissão iniciada");
    }

    @Override
    public void configureRmtp() {
        authToken();
        System.out.println("TwitchTv: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTv: Autorizando aplicacao");
    }
}


