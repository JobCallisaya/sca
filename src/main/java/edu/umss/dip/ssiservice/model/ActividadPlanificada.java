/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.ActividadDto;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class ActividadPlanificada extends ModelBase<ActividadDto> {

    @ManyToOne
    private Planificacion planificacion;

    @ManyToOne
    private Actividad actividad;

    @OneToOne(mappedBy = "actividadPlanificada")
    private ActividadEjecutada actividadEjecutada;

    public Planificacion getPlanificacion() {
        return planificacion;
    }

    public void setPlanificacion(Planificacion planificacion) {
        this.planificacion = planificacion;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public ActividadEjecutada getActividadEjecutada() {
        return actividadEjecutada;
    }

    public void setActividadEjecutada(ActividadEjecutada actividadEjecutada) {
        this.actividadEjecutada = actividadEjecutada;
    }
}
