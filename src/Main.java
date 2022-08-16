public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setEdad(28);
        cliente.setNombre("Audriel");
        cliente.setTelefono(45125489);
        cliente.setCredito(5000);

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(33);
        trabajador.setNombre("Juliana");
        trabajador.setTelefono(45122625);
        trabajador.setSalario(150000);

        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());

    }


}