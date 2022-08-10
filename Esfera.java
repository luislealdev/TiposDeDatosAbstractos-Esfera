public class Esfera {
    // Datos (variables) del TDA
    private double radio;

    // Constructor
    public Esfera(double radioInicial) {
        if (radioInicial > 0) {
            this.radio = radioInicial;
        } else {
            this.radio = 0;
        }
    }

    // Métodos
    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return (radio * 2);
    }

    public double getCircunferencia() {
        return (Math.PI * getDiametro());
    }

    public double getArea() {
        return (4 * Math.PI * radio * radio);
    }

    public double getVolumen() {
        return ((4 * Math.PI * Math.pow(radio, 3)) / 3);
    }
}
