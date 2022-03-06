package com.sofka;

import java.util.Scanner;

public class Main {
    public static String nombreMascota;
    public static String tipoMascota;
    public static String nombrePropietario;
    public static int edadMascota;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el nombre de su mascota:");
        nombreMascota = entrada.nextLine();
        System.out.println("que tipo de animal es:");
        tipoMascota = entrada.nextLine();
        System.out.println("cual es su nombre y apellido:");
        nombrePropietario = entrada.nextLine();
        System.out.println("que edad tiene su mascota(en años):");
        edadMascota = entrada.nextInt();

        System.out.println(nombreMascota+" es un(a) "+tipoMascota+", el cual, tiene "+edadMascota+" años de edad y "+nombrePropietario+" es actualmente su dueño(a).");
    }
}
