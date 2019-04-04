package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.ActividadDto;
import edu.umss.dip.ssiservice.dto.EjecucionDto;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Ejecucion extends ModelBase<EjecucionDto> {
    @OneToOne
    private Planificacion planificacion;

    @OneToMany(mappedBy = "ejecucion")
    private List<ActividadEjecutada> actividadesEjecutadas;

    public Planificacion getPlanificacion() {
        return planificacion;
    }

    public void setPlanificacion(Planificacion planificacion) {
        this.planificacion = planificacion;
    }

    public List<ActividadEjecutada> getActividadesEjecutadas() {
        return actividadesEjecutadas;
    }

    public void setActividadesEjecutadas(List<ActividadEjecutada> actividadesEjecutadas) {
        this.actividadesEjecutadas = actividadesEjecutadas;
    }
}
