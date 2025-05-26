
import java.util.ArrayList;

/**
 *
 * @author Juan Jose
 */
public class Problema1_CarritodeComprasEjecutor {
    public static void main(String[] args) {

        Problema1_ProductoBase base= new Problema1_ProductoBase();

        ArrayList<Problema1_ProductoBase.Producto> listaproductos = new ArrayList<>();
        listaproductos.add(base.new Producto("Arooz CyC", 12.00, 4));
        listaproductos.add(base.new Producto("Pollo Asado", 7.99, 2));
        listaproductos.add(base.new Producto("Cola", 2.00, 2));

        for (Problema1_ProductoBase.Producto producto : listaproductos) {
            System.out.print(producto.toString());
        }

        Problema1_ProductoBase.CarrodeCompras carro = base.new CarrodeCompras(listaproductos);
        carro.totalcliente = 10.00;

        System.out.println("\n=== Detalle de Compra ===");
        carro.calculartotal();
        carro.confirmarpago();
        System.out.println();
        carro.DetalledeCompra();
    }
}

