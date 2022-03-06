package com.sofka;

import java.util.Scanner;

public class Main {
    public static String capital;
    public static String pais;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de una ciudad capital:");
        capital = entrada.nextLine();
        System.out.println("a que pais pertenece esta ciudad: ");
        pais = entrada.nextLine();
        System.out.println(capital+", es la capital de "+pais);
    }
}
