package com.corenetwork.presentacion;

import com.corenetwork.modelo.ProcessManager;

import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ProbarProcesos {
    public static Scanner teclado = new Scanner(System.in);
    public static Scanner teclado2 = new Scanner(System.in);
    public static ProcessManager cp = new ProcessManager();
    public static void main(String[] args) {
        opciones();
    }
    public static void menu(){

        System.out.println("1. Crear procesos\n2. Ejecutar uno\n3. Ejecutar todos\n4. Salir");
        System.out.println("Que acción desea realizar ? ");

    }

    public static void opciones(){
        int respuesta;
        do{
            menu();
            respuesta = teclado.nextInt();
            switch(respuesta) {
                case 1 -> crearProcesos();
                case 2 -> System.out.println(cp.ejecutaProceso());
                case 3 -> System.out.println(cp.ejecutarTodo());
                case 4 -> System.out.println("Adios");
            }

        }
        while(respuesta>0&&respuesta<4);

    }

    public static void crearProcesos(){
        int id = 1;
        System.out.println("Indique el nombre del proceso");
        String nombre = teclado.next();
        System.out.println("Indique el tiempo del proceso con el siguiente formato mm:ss");
        String tiempo = teclado2.next();
        LocalTime duracion = LocalTime.parse(tiempo);
        cp.crearProceso(id++,nombre,duracion);
        System.out.println("Procesos actuales " + cp.toString());
    }

}
