package org.modelo.producto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Producto implements Serializable{
	private Integer id;
	private String name;
	private double precio;
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Producto(Integer id) {
		super();
		this.id = id;
	}

	public Producto(Integer id, String name, double precio) {
		super();
		this.id = id;
		this.name = name;
		this.precio = precio;
	}
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
