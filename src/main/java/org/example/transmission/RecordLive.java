package org.example.transmission;

import org.example.platform.IPlatform;

public class RecordLive extends Live {

    public RecordLive(IPlatform platform){
        super(platform);
    }

    public void record(){
        broadcasting();
        result();
        System.out.println("Iniciado a gravação");
    }
}
