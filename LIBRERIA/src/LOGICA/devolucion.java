package LOGICA;

public class devolucion {
	private int nro_venta;
	private String fecha;
	private String observacion;
	private int ISBN;
	
	public devolucion (int nv,String f, String ob, int ISBN) {
		this.nro_venta=nv;
		this.fecha=f;
		this.observacion=ob;
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
	public String observacion(){
		return observacion;
	}
	public void observacion(String observacion){
		this.observacion=observacion;
	}
	public int ISBN(){
		return ISBN;
	}
	public void ISBN(int ISBN){
		this.ISBN=ISBN;
	}
}