import org.junit.Before;
import prenda.CriterioLiquidacion;
import prenda.CriterioNuevo;
import prenda.CriterioPromocion;
import prenda.Prenda;
import venta.PrendaYCantidad;
import venta.Venta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainTest {

  Prenda pantalon = new Prenda(123,  new CriterioNuevo());
  Prenda saco = new Prenda(200, new CriterioLiquidacion());
  Prenda camisa = new Prenda(100, new CriterioPromocion());
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

}
