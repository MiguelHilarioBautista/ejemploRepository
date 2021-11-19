package org.controller.producto;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.dao.producto.DaoProducto;
import org.modelo.producto.Producto;


@ManagedBean
@ViewScoped
public class ControllerProducto  implements Serializable{
	private static final long serialVersionUID = 1L;
	private List<Producto> listaProducto;
	private Producto producto;
	
	public ControllerProducto() {
		producto=new Producto();
	}

	public List<Producto> getListaProducto() {
		DaoProducto dao=new DaoProducto();
		listaProducto=dao.listProducto();
		return listaProducto;
	}

	public void setListaProducto(List<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	//METHOD DAOPRODUCTO
	
	public void limpiarProducto() {
		producto=new Producto();
	}
	public String agregarProducto() {
		DaoProducto dao=new DaoProducto();
		dao.addProducto(producto);
		return "/index.xhtml?faces-redirect=true";
	}
	public String modificarProducto() {
		DaoProducto dao=new DaoProducto();
		dao.updateProducto(producto);
		return "/index.xhtml?faces-redirect=true";
	}
	public String eliminarProducto() {
		DaoProducto dao=new DaoProducto();
		dao.deleteProducto(producto);
		return "/index.xhtml?faces-redirect=true";
	}
	
}
