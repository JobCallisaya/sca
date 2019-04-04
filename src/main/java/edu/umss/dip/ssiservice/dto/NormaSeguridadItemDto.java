package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.NormaSeguridad;
import edu.umss.dip.ssiservice.model.NormaSeguridadItem;
import org.modelmapper.ModelMapper;

public class NormaSeguridadItemDto extends DtoBase<NormaSeguridadItem> {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public NormaSeguridadItemDto toDto(NormaSeguridadItem normaSeguridadItem, ModelMapper mapper) throws InstantiationException, IllegalAccessException {
        super.toDto(normaSeguridadItem, mapper);
        return this;
    }
}
