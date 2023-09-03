package com.quena.peluqueriacanina.logica;

import com.quena.peluqueriacanina.persistencia.ControladoraPersistencia;


public class Controladora {
    
   ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreP, String raza, String color, String observaciones, String alergico, String atencion, String nombreDuenio, String celular) {
         Duenio duenio = new Duenio();
         duenio.setNombre(nombreDuenio);
         duenio.setCelular(celular);
         
         Mascota mascota = new Mascota();
         mascota.setNombre(nombreP);
         mascota.setRaza(raza);
         mascota.setColor(color);
         mascota.setAlergico(alergico);
         mascota.setAtencion_especial(atencion);
         mascota.setObservaciones(observaciones);
         mascota.setDuenio(duenio);
         
         
         controlPersis.guardar(duenio, mascota);
         
         
         
    }
   
   
   
   
   
   
 
}
