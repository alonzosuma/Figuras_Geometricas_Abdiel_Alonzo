package Figuras;

public abstract class FiguraGeometrica {
    //Atributo
    private double valor1;
    //Constructor
    public FiguraGeometrica(double valor1) {
        this.valor1 = valor1;
    }
    //Encapsulamiento
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1){
        this.valor1 = valor1;
    }
    //Abstraccion
    public abstract double getArea();
}
