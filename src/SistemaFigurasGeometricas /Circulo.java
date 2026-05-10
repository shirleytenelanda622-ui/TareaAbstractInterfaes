public class Circulo extends Figura{
    private double radio;

    public Circulo(String color, boolean rellena, double radio) {
        super(color, rellena);
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return 3.14 * (radio * radio);
    }
    @Override
    public double calcularPerimetro(){
        return 2 * 3.14 *radio;
    }
}
