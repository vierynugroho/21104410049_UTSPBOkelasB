/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS1;

/**
 *
 * @author Viery Nugroho TI-B 21104410049
 *
 */
public class Penyanyi extends Pop {

  public static void main(String[] args) {
    Pop pop = new Pop("Black Pink", "How You Like That");
    Dangdut dangdut = new Dangdut();
    pop.singer("Eclat Story");
    pop.song("bentuk Cinta");
    pop.cetakLabel();

    String penyanyi = "Joko Chandra";
    penyanyi = dangdut.penyanyi;
    dangdut.song("Via Valen", "Kopi Dangdut");
    dangdut.cetakLabel();
  }
}
