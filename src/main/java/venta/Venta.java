package venta;

import prenda.Prenda;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Venta {
  public boolean pagaEnEfectivo;
  public List<PrendaYCantidad> prendas;
  public Date fecha;
  public double coeficienteFijo = 0.5; //Esto estaria bueno meterlo en otro lugar ya que no es dinamico
  public Integer cantidadCuotas = 1;

  public double valorPrendas(){
    return this.prendas.stream()
        .map(prenda -> prenda.prenda.calcularPrecio())
        .collect(Collectors.summingDouble(i -> i));
  }

  public double recargo(){
    if (this.pagaEnEfectivo) {
      return 0;
    }
    return this.cantidadCuotas * this.coeficienteFijo + 0.01 * this.valorPrendas();
  }

  public double valorTotal(){
    return this.valorPrendas() + this.recargo();
  }
}

