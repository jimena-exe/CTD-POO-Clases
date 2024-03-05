public class EmpleadoRH extends Empleado{ //extends es para heredar de la clase padre

    private int altasLogradas;

    @Override
    public void trabajar(){

        System.out.println("Empleado de recursos humanos"+ getNombre()+ "trabajando");
    };

    public EmpleadoRH(String nombre, String apellido, String dni, int altasLogradas) {
        super(nombre, apellido, dni);
        this.altasLogradas = altasLogradas;
    }
}

