import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import prenda.Criterio;
import prenda.Prenda;

import venta.PrendaYCantidad;
import venta.Venta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VentasTest{

  private Object CriterioNuevo;
  private Object Criterioliquidacion;
  private Object CriterioPromocion;
  Prenda pantalon = new Prenda(123, (Criterio) CriterioNuevo);
  Prenda saco = new Prenda(200, (Criterio) Criterioliquidacion);
  Prenda camisa = new Prenda(100, (Criterio) CriterioPromocion);

  Venta venta = new Venta();
  @Before
  public void init(){
    List<PrendaYCantidad> prendas = new ArrayList<>();
    prendas.add(new PrendaYCantidad(pantalon, 2));
    prendas.add(new PrendaYCantidad(saco, 1));
    prendas.add(new PrendaYCantidad(camisa, 1));

    this.venta.prendas = prendas;
    this.venta.fecha = new Date();
  }

  @Test
  public void ventaEnEfectivo(){
    this.venta.pagaEnEfectivo = true;
    Assert.assertTrue(this.venta.valorTotal() == 431);
  }

  @Test
  public void ventaTarjeta(){
    this.venta.pagaEnEfectivo = false;
    this.venta.cantidadCuotas = 12;
    Assert.assertTrue(this.venta.valorTotal() == 441.31);
  }

}