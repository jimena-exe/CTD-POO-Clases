public class EmpleadoProduccion extends Empleado{
    public int tiempoExperiencia;

    @Override
    public void trabajar(){

        System.out.println("Empleado de recursos producción"+ getNombre()+ "trabajando");
    };

    public EmpleadoProduccion(String nombre, String apellido, String dni, int tiempoExperiencia) {
        super(nombre, apellido, dni);
        this.tiempoExperiencia = tiempoExperiencia;
    }
}
