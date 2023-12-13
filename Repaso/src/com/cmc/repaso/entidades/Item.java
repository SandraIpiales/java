package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public void imprimir() {
		System.out.println("Nombre de Articulos: :"+ nombre);
		System.out.println("Productos Actuales: "+ productosActuales);
		System.out.println("Productos Devueltos: "+ productosDevueltos);
		System.out.println("Productos Vendidos: "+ productosVendidos);
		
	}
	
	public void vender(int productosVendidos) {
		productosActuales=productosActuales-productosVendidos;
		this.productosVendidos=this.productosVendidos+productosVendidos;		
	}
	public void devolver(int productosDevueltos) {
		productosActuales=productosActuales+productosDevueltos;
		this.productosVendidos=this.productosVendidos-productosDevueltos;
		this.productosDevueltos=this.productosDevueltos+productosDevueltos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public int getProductosDevueltos() {
		return productosDevueltos;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	public int getProductosVendidos() {
		return productosVendidos;
	}
	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
}
