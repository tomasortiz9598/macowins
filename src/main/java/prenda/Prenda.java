package prenda;

public class Prenda {
  protected double precio;
  public Criterio criterio;
  public Prenda(double precio, Criterio criterio){
    this.precio = precio;
    this.criterio = criterio;
  }

  public double calcularPrecio(){
    return this.criterio.calcularPrecio(this.precio);
  }

}


