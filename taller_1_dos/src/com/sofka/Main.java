package com.sofka;

import java.util.Scanner;

public class Main {

    public static String nombre;
    public static String apellido;
    public static int edad;
    public static int estatura;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = entrada.nextLine();
        System.out.println("ingrese su edad:");
        edad = entrada.nextInt();
        System.out.println("Ingrese su estatura en cm: ");
        estatura = entrada.nextInt();
        System.out.println("Los datos fueron ingresados correctamente");

    }
}
