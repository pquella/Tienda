package tienda;

public class Cliente {
	
	private int turno = -1;
	private String nombre;
	
	public int getTurno() {
		return turno;
	}
	
	public void cogerTurno() {
		turno = Tienda.darTurno();
	}
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	public int turnosRestantes() {
		return turno - Tienda.getTurnoActual();
	}
	
	@Override
	public String toString() {
		return getTurno() + " " + nombre
//				+ " TA: " + Tienda.getTurnoActual()
				+ " me quedan " + turnosRestantes();
	}
	
}
