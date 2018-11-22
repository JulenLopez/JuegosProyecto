package com.julen.juego;

import com.julen.juego.base.Juego;
import com.julen.juego.ui.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//Este controla las excepciones
public class Controlador implements ActionListener, MouseListener {

    private Vista vista;
    private Modelo modelo;

    Controlador(Vista vista, Modelo modelo){
        this.vista=vista;
        this.modelo=modelo;

        poblaComboBox();

    }


    public void refrescarLista(){

        vista.mListaJuegos.removeAllElements();
        int i=0;
        for(Juego juego : modelo.getJuegos(i)){
            vista.mListaJuegos.addElement(juego);
            i++;
        }
    }

    private void poblaComboBox(){
        for(Juego.Genero1 genero1: Juego.Genero1.values())
            vista.cbGenero1.addItem(genero1);

        for(Juego.Genero2 genero2 : Juego.Genero2.values())
            vista.cbGenero2.addItem(genero2);

        for(Juego.Plataforma plataforma : Juego.Plataforma.values())
            vista.cbPlataforma.addItem(plataforma);

    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
