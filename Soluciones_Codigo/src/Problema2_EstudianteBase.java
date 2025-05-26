
/**
 *
 * @author Juan Jose
 */
public class Problema2_EstudianteBase {
    
    public String nombreestudiante;
    public int edadestudiante;
    public String nombremateria;
    public double acd;
    public double ape;
    public double aa;

    public double Calnotatotal() {
        return acd + ape + aa;
    }

    public boolean Aprobadossi_no() {
        return (Calnotatotal() / 10.0) >= 0.7;
        
    }

    public double nrecuperacion(double notaexam) {
        double parcial = Calnotatotal() * 0.6;
        return parcial + notaexam;
        
    }

    public void Mostarresultados() {
        
        System.out.println("Estudiante: " + nombreestudiante + " - Edad: " + edadestudiante);
        System.out.println("Materia: " + nombremateria);
        System.out.println("ACD: " + acd + "/3.5");
        System.out.println("APE: " + ape + "/3.5");
        System.out.println("AA: " + aa + "/3.0");
        System.out.println("Nota final: " + Calnotatotal() + "/10.0");

        if (Aprobadossi_no()) {
            System.out.println("Resultado: ¡Aprobado!");
            
        } else {
            
            System.out.println("Resultado: No aprobado");
            System.out.println("Rendir examen de recuperacion");
            double notaRec = nrecuperacion(3.5);
            System.out.println("Nota + recuperación: " + notaRec + "/10.0");
        }
    }
}

