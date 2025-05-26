
import java.util.Scanner;

/**
 *
 * @author Juan Jose
 */
public class Problema2_MateriaEjecutor {
    
    public static void main(String[] args) { 
        Scanner tcl = new Scanner(System.in);
        
        Problema2_EstudianteBase base = new Problema2_EstudianteBase();

        System.out.print("Imgrese nombre estudiante: ");
        base.nombreestudiante = tcl.nextLine();

        System.out.print("Ingrese edad del estudiante: ");
        base.edadestudiante = tcl.nextInt();
        tcl.nextLine();

        System.out.print("Ingrese nombre de la materia: ");
        base.nombremateria = tcl.nextLine();

        System.out.print("Ingrese nota ACD: ");
        base.acd = tcl.nextDouble();

        System.out.print("Ingrese nota APE: ");
        base.ape = tcl.nextDouble();

        System.out.print("Ingrese nota AA: ");
        base.aa = tcl.nextDouble();

        System.out.println();
        base.Mostarresultados();
    }
}


    
    

