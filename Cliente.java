package Ejercicio10;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String telefono;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}

class Empresa {
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public void addCliente(Cliente cliente) {

	}
}
