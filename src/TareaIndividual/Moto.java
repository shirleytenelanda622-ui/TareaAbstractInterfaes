public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, double velocidadMaxima, int cilindrada) {
        super(marca, modelo, velocidadMaxima);
        this.cilindrada = cilindrada;
    }
    @Override
    public void Describir(){
        System.out.println("Cilindrada: " + cilindrada);
    }
}
