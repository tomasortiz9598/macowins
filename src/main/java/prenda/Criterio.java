package prenda;

//Si aca yo necesitaria meter una gedencia que sea iguaal para todos los criterios me conviene hacer herencia
// y clavar un super en los hijos
// A esto se lo llama strategy
public interface Criterio {
  public double calcularPrecio(double precioInicial);
}
