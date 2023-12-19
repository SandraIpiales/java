package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	
	public Directorio() {
		contactos = new ArrayList<Contacto>();
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
	
	public boolean agregarContacto(Contacto contactoA) {
		contactos.add(contactoA);
		return true;
	}
	public Contacto buscarPorCedula(String cedula) {
		Contacto elementoContacto;
		Contacto contactoEncontrado=null;
		String cedulaBuscada;
		for(int i=0;i<contactos.size();i++) {
			elementoContacto=contactos.get(i);
			cedulaBuscada=elementoContacto.getCedula();
			if(cedulaBuscada.equals(cedula)) {
				contactoEncontrado = elementoContacto;
			}
		}
		return contactoEncontrado;
	}
	
}