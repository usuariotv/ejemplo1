package LOGICA;

public class venta {
	private int nro_venta;
	private String fecha;
	private double total;
	private int ISBN;
	
	public venta(int nv,String f, double t, int ISBN) {
		this.nro_venta=nv;
		this.fecha=f;
		this.total=t;
		this.ISBN=ISBN;

}
	public int getNro_venta(){
		return nro_venta;
	}
	public void setNro_venta(int nro_venta){
		this.nro_venta=nro_venta;
	}
	
	public String fecha(){
		return fecha;
	}
	public void setfecha(String fecha){
		this.fecha=fecha;
	}
	public double total(){
		return total;
	}
	public void total(double total){
		this.total=total;
	}
	public int ISBN(){
		return ISBN;
	}
	public void ISBN(int ISBN){
		this.ISBN=ISBN;
	}
}
