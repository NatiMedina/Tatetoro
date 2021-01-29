package tablero;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	private String simbolo;
	private String direccionFoto;
	private ArrayList<Integer> movimientos;
	
	public Jugador(String simbolo) {
		this.simbolo = simbolo;
		this.nombre = "";
		this.direccionFoto = "";
		movimientos = new ArrayList<Integer>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getSimbolo() {
		return simbolo;
	}
	
	public String getDireccionFoto() {
		return direccionFoto;
	}
	
	public void setDireccionFoto(String direccionFoto) {
		this.direccionFoto = direccionFoto;
	}
	
	public void agregarMovimiento(Integer posicion) {
		movimientos.add(posicion);
	}
	
	public ArrayList<Integer> obtenerMovimientos(){
		return movimientos;
	}
	
	public void limpiarMovimientos() {
		movimientos.clear();
	}
}
