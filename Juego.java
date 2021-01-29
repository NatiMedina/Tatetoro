package tablero;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Juego {

	private int numeroDeTurno;
	private Jugador jugadorO;
	private Jugador jugadorX;
	private Jugador jugadorActual;
	private List<Integer> posicionTatetiGanador;
	private List<List<Integer>> tatetiGanadores = Arrays.asList( 
			Arrays.asList(1,2,3),
			Arrays.asList(4,5,6),
			Arrays.asList(7,8,9),
			Arrays.asList(1,4,7),
			Arrays.asList(2,5,8),
			Arrays.asList(3,6,9),
			Arrays.asList(1,5,9),
			Arrays.asList(3,5,7),
			Arrays.asList(2,4,9),
			Arrays.asList(2,6,7),
			Arrays.asList(3,4,8),
			Arrays.asList(1,6,8));
	
	private boolean ganador;


	public Juego() {
		numeroDeTurno = 1;
		ganador = false;
		
		jugadorX = new Jugador("X");
		jugadorX.setNombre("Jugador1");
		
		jugadorO = new Jugador("O");
		jugadorO.setNombre("Jugador2");
		
		jugadorActual = seleccionarJugadorInicial();
		
		posicionTatetiGanador = new ArrayList<Integer>();
	}
	
	private void cambiarJugador() {
		if (jugadorActual == jugadorX) {
			jugadorActual = jugadorO;
		} else {
			jugadorActual = jugadorX;
		}
	}
	
	public void jugada(int posicion) {
		jugadorActual.agregarMovimiento(posicion);
		ganador = hayUnGanador();
		if(!ganador) {
			numeroDeTurno++;
			cambiarJugador();
		}
	}
	
	private boolean hayUnGanador() {
		boolean hayUnGanador = false;
		for(List<Integer> victoria: tatetiGanadores) {
			if(jugadorActual.obtenerMovimientos().containsAll(victoria)) {
				posicionTatetiGanador.addAll(victoria);
				hayUnGanador = true;
			}
		}
		
		return hayUnGanador;
	}
	
	public void reiniciarJuego() {
		jugadorO.limpiarMovimientos();
		jugadorX.limpiarMovimientos();
		jugadorActual = seleccionarJugadorInicial();
		numeroDeTurno = 1;
		posicionTatetiGanador.clear();
		ganador = false;
	}
	
	public boolean hayGanador() {
		return ganador;
	}
	
	public String getSimbolo() {
		return jugadorActual.getSimbolo();
	}

	public String getTurno() {
		return numeroDeTurno + "";
	}
	
	public String getNombreJugador() {
		return jugadorActual.getNombre();
	}
	
	public String getPathImagen() {
		return jugadorActual.getDireccionFoto();
	}
	
	public String getTextoGanador() {
		return "Ganador: " + jugadorActual.getNombre() + " con " + jugadorActual.getSimbolo() + ", en "+ jugadorActual.obtenerMovimientos().size() +" movimientos";
	}

	private Jugador seleccionarJugadorInicial() {
		int numeroAleatorio = (int) (Math.random() * 10);
				
		if(numeroAleatorio % 2 == 0) {
			return jugadorO;
		}else {
			return jugadorX;
		}
		
	}
	
	public List<Integer> posicionTatetiGanador() {
		return posicionTatetiGanador;
	}
	
	public void setNombreJugador(String nombre) {
		jugadorActual.setNombre(nombre);
	}
	
	public void setDireccionImagen(String path) {
		jugadorActual.setDireccionFoto(path);
	}
	
}

