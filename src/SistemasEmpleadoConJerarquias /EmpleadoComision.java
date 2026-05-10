public class EmpleadoComision extends Empleado implements Bonificable{
    private double porcentajeVentas;
    private double salarioBase;
    private double montoVentas;

    public EmpleadoComision(String nombre, int id, double horasTrabajadas, double porcentajeVentas, double salarioBase, double montoVentas) {
        super(nombre, id, horasTrabajadas);
        this.porcentajeVentas = porcentajeVentas;
        this.salarioBase = salarioBase;
        this.montoVentas = montoVentas;
    }

    @Override
    public double calcularSalario(){
        return salarioBase + (montoVentas * porcentajeVentas /100);
    }
    @Override
    public double calcularBono(){
        return montoVentas * 0.05;
    }
}
