public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo("Morado", true, 5);
        Rectangulo r = new Rectangulo("Rojo", false, 6, 4);
        Triangulo t = new Triangulo("Amarillo", true, 5, 6);
        Figura[] figuras = {c, r, t};
        for(Figura figura : figuras){
            figura.describir();
            figura.calcularArea();
            figura.calcularPerimetro();
        }
    }
}
