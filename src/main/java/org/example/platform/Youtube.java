package org.example.platform;

public class Youtube implements IPlatform {

    public Youtube() {
        configureRmtp();
        System.out.println("Youtube: Transmissão iniciada");
    }

    @Override
    public void configureRmtp() {
        authToken();
        System.out.println("Youtube: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Youtube: Autorizando aplicacao");
    }
}
