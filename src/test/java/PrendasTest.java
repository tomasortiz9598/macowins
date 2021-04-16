import org.junit.Assert;
import org.junit.Test;
import prenda.*;

public class PrendasTest extends  MainTest{

  //uso assertTrue porque sino me tira un deprecation warning

  @Test
  public void dummy(){
    Assert.assertTrue(true);
  }

  @Test
  public void pantalonNuevo(){
    Assert.assertTrue(123 ==  this.pantalon.calcularPrecio());
  }

  @Test
  public void sacoLiquidacion(){
    Assert.assertTrue(100 == this.saco.calcularPrecio());
  }
  @Test
  public void camisaPromocion(){
    Assert.assertTrue(85 == this.camisa.calcularPrecio());
  }

}