package com.julen.juego.base;

import java.io.Serializable;

public class Juego implements Serializable {

    public enum Genero1 {
        Accion,Arcade,Aventura_Grafica,Aventuras,Baile,Belica,Comedia,Conduccion,Construccion,
        Deportes,Educativo,Estrategia,Fantastica,Fitness,Habilidad,Karaoke,Kinect,Lucha,Manga,
        Mmo,Move,Mundo_Abierto,Musical,Novela_Visual,Plataformas,Puzzle,Recopilatorio,Rol,
        Series_TV,Shooter,Simulador,Social,Survival_horror,Suspense,Terror,Udraw,Utilidad
    }

    public enum Genero2{
        Nada,Accion,Arcade,Aventura_Grafica,Aventuras,Baile,Belica,Comedia,Conduccion,Construccion,
        Deportes,Educativo,Estrategia,Fantastica,Fitness,Habilidad,Karaoke,Kinect,Lucha,Manga,
        Mmo,Move,Mundo_Abierto,Musical,Novela_Visual,Plataformas,Puzzle,Recopilatorio,Rol,
        Series_TV,Shooter,Simulador,Social,Survival_horror,Suspense,Terror,Udraw,Utilidad
    }

    public enum Plataforma {
        Atari,Master_System,NES,Gameboy,Sega_Mega_Drive,Super_nintendo,PLayStation,Nintendo64,
        GB_color,PlayStation2,GB_advance,GameCube,Xbox,PS3,Xbox360,Wii,PSP,MintendoDs,NintendoDsi,
        PSP_Go,PS4,Xbox_One,Nintendo3ds,PSVita,NintendoSwitch,PC
    }

    public String genero1;
    public String genero2;
    public String nombre;
    public String ratingEdad;
    public String rating;
    public String plataforma;
    public String imagen;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRatingEdad() {
        return ratingEdad;
    }

    public void setRatingEdad(String ratingEdad) {
        this.ratingEdad = ratingEdad;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getGenero1() {
        return genero1;
    }

    public void setGenero1(String genero1) {
        this.genero1 = genero1;
    }

    public String getGenero2() {
        return genero2;
    }

    public void setGenero2(String genero2) {
        this.genero2 = genero2;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", ratingEdad='" + ratingEdad + '\'' +
                ", rating='" + rating + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
