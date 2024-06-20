package com.basics_java;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    // @SuppressWarnings({"resource"})
    public static void main(String[] args) {
        // String mensaje = "Hola\nMundo"; // Salto de linea entre "hola" y "Mundo"
        // String tabla = "Nombre\tApellido\tEdad"; // Tabuladores entre las palabras
        // String retroceso = "123\b45"; // Se elimina el '3' con el retroceso
        // String ruta = "C:\\Users\\Usuario\\Documentos"; // Incluyendo una barra invertida en una ruta
        // String comillas = "\"Esto es una cita\""; // Incluyendo comillas dobles en una cadena de texto

        // int age = 0;
        // int value = 0;
        // int acum = 0;
        // int positive_numbers = 0;
        // int negative_numbers = 0;

        // System.out.println(mensaje);
        // System.out.println(tabla);
        // System.out.println(retroceso);
        // System.out.println(ruta);
        // System.out.println(comillas);


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age");
        // age = sc.nextInt();
        // if(age >= 18){
        //     System.out.println("legal age");
        // } else{
        //     System.out.println("under age");
        // }

        
       
    //    try (Scanner sc = new Scanner(System.in)) {
            // while (value >=0) {
            //     System.out.println("Enter a value greater than zero(0): ");
            //     value = sc.nextInt();
            //     sc.nextLine();
            //     if(value < 0) continue;
            //     acum += value;
            // }

            // do{
            //     System.out.println("Enter a value greater than zero(0): ");
            //     value = sc.nextInt();
            //     sc.nextLine();
            //     if(value < 0) break;
            //     acum += value;
            // }while(value >=0);


            // for(int i=1; i<=4; i++){
            //     System.out.println("Enter a value greater than zero(0):");
            //     value = sc.nextInt();
            //     sc.nextLine();
            //     if(value < 0){
            //         negative_numbers++;
            //         acum += value;
            //     }else{
            //         positive_numbers++;
            //         acum += value;
            //     }
            // }
        // }
    //    System.out.println(MessageFormat.format("The sum is = {0}", acum));




        // Student myStudent = new Student();
        // myStudent.setName("Juanito");
        // myStudent.setLast_name("Perez");
        // myStudent.setAge(13);



        // ArrayList<String> list = new ArrayList<>();
        // ------------------------------
        // list.add("Backend Java");
        // list.add("monda");
        // -------------------
        // list.add(0, "Fundamentos");
        // -----------------------
        // System.out.println(list);
        // -----------------------------
        // String elemento = list.get(0);
        // list.set(0, "Programacion web");
        // -----------------------------
        // int amount = list.size();
        // -----------------------------
        // System.out.println(elemento);
        // System.out.println(list);
        // System.out.println(amount);
        // list.clear();
        // ---------------------
        

        // -----------------------------
        ArrayList<Student> StudentsList = new ArrayList<>();
        Student student = new Student();
        // -----------------------------
        try (Scanner sc = new Scanner(System.in)){
            while (JOptionPane.showConfirmDialog(null, "Quiere Agregar un estudiante", "Informacion", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0) {
                System.out.println("Enter the name of the student");
                student.setName(sc.nextLine());
                sc.nextLine();
                System.out.println("Enter the last name of the student");
                student.setLast_name(sc.nextLine());
                sc.nextLine();
                System.out.println("Enter the age of the student");
                student.setAge(sc.nextInt());
                sc.nextLine();
                StudentsList.add(student);
            }
        }
        
            
        for(Student item: StudentsList){
            System.out.println(item.getName());
        }
        

        // Realizar un ahorcado
        // Hay 10 palabras y se elige una de forma randomica
        // Tiene 3 vidas
        // Si ingresa una misma letra, se le avisa que ya la ha ingresao para que ingrese otra


    }

    // public int suma(int a, int b){
    //     return a+b;
    // }

}