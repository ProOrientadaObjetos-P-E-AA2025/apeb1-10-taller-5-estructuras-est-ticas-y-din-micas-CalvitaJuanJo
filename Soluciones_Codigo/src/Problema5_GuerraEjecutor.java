
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Juan Jose
 */
public class Problema5_GuerraEjecutor {
    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);
        Random rand = new Random();
        char opcion = 'S';
        
        String[] nombresEventos = {"Batalla", "Tratado de paz", "Reunion Diplomatica"};

        while (opcion == 'S' || opcion == 's') {
            ArrayList<Pais> paises1 = new ArrayList<>(Arrays.asList(
                new Pais("Peru", false, 100, 10),
                new Pais("Ecuador", false, 100, 10),
                new Pais("Colombia", false, 100, 10)
            ));

            ArrayList<Pais> paises2 = new ArrayList<>(Arrays.asList(
                    
                new Pais("Rusia", true, 100, 60),
                new Pais("Ucrania", false, 100, 10),
                new Pais("China", true, 100, 10)
            ));

            ArrayList<Evento> eventos = new ArrayList<>(Arrays.asList(
                    
                new Evento(nombresEventos[rand.nextInt(nombresEventos.length)],
                           LocalDate.of(2025, 5, 15),
                           "Europa", "Problemas de territorio", false, paises1),
                new Evento(nombresEventos[rand.nextInt(nombresEventos.length)],
                           LocalDate.of(2024, 5, 15),
                           "Europa", "Problemas políticos", true, paises2)
            ));

            Problema5_ConflictoBase conflicto = new Problema5_ConflictoBase(
                    
                "Reseteo Mundial",
                LocalDate.of(2025, 5, 15),
                100,
                eventos
            );

            conflicto.actualizarEstado();
            System.out.println(conflicto);

            System.out.print("¿Desea ver otro (Si/No): ");
            opcion = tcl.next().charAt(0);
        }

        tcl.close();
    }
}