package org.example.platform;

public class DisneyPlus implements IPlatform{

    public DisneyPlus() {
        configureRmtp();
        System.out.println("DisneyPlus: Iniciado a gravação");
    }

    @Override
    public void configureRmtp() {
        authToken();
        System.out.println("Disney plus: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Disney plus: Iniciando a gravacao");
    }
}
