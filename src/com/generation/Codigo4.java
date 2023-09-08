package com.generation;

import java.util.Scanner; // se importa Scanner

public class Codigo4 {
	public static void main(String[] args) { // se introduce en un main
		Scanner s = new Scanner(System.in); // se agrega System.in

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // se corrige a jugador 2
		//Scanner s2 = new Scanner(System.in);
		String j2 = s.nextLine();

		if (j1.equals(j2)) { // se elimina paréntesis
			System.out.println("Empate");
		} else {
			
			int g = 2;
			
			switch (j1) {
			case "piedra":
				if (j2.equals("tijeras")) {
					g = 1;
				}
				break; // se agrega break

			case "papel":
				if (j2.equals("piedra")) {
					g = 1;
				} // cierre if

				break; // se agrega break

			case "tijera":
				if (j2.equals("papel")) { // se cambia equals por comparador
					g = 1;
				}
				break; // se agrega break
			default:
				// System.out.println("opción inválida");
			}
			System.out.println("Gana el jugador " + g);
		}
	}

}
