import org.junit.Assert;
import org.junit.Test;
import prenda.Criterio;
import prenda.CriterioNuevo;
import prenda.Prenda;

class PrendasTest{

  private Object CriterioNuevo;
  private Object Criterioliquidacion;
  private Object CriterioPromocion;
  Prenda pantalon = new Prenda(123, (Criterio) CriterioNuevo);
  Prenda saco = new Prenda(200, (Criterio) Criterioliquidacion);
  Prenda camisa = new Prenda(100, (Criterio) CriterioPromocion);

  //uso assertTrue porque sino me tira un deprecation warning

  @Test
  public void pantalonNuevo(){
    Assert.assertTrue(123 ==  pantalon.calcularPrecio());
  }

  @Test
  public void sacoLiquidacion(){
    Assert.assertTrue(100 == saco.calcularPrecio());
  }
  @Test
  public void camisaPromocion(){
    Assert.assertTrue(85 == camisa.calcularPrecio());
  }

}