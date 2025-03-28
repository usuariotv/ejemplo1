package PRESENTACION;

import LOGICA.libro;

public class inicio {
public void menu(){
	System.out.println("bienvenido");
	String menu="menu/n"
			+"Agregar libro: 1/n"
			+"Agregar cliente: 2/n"
			+"Agregar vendedor: 3/n"
			
	System.out.println("menu");
	switch (opc) {
	case 1:
		String tit=leer.nextLine();
		String aut=leer.nextLine();
		int public=leer.nextInt();
		libro lib1.new libro(tit, aut, publi);
		lib1.mostrarLibro();
		System.out.println("libro creado");
		break;
	case 2:
		System.out.print("nro venta:");
		int nro=leer.nextInt();
		System.out.print("fecha:");
		String fec=leer.nextLine();
		Syste
	
	}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo cruel");
		System.out.println("Hola mundis");
		libro lib4=new libro("tormenta de espadas","george R R Martin", 2000);
		lib4.setIsbn(1542165);
		System.out.println(lib4.getIsbn));
		
	  
	}

}

/*import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {
        System.out.println("Menú:");
        System.out.println("1. Crear libro");
        System.out.println("2. Crear cliente");

        Scanner leer = new Scanner(System.in);
        int opc = leer.nextInt();
        leer.nextLine(); // Consumir el salto de línea

        switch (opc) {
            case 1:
                System.out.print("Título: ");
                String tit = leer.nextLine();

                System.out.print("Autor: ");
                String aut = leer.nextLine();

                Libro lib1 = new Libro(tit, aut, 2005);
                lib1.mostrarLibro();
                System.out.println("Libro creado");
                break;

            case 2:
                System.out.println("Cliente creado");
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }
        leer.close();
    }
}
*/

