public class productos {
String nombre;
int precio;
int total;
int cantidad;
int descuento; 


public void main (String[] args) {
	productos P0 = new productos();
	P0.nombre = "jabón en polvo";
	P0.cantidad = 2;
	P0.precio = 40;
	P0.descuento = 50;
	P0.total = P0.cantidad *  (P0.precio - P0.precio * P0.descuento / 100);

	System.out.println("nombre:" + P0.nombre);
	System.out.println("cantidad:" + P0.cantidad);
	System.out.println("precio:" + P0.precio);
	System.out.println("descuento: %" + P0.descuento);
	System.out.println("precio total de " + P0.nombre + " es igual a " + P0.total);

	productos P1 = new productos();
	
	P1.nombre = "esponjas";
	P1.cantidad = 3;
	P1.precio = 10;
	P1.descuento = 0;
	P1.total = P1.cantidad * (P1.precio - P1.precio * P1.descuento / 100);
	
	System.out.println("nombre:" + P1.nombre);
	System.out.println("cantidad:" + P1.cantidad);
	System.out.println("precio:" + P1.precio);
	System.out.println("descuento: %" + P1.descuento);
	System.out.println("precio total de " + P1.nombre + " es igual a " + P1.total);
    
	productos P2 = new productos();
	P2.nombre = "chocolate";
	P2.cantidad = 2;
	P2.precio = 100;
	P2.descuento = 0;
	P2.total = P2.cantidad * ( P2.precio - P2.precio * P2.descuento / 100);
	
	
	System.out.println("nombre:" + P2.nombre);
	System.out.println("cantidad:" + P2.cantidad);
	System.out.println("precio:" + P2.precio);
	System.out.println("descuento: %" + P2.descuento);
	System.out.println("precio total de " + P2.nombre + " es igual a " + P2.total);
	
	productos carrito1 = new productos();
	carrito1.total = P0.total + P2.total + P1.total;
	
	System.out.println("El precio total del carrito es de " + carrito1.total);
	}
}
