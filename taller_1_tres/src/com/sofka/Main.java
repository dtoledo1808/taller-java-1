package com.sofka;

import java.util.Scanner;

public class Main {
    public static String hijo;
    public static String nombreMadre;
    public static String nombrePadre;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellido:");
        hijo = entrada.nextLine();
        System.out.println("Ingrese el nombre y apellido de su madre: ");
        nombreMadre = entrada.nextLine();
        System.out.println("Ingrese el nombre y apellido de su padre: ");
        nombrePadre = entrada.nextLine();
        System.out.println("Yo " + hijo +" , soy hijo de "+ nombreMadre +" y "+nombrePadre);
    }
}
