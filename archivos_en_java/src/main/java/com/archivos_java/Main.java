package com.archivos_java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String paquete = "src/main/java/com/archivos_java/data";
        String file = "contenido.txt";

        File carpeta = new File(paquete);
        File archivo = new File(carpeta, file);

        try{
            if(archivo.createNewFile()){
                System.out.println("FIle created: " + archivo.getName());
            } else {
                System.out.println("The file already exists");
            }
        } catch (IOException e) {
            System.out.println("Error MONDA");
            e.printStackTrace();
        }

    }
}