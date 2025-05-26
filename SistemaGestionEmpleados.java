import java.util.Scanner;

public class SistemaGestionEmpleados {

    private Empleado[] empleados;

    public SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public static void main(String[] args) {
        Empleados empleados = new Empleados(3);

        // Dar de alta los empleados usando el nuevo método
        empleados.agregarEmpleado(0, "Juan", "Desarrollador", 50000);
        empleados.agregarEmpleado(1, "María", "Diseñadora", 45000);
        empleados.agregarEmpleado(2, "Pedro", "Gerente", 60000);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Mensajes.INTRODUZCA_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        empleados.mostrarEmpleados();

        scanner.close();
    }
}
