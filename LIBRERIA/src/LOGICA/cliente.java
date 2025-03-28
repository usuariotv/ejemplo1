package LOGICA;

public class cliente {
private String nombre;
private String direccion;
private String ci;
private String genero;
private int celular;
public cliente(String nombre, String direccion, String ci, String genero, int celular) {
	super();
	this.nombre = nombre;
	this.direccion = direccion;
	this.ci = ci;
	this.genero = genero;
	this.celular = celular;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getCi() {
	return ci;
}
public void setCi(String ci) {
	this.ci = ci;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public int getCelular() {
	return celular;
}
public void setCelular(int celular) {
	this.celular = celular;
}


}