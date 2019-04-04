package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.NormaSeguridad;
import org.modelmapper.ModelMapper;

public class NormaSeguridadDto extends DtoBase<NormaSeguridad> {
    private String titulo;
    private String descripcion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public NormaSeguridadDto toDto(NormaSeguridad normaSeguridad, ModelMapper mapper) throws InstantiationException, IllegalAccessException {
        super.toDto(normaSeguridad, mapper);
        return this;
    }
}
