public class Triangulo extends Figura{
    private double a;
    private double b;

    public Triangulo(String color, boolean rellena, double a, double b) {
        super(color, rellena);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcularArea(){
        return (a * b) / 2;
    }
    @Override
    public double calcularPerimetro(){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
