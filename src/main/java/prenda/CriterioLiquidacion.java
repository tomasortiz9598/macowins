package prenda;

public class CriterioLiquidacion implements Criterio {
  @Override
  public double calcularPrecio(double precioInicial) {
    return precioInicial * 0.5;
  }
}
