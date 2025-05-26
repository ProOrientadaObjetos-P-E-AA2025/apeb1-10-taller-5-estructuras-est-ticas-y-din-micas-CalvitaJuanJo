
import java.util.ArrayList;

/**
 *
 * @author Juan Jose
 */
public class Problema1_ProductoBase {

    public class Producto {

        public String nombre;
        public double precio;
        public int cantidad;

        public Producto(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;

        }

        public String toString() {
            return "Nombre: " + nombre
                    + "\nPrecio: " + precio
                    + "\nCantidad: " + cantidad
                    + "\n";
        }
    }

    public class CarrodeCompras {

        public ArrayList<Producto> listaproductos;
        public double totalcliente;
        public double totalpagar;

        public CarrodeCompras() {
            this.listaproductos = new ArrayList<>();
        }

        public CarrodeCompras(ArrayList<Producto> productos) {
            this.listaproductos = productos;

        }

        public double calculartotal() {
            totalpagar = 0;
            for (Producto producto : listaproductos) {
                totalpagar += producto.precio * producto.cantidad;
            }
            return totalpagar;
        }

        public void confirmarpago() {
            if (totalcliente > totalpagar) {
                System.out.println("Pago confirmado");
                System.out.println("Sobra: " + (totalcliente - totalpagar));
            } else if (totalcliente < totalpagar) {
                System.out.println("saldo insuficiente");
                System.out.println("Faltante: " + (totalpagar - totalcliente));
            } else {
                System.out.println("Pago exacto confirmado");
                System.out.println("Sobra $00.00");
            }
        }
        
        public void DetalledeCompra() {
            System.out.println("\n\nProductos Comprados");
            for (Producto producto : listaproductos) {
                System.out.print(producto.toString());
            }

            System.out.println("Total a pagar: " + totalpagar);
            System.out.println("Total de efectivo recibido: " + totalcliente);
            
        }
    }
    }

