package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Actividad;
import edu.umss.dip.ssiservice.model.NormaSeguridad;
import org.modelmapper.ModelMapper;

public class ActividadDto extends DtoBase<Actividad> {
    private String nombre;
    private Long normaSeguridadId;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNormaSeguridadId() {
        return normaSeguridadId;
    }

    public void setNormaSeguridadId(Long normaSeguridadId) {
        this.normaSeguridadId = normaSeguridadId;
    }

    @Override
    public ActividadDto toDto(Actividad actividad, ModelMapper mapper) {
        super.toDto(actividad, mapper);
        this.setNormaSeguridadId(
                actividad.getNormaSeguridad() != null
                        ? actividad.getNormaSeguridad().getId()
                        : 0);
        return this;
    }
}
