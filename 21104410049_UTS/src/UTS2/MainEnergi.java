/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2;

import java.util.Scanner;

/**
 *
 * @author Viery Nugroho TI-B 21104410049
 *
 */
public class MainEnergi {

  public static void main(String[] args) {

    double massa, kecepatanBenda = 0;

    Kinetic kinetic = new Kinetic();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Program Energi Kinetik");
    System.out.println("----------------------");
    System.out.print("Massa: ");
    massa = scanner.nextDouble();
    System.out.print("Kecepatan Benda: ");
    kecepatanBenda = scanner.nextDouble();

    kinetic.setKineticEnergy(massa, kecepatanBenda);

    System.out.print("Energi Kinetik: " + kinetic.getKineticEnergy() + " J");
    System.out.println("");
  }
}
