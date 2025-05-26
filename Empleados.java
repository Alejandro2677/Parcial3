public class Empleados {
    private Empleado[] lista;

    public Empleados(int capacidad) {
        this.lista = new Empleado[capacidad];
    }

    public void agregarEmpleado(int indice, String nombre, String cargo, double salario) {
        lista[indice] = new Empleado(nombre, cargo, salario);
    }

    public void mostrarEmpleados() {
        System.out.println("Lista de Empleados:");
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }
}