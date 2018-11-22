package com.julen.juego;

import com.julen.juego.base.Juego;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

//Aqui se crean los metodos. Y los momos
public class Modelo {

    ArrayList<Juego> juegos;

    Modelo() throws IOException, ClassNotFoundException {
        if(new File("Juegos.txt").exists())//Compruebo si existe el fichero si este lo hace llamo al metodo de leer ficheros. Si no crea un nuevo arraylist y no hace falta crear el nuevo fichero se genera solo
            leerFich();
        else
            juegos = new ArrayList<>();
    }



    public void escribirFich() throws IOException {
       /* FileWriter fichero = null;
        PrintWriter escritor = null;

        fichero = new FileWriter("Juegos.txt");
        escritor = new PrintWriter(fichero);
        escritor.println();*/

       ObjectOutputStream serializador = new ObjectOutputStream(new FileOutputStream("Juegos.txt"));//Creo un serializador que va a guardar los objetos juegos en el txt
       serializador.writeObject(juegos);//Escribo los objetos en el fichero
       serializador.close();//cierro el serializador
    }

    public void leerFich() throws FileNotFoundException, IOException, ClassNotFoundException {
       /* File fichero = null;
        FileReader letor = null;
        BufferedReader buffer = null;

        buffer = new BufferedReader(new FileReader(new File("Juegos.txt")));
        String linea = null;
        while((linea= buffer.readLine())!=null){
            System.out.println(linea);
        */

       ObjectInputStream desirializador = new ObjectInputStream(new FileInputStream("Juegos.txt"));
       juegos = (ArrayList<Juego>) desirializador.readObject();

    }

    public void eliminar(Juego juego) throws IOException {
        juegos.remove(juego.getNombre());
        escribirFich();
    }

    public void guardar(Juego juego) throws IOException {

        juegos.add(juego);//Añado un objeto juego al ArrayList de juegos
        escribirFich();//llamo al metodo de escribir en ficheros

    }


    public ArrayList<Juego> getJuegos(int i){
        return new ArrayList<Juego>((Collection<? extends Juego>) juegos.get(i));
    }
}
