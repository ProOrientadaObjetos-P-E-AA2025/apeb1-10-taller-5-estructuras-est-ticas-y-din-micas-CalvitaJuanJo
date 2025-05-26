
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author Juan Jose
 */
public class Problema5_ConflictoBase {
    
    public String nombre;
    public LocalDate fechainicio;
    public String estactual;
    public int totalpaismundo;
    public ArrayList<Evento> eventos;

    public Problema5_ConflictoBase(String nombre, LocalDate fechainicio, int totalpaismundo, ArrayList<Evento> eventos) {
        
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.totalpaismundo = totalpaismundo;
        this.eventos = eventos;
    }

    public void actualizarEstado() {
        int numeropaisbatalla = 0;
        for (Evento evento : eventos) {
            numeropaisbatalla += (evento.nombre.equals("Batalla")) ? 1 : 0;
        }

        if (((numeropaisbatalla / 100.0) * totalpaismundo) > 50) {
            this.estactual = "Guerra Mundial";
        } else if (((numeropaisbatalla / 100.0) * totalpaismundo) > 30) {
            this.estactual = "Reunion de ONU";
        }

        for (Evento evento : eventos) {
            for (Pais pais : evento.paises) {
                if (pais.estdesarrollo && evento.uanucleares) {
                    this.estactual = "Guerra Mundial";
                    break;
                }
            }
        }

        for (Evento evento : eventos) {
            for (Pais pais : evento.paises) {
                if (((pais.numerobajas / 100.0) * pais.totalpersonas) > 50) {
                    this.estactual = "Reunion de ONU";
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "\nDetalles de Conflicto" +
               "\nNombre: " + nombre +
               "\nFecha de inicio: " + fechainicio +
               "\nEstado actual: " + estactual +
               "\nTotal países mundo: " + totalpaismundo +
               "\nEventos: " + eventos;
    }
}

class Evento {
    public String nombre;
    public LocalDate fecha;
    public String ubicacion;
    public String descripcion;
    public boolean uanucleares;
    public ArrayList<Pais> paises;

    public Evento(String nombre, LocalDate fecha, String ubicacion, String descripcion,
                  boolean uanucleares, ArrayList<Pais> paises) {
        
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.uanucleares = uanucleares;
        this.paises = paises;
    }

    public String toString() {
        
        return "\n   Evento{" +
               "\n   Nombre: " + nombre +
               "\n   Fecha: " + fecha +
               "\n   Ubicacion: " + ubicacion +
               "\n   Descripcion: " + descripcion +
               "\n   Armas nucleares: " + uanucleares +
               "\n   Países involucrados: " + paises + "\n   }";
    }
}

class Pais {
    
    public String nombre;
    public boolean estdesarrollo;
    public int totalpersonas;
    public int numerobajas;

    public Pais(String nombre, boolean estdesarrollo, int totalpersonas, int numerobajas) {
        
        this.nombre = nombre;
        this.estdesarrollo = estdesarrollo;
        this.totalpersonas = totalpersonas;
        this.numerobajas = numerobajas;
    }

    public String toString() {
        return "\n      - Pais{" +
               "\n        Nombre: " + nombre +
               "\n        Desarrollado: " + estdesarrollo +
               "\n        Perosnas: " + totalpersonas +
               "\n        Bajas: " + numerobajas +
               "\n      }";
    }
}
