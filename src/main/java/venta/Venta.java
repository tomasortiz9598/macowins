package venta;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Venta {
  //Aca podria crear una strategy medioDePago que internamente resuelva la logica del recargo.
  //Elegí esta opcion para aportar a la simplicidad del codigo
  //Tambien podria ser un enum.
  //Si se agrega mercado pago tengo que agregar otro if y alto quilombo
  //Tambien podria ser un template method
  public boolean pagaEnEfectivo;
  public List<Producto> prendas;
  public Date fecha;
  public double coeficienteFijo = 0.5; //Esto estaria bueno meterlo en otro lugar ya que no es dinamico
  public Integer cantidadCuotas = 1;

  public double valorPrendas(){
    return this.prendas.stream()
        .map(prenda -> prenda.prenda.calcularPrecio() * prenda.cantidad)
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

