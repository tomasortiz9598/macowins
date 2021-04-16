import org.junit.Assert;
import org.junit.Test;


public class VentasTest extends MainTest {



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