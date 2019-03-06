package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Actividad;
import org.modelmapper.ModelMapper;

public class ActividadDto extends DtoBase<Actividad> {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public ActividadDto toDto(Actividad actividad, ModelMapper mapper) {
        super.toDto(actividad, mapper);
        return this;
    }
}
