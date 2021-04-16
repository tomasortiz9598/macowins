package prenda;

public class CriterioPromocion implements Criterio {

  @Override
  public double calcularPrecio(double precioInicial) {
    return precioInicial - 15;
  }
}
