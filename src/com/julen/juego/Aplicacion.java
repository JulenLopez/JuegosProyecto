package com.julen.juego;

import com.julen.juego.ui.Vista;

import java.io.IOException;

public class Aplicacion {

    public static void main(String[] args) {
        Vista vista = new Vista();

        try {
            Modelo modelo = new Modelo();
            Controlador controlador = new Controlador(vista, modelo);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
