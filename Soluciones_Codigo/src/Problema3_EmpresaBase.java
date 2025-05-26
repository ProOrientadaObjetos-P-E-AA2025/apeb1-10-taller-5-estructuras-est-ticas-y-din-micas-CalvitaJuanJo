
import java.util.ArrayList;

/**
 *
 * @author Juan Jose
 */
public class Problema3_EmpresaBase {
    
    public String nombreempresa;
    public String direccion;
    public int ruc;
    

    public ArrayList<String> nombredepartamento = new ArrayList<>();
    
    public ArrayList<Integer> empleados = new ArrayList<>();
    public ArrayList<Double> producciones = new ArrayList<>();
    public ArrayList<Character> categoria = new ArrayList<>();

    public void agregardepar(String nombre, int empleadosdepar, double produccion) {
        
        nombredepartamento.add(nombre);
        empleados.add(empleadosdepar);
        producciones.add(produccion);
        categoria.add('H');
    }

    public void chequeocategoria() {
        
        for (int i = 0; i < nombredepartamento.size(); i++) {
            
            int emple = empleados.get(i);
            double produc = producciones.get(i);
            char cate;

            if (emple > 20 && produc > 1_000_000) {
                cate = 'A';
            } else if (emple >= 20 && produc == 1_000_000) {
                cate = 'B';
            } else if (emple >= 10 && produc >= 500_000) {
                cate = 'C';
            } else {
                cate = 'D';
            }

            categoria.set(i, cate);
        }
    }

    public void imprimirdepar() {
        
        for (int i = 0; i < nombredepartamento.size(); i++) {
            
            System.out.println("Departamento:");
            System.out.println("Nombre: " + nombredepartamento.get(i));
            System.out.println("Numero empleados: " + empleados.get(i));
            System.out.println("Produccion al año: " + producciones.get(i));
            System.out.println("Categoria a favor: " + categoria.get(i));
        }
    }
}
