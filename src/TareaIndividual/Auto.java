public class Auto extends Vehiculo implements Electrico{
    private int bateria;

    public Auto(String marca, String modelo, double velocidadMaxima, int bateria) {
        super(marca, modelo, velocidadMaxima);
        this.bateria = bateria;
    }

    @Override
    public void Describir(){
        System.out.println("Bateria: " + bateria);
    }
    @Override
    public double cargarBateria(int porcentaje){
        bateria += porcentaje;
        if(bateria > 100){
            bateria = 100;
        }
        return bateria;
    }
    @Override
    public int autonomiakm(){
        return bateria * 5;
    }
}
