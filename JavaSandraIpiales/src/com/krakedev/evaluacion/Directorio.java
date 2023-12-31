package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correcto, incorrecto;

	public Directorio() {
		contactos = new ArrayList<Contacto>();
		correcto = new ArrayList<Contacto>();
		incorrecto = new ArrayList<Contacto>();
		fechaModificacion = new java.util.Date();
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	

	public ArrayList<Contacto> getCorrectos() {
		return correcto;
	}

	public void setCorrectos(ArrayList<Contacto> correcto) {
		this.correcto = correcto;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrecto;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrecto) {
		this.incorrecto = incorrecto;
	}

	public boolean agregarContacto(Contacto contactoA) {
		Contacto elementoContacto, contactoEncontrado;
		String cedulaIngresada = contactoA.getCedula();
		boolean contactoApto;
		if (contactos != null) {
			contactoEncontrado = buscarPorCedula(cedulaIngresada);
			if (contactoEncontrado != null) {
				contactoApto = false;
			} else {
				contactoApto = true;
				contactos.add(contactoA);
			}
		} else {
			contactos.add(contactoA);
			contactoApto = true;
		}
		return contactoApto;

	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto elementoContacto;
		Contacto contactoEncontrado = null;
		String cedulaBuscada;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			cedulaBuscada = elementoContacto.getCedula();
			if (cedulaBuscada.equals(cedula)) {
				contactoEncontrado = elementoContacto;
			}
		}
		return contactoEncontrado;
	}

	public String consultarUltimaModificacion() {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String datoModificado = formato.format(fechaModificacion);
		return datoModificado;
	}

	public int contarPerdidos() {
		Contacto elementoContacto;
		Direccion direccionContacto;
		int contactosSinRumbo = 0;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			direccionContacto = elementoContacto.getDireccion();
			if (direccionContacto == null) {
				contactosSinRumbo++;
			}
		}
		return contactosSinRumbo;
	}

	public int contarFijos() {
		Contacto elementoContacto;
		ArrayList<Telefono> listaTelefono = new ArrayList<Telefono>();
		Telefono elementoTelefono;
		String tipoC, estadoC;
		int numFijo = 0;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			listaTelefono = elementoContacto.getTelefonos();
			for (int j = 0; j < listaTelefono.size(); j++) {
				elementoTelefono = listaTelefono.get(j);
				tipoC = elementoTelefono.getTipo();
				estadoC = elementoTelefono.getEstado();
				if (tipoC.equalsIgnoreCase("Convencional") && estadoC.equalsIgnoreCase("C")) {
					numFijo++;
				}
			}

		}
		return numFijo;
	}
	public void depurar() {
		Contacto elementoContacto;
		Direccion elementoDireccion;
		for(int i=0; i<contactos.size();i++) {
			elementoContacto=contactos.get(i);
			elementoDireccion=elementoContacto.getDireccion();
			if(elementoDireccion!=null) {
				correcto.add(elementoContacto);
			}else {
				incorrecto.add(elementoContacto);
			}
		}
		contactos.clear();
	}

}
