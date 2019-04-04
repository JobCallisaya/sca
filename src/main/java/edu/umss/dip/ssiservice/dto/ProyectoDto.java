package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Planificacion;
import edu.umss.dip.ssiservice.model.Proyecto;
import org.modelmapper.ModelMapper;

public class ProyectoDto extends DtoBase<Proyecto> {
    private String nombre;
    private String descripcion;
    private PlanificacionDto planificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public PlanificacionDto getPlanificacion() {
        return planificacion;
    }

    public void setPlanificacion(PlanificacionDto planificacion) {
        this.planificacion = planificacion;
    }

    @Override
    public ProyectoDto toDto(Proyecto proyecto, ModelMapper mapper) throws IllegalAccessException, InstantiationException {
        super.toDto(proyecto, mapper);
        this.planificacion = (PlanificacionDto)(PlanificacionDto.class.newInstance()).toDto(proyecto.getPlanificacion(), mapper);
        return this;
    }
}
