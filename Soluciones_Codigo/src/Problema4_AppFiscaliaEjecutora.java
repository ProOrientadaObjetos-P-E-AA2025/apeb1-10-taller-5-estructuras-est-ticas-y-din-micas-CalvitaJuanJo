
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Juan Jose
 */
public class Problema4_AppFiscaliaEjecutora {
    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);
        
        char opcion = 'S';

        String[] nombrepersona = {"Juan Cueva", "Ana Gómez", "Dana Ochoa", "Carmen Gutierrez", "Ismael Sánchez"};
        String[] cargos = {"Funcionario público", "Contador", "Abogado", "Empresario", "Juez"};
        String[] roles = {"Acusado", "Testigo", "Víctima", "Abogado defensor"};

        while (opcion == 'S' || opcion == 's') {
            
            System.out.println("\nNuevo Caso: ");

            String[] fechainicio = {
                
                String.valueOf(2023 + (int) (Math.random() * 3)),
                String.valueOf(1 + (int) (Math.random() * 12)),
                String.valueOf(1 + (int) (Math.random() * 28))
            };
            
            Problema4_AppFiscaliaBase base = new Problema4_AppFiscaliaBase(
                    
                    "Caso " + (char) (65 + (int) (Math.random() * 26)) + "-" + (1000 + (int) (Math.random() * 9000)),
                    fechainicio, "Presunto delito de " + new String[]{"sobornos", "malversacion", "trafico de influencias"}[(int) (Math.random() * 3)]);

            
            int numPersonas = 1 + (int) (Math.random() * 4);
            ArrayList<PersonaImplicada> personas = new ArrayList<>();

            for (int i = 0; i < numPersonas; i++) {
                
                personas.add(new PersonaImplicada(
                        nombrepersona[(int) (Math.random() * nombrepersona.length)],
                        25 + (int) (Math.random() * 40),
                        cargos[(int) (Math.random() * cargos.length)],
                        roles[(int) (Math.random() * roles.length)],
                        (int) (Math.random() * 2),
                        Math.random() * 5,
                        10000 + (Math.random() * 90000)
                ));
            }

            base.personas = personas;
            base.actuestado();
            base.detalles();
            System.out.print("\nDesea crear otro caso (Si/No): ");
            opcion = tcl.next().charAt(0);
        }

        System.out.println("\nSaliendo: ");
    }
}
