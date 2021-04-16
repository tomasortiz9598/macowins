import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import venta.Venta;

import java.util.ArrayList;
import java.util.List;

public class GananciasTest extends MainTest{
  List<Venta> ventasDeHoy = new ArrayList<>();
  @Before
  public void init(){
    this.ventasDeHoy.add(this.venta);
  }

  @Test
  public void dummy(){
    Assert.assertTrue(true);
  }



}
