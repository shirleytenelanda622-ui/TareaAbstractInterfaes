public abstract class Empleado {
    protected String nombre;
    protected int id;
    protected double horasTrabajadas;

    public Empleado(String nombre, int id, double horasTrabajadas) {
        this.nombre = nombre;
        this.id = id;
        this.horasTrabajadas = horasTrabajadas;
    }

    abstract double calcularSalario();
    public void mostrarInfo(){
        System.out.println("\n ----------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Id: " + id);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Salario: " + calcularSalario());
    }
}
