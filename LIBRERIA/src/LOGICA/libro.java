
package LOGICA;

public class libro {
public String titulo;
public String autor;
public String genero;
public int a_publicacion;
public int isbn;
private int edicion;
private double precio;
/* 
 * constructor
 * Un constructor, es una plantila que nos brinda la estructura de nuestro objeto.
 * Es lo primero que se diseña
 */
public libro (String t, String a, String g, int ap, int isbn, int edicion, double precio){
	this.titulo=t;
	this.autor=a;
	this.genero=g;
	this.a_publicacion=ap;
	this.isbn=isbn;
	this.edicion=edicion;
	this.precio=precio;
	
}
public libro (String titulo, String autor, int ap){
	this.titulo=titulo;
	this.autor=autor;
	this.a_publicacion=ap;
	this.edicion=edicion;
	this.precio=precio;
}

public libro () {
	
}
public String getTitulo() {
	return this.titulo;
}
public String getAutor() {
    return this.autor;
}
public String getGenero() {
	return this.genero;
}
public int getA_publicacion() {
return this.a_publicacion;
}
public int getIsbn() {
return this.isbn;
}
public void setTitulo(String t){
	this.titulo=t;
}
public void setAutor(String a){
	this.autor=a;
}
public void setGenero(String g){
	this.genero=g;
}
public void setA_publicacion(int ap){
	this.a_publicacion=ap;
}
public void setIsbn(int isbn){
	this.isbn=isbn;
}
public void setEdicion(int ed) {
	this.edicion=ed;
}
/*public static void main (String [] args) {
libro lib1=new libro ("100 años de soledad","gabo","romance",1965, 12345678);
System.out.println(lib1.titulo+lib1.autor+lib1.genero);
libro lib2=new libro();
lib2.titulo="la rebelion en la granja";
lib2.autor="Orgel George";
System.out.println(lib2.titulo+lib2.autor+lib2.genero);//

}*/
public int generarISBN() {
	this.ISBN=ibsn;
}

}
