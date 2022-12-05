/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2;

/**
 *
 * @author Viery Nugroho TI-B 21104410049
 *
 */
public class Kinetic {

  double kineticEnergy;
  final double comma5 = 0.5;

  public double getKineticEnergy() {
    return kineticEnergy;
  }

  public void setKineticEnergy(double massa, double velocity) {
    this.kineticEnergy = comma5 * massa * (velocity * velocity);
  }
}
