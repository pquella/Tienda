package tienda;

public class EjemploTienda {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Pepe");
		Cliente cliente2 = new Cliente("Juan");
		cliente1.cogerTurno();
		cliente2.cogerTurno();
		System.out.println("La tienda va por el turno " + Tienda.getTurnoActual());
		System.out.println(cliente1);
		System.out.println(cliente2);
	}

}
