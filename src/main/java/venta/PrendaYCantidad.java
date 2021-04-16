package venta;

import prenda.Prenda;

public class PrendaYCantidad {
  public Prenda prenda;
  protected Integer cantidad;

  public PrendaYCantidad(Prenda prenda, Integer cantidad) {
    this.cantidad = cantidad;
    this.prenda = prenda;
  }
}
