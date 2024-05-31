package Figuras;
//Herencia
public class Rectangulo extends FiguraGeometrica{

    private double altura;

    public Rectangulo (double valor1, double altura) {
        super(valor1);
        this.altura = altura;
    }
    //Polimorfismo
    @Override
    public double getArea() {
        double base = super.getValor1();
        return  base * this.altura;
    }
}
