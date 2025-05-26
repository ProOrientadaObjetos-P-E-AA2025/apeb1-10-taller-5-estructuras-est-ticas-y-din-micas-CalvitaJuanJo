
/**
 *
 * @author Juan Jose
 */
public class Problema3_DepartamentoEjecutor {
    
    public static void main(String[] args) {
        
        Problema3_EmpresaBase base = new Problema3_EmpresaBase();

        base.agregardepar("Ventas", 10, 350000);
        base.agregardepar("Recursos Humanos", 15, 250000);
        base.agregardepar("Administrativo", 5, 500000);

        base.chequeocategoria();

        base.imprimirdepar();
    }
}
