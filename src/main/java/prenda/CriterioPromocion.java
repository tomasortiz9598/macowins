package prenda;

public class CriterioPromocion implements Criterio {
//Esto no esta bueno porque me rompe si me meten un numero menor a 15
  @Override
  public double calcularPrecio(double precioInicial) {
    return precioInicial - 15;
  }
}
