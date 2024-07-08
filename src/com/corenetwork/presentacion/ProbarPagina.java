package com.corenetwork.presentacion;

import com.corenetwork.modelo.CalcularTPagina;

import java.util.Scanner;

public class ProbarPagina {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int tamanoA, tamanoP;
        System.out.println("Introduzca el tamaño del archivo");
        tamanoA = s1.nextInt();
        System.out.println("Introduzca el tamaño de la pagina");
        tamanoP = s1.nextInt();
        CalcularTPagina c1 = new CalcularTPagina(tamanoA,tamanoP);
        System.out.println("Paginas necesarias -> "+ c1.paginasNecesarias());

    }
}
