package LOGICA;

public class credito {
private int nro_credito;
private String fecha;
private double total;
private String fecha_pago;
private int ISBN;
public credito(int nro_credito, String fecha, double total, String fecha_pago, int iSBN) {
	super();
	this.nro_credito = nro_credito;
	this.fecha = fecha;
	this.total = total;
	this.fecha_pago = fecha_pago;
	ISBN = iSBN;
}
public int getNro_credito() {
	return nro_credito;
}
public void setNro_credito(int nro_credito) {
	this.nro_credito = nro_credito;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public String getFecha_pago() {
	return fecha_pago;
}
public void setFecha_pago(String fecha_pago) {
	this.fecha_pago = fecha_pago;
}
public int getISBN() {
	return ISBN;
}
public void setISBN(int iSBN) {
	ISBN = iSBN;
}


}
