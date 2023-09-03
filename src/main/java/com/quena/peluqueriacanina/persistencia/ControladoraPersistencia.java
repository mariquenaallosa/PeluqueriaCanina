package com.quena.peluqueriacanina.persistencia;

import com.quena.peluqueriacanina.logica.Duenio;
import com.quena.peluqueriacanina.logica.Mascota;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();
    
    

    public void guardar(Duenio duenio, Mascota mascota) {
       duenioJpa.create(duenio);
       mascoJpa.create(mascota);
    }
    
    
}
