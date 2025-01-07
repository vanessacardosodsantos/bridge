package org.example.platform;

public class Facebook implements IPlatform{

    public Facebook() {
        configureRmtp();
        System.out.println("Facebook: Transmissão iniciada");
    }

    @Override
    public void configureRmtp() {
        authToken();
        System.out.println("Facebook: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicacao");
    }
}
