public abstract class Figura {
    protected String color;
    protected boolean rellena;

    public Figura(String color, boolean rellena) {
        this.color = color;
        this.rellena = rellena;
    }

    abstract double calcularArea();
    abstract double calcularPerimetro();
    public void describir(){
        System.out.println("Color: " + color);
        if(rellena){
            System.out.println("Esta rellena");
        } else {
            System.out.println("No esta rellena");
        }
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}
