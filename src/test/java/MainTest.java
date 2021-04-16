import org.junit.Before;
import prenda.CriterioLiquidacion;
import prenda.CriterioNuevo;
import prenda.CriterioPromocion;
import prenda.Prenda;
import venta.Producto;
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
    List<Producto> prendas = new ArrayList<>();
    prendas.add(new Producto(pantalon, 2));
    prendas.add(new Producto(saco, 1));
    prendas.add(new Producto(camisa, 1));
    this.venta.prendas = prendas;
    this.venta.fecha = new Date();
  }

}
