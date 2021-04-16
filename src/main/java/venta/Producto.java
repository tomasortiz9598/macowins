package venta;

import prenda.Prenda;

public class Producto {
  public Prenda prenda;
  protected Integer cantidad;

  public Producto(Prenda prenda, Integer cantidad) {
    this.cantidad = cantidad;
    this.prenda = prenda;
  }
}
