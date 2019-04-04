package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.PlanificacionDto;

import javax.persistence.*;
import java.util.List;

@Entity
public class Planificacion extends ModelBase<PlanificacionDto> {
    @OneToOne
    private Proyecto proyecto;
    @OneToOne(mappedBy = "planificacion")
    private Ejecucion ejecucion;

    @OneToMany(mappedBy = "planificacion")
    private List<ActividadPlanificada> actividadesPlanificadas;

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public List<ActividadPlanificada> getActividadesPlanificadas() {
        return actividadesPlanificadas;
    }

    public void setActividadesPlanificadas(List<ActividadPlanificada> actividadesPlanificadas) {
        this.actividadesPlanificadas = actividadesPlanificadas;
    }
}
