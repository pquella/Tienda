package tienda;

public class Tienda {

	private static final int TURNO_INICIAL = 0;
	private static final int TURNO_FINAL = 99;
	private static int proximoTurno = TURNO_INICIAL;
	private static int turnoActual;

	public static int getTurnoActual() {
		return turnoActual;
	}
	
	public static int darTurno() {
//		if (proximoTurno > TURNO_FINAL) {
//			proximoTurno = TURNO_INICIAL;
//		}
//		
//		return proximoTurno++;
		proximoTurno = siguiente(proximoTurno);
		return proximoTurno++;
	}
	
	public static void pasarTurno() {
		turnoActual = siguiente(turnoActual);
		turnoActual++;
		
	}
	
	public static int siguiente(int numero) {
		if (numero > TURNO_FINAL) {
			numero = TURNO_INICIAL;
		}
		
		return numero;
	}
	
	
}
