
import java.util.ArrayList;


/**
 *
 * @author Juan Jose
 */
public class Problema4_AppFiscaliaBase {
    
    String nombre;
    String[] fechainicio;
    String estado;
    String detalles;
    
    ArrayList<PersonaImplicada> personas;

    public Problema4_AppFiscaliaBase(String nombre, String[] fechainicio, String detalles) {
        
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.detalles = detalles;
        this.estado = "Iniciado";
        
        this.personas = new ArrayList<>();
    }

    public void actuestado() {
        
        int dtranscurridos = (int) (Math.random() * 30);

        if (dtranscurridos > 14) {
            
            estado = "Alerta";
            
        } else if (dtranscurridos > 7) {
            
            estado = "Aviso";
        }
    }

    public double calfianza(PersonaImplicada persona) {
        
        if (persona.nivelImplicacion.equals("Acusado") && persona.colabora == 1 && persona.sentencia < 1) {
            return persona.dañoeconomico * 0.5;
        }
        
        return 0;
    }

    public void detalles() {
        
        System.out.println("\nDatos del Caso");
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha inicio: " + fechainicio[2] + "/" + fechainicio[1] + "/" + fechainicio[0]);
        System.out.println("Estado: " + estado);
        System.out.println("Detalles: " + detalles);

        System.out.println("\nPersonas Implicadas: ");
        
        for (PersonaImplicada persona : personas) {
            
            System.out.println("Nombre: " + persona.nombre);
            System.out.println("  Edad: " + persona.edad + " años");
            System.out.println("  Cargo: " + persona.cargo);
            System.out.println("  Rol: " + persona.nivelImplicacion);
            System.out.println("  Colabora: " + (persona.colabora == 1 ? "Si" : "No"));

            if (persona.nivelImplicacion.equals("Acusado")) {
                
                System.out.println("  Sentencia: " + String.format("%.1f", persona.sentencia) + " años");
                System.out.println("  Daño economico: $" + String.format("%,.2f", persona.dañoeconomico));
                double fianza = calfianza(persona);
                
                if (fianza > 0) {
                    
                    System.out.println("  [Total de Fianza]: $" + String.format("%,.2f", fianza));
                }
            }
            System.out.println("");
        }
    }
}

class PersonaImplicada {
    
    String nombre;
    int edad;
    String cargo;
    String nivelImplicacion;
    int colabora;
    double sentencia;
    double dañoeconomico;

    public PersonaImplicada(String nombre, int edad, String cargo,
                            String nivelImplicacion, int colabora,
                            double sentencia, double dañoeconomico) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.nivelImplicacion = nivelImplicacion;
        this.colabora = colabora;
        this.sentencia = sentencia;
        this.dañoeconomico = dañoeconomico;
    }
}
