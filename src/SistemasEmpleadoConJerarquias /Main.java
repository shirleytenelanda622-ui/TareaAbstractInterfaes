public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new EmpleadoPorHora("Maria Perez", 101, 40, 5.0);
        empleados[1] = new EmpleadoFijo("Carlos Ruiz", 202, 40, 800);
        empleados[2] = new EmpleadoComision("Sofia Diaz", 303, 45, 500, 10, 2000);
        for(Empleado e : empleados){
            e.mostrarInfo();
            if(e instanceof Bonificable b){
                System.out.println("Bono: " + b.calcularBono());
            }
        }
    }
}
