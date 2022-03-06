package com.sofka;

import java.util.Scanner;

public class Main {

    public static String nombre;
    public static String apellido;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = entrada.nextLine();
        System.out.println("Los datos fueron ingresados correctamente");
    }
}
