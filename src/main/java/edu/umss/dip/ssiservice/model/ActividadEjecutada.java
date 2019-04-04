/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.ActividadDto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class ActividadEjecutada extends ModelBase<ActividadDto> {

    @OneToOne(optional = false)
    private ActividadPlanificada actividadPlanificada;

    @ManyToOne(optional = false)
    private Ejecucion ejecucion;

    @OneToMany(mappedBy = "actividadEjecutada")
    private List<AccidenteOcurrido> accidentesOcurridos;

    public ActividadPlanificada getActividadPlanificada() {
        return actividadPlanificada;
    }

    public void setActividadPlanificada(ActividadPlanificada actividadPlanificada) {
        this.actividadPlanificada = actividadPlanificada;
    }

    public List<AccidenteOcurrido> getAccidentesOcurridos() {
        return accidentesOcurridos;
    }

    public void setAccidentesOcurridos(List<AccidenteOcurrido> accidentesOcurridos) {
        this.accidentesOcurridos = accidentesOcurridos;
    }

    public Ejecucion getEjecucion() {
        return ejecucion;
    }

    public void setEjecucion(Ejecucion ejecucion) {
        this.ejecucion = ejecucion;
    }
}
