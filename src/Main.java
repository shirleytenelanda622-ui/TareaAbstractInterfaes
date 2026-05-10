//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
                new Auto("Tesla", "Model 3", 250, 50),
                new Camion("Yamaha", "R6", 220, 600),
                new Moto("Volvo", "FH", 180, 20)
        };
        for(Vehiculo v : vehiculos){
            v.Describir();
        }
    }
}