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
public class Pop {

  String penyanyi = "Raisa";
  String lagu = "Kali Kedua";

  Pop() {

  }

  Pop(String penyanyi, String lagu) {
    this.penyanyi = penyanyi;
    this.lagu = lagu;
    System.out.println(this.penyanyi + " <=> " + this.lagu);
  }

  public void singer(String penyanyi) {
    this.penyanyi = penyanyi;
  }

  protected void song(String lagu) {
    this.lagu = lagu;
  }

  public void cetakLabel() {
    System.out.println(this.penyanyi + " <=> " + this.lagu);
  }
}
