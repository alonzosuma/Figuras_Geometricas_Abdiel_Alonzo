package Figuras;

import java.io.DataInput;

public abstract class FiguraGeometrica {

    private double valor1;

    public FiguraGeometrica(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1){
        this.valor1 = valor1;
    }

    public abstract double getArea();
}
