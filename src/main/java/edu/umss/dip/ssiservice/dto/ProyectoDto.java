package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Proyecto;
import org.modelmapper.ModelMapper;

public class ProyectoDto extends DtoBase<Proyecto> {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public ProyectoDto toDto(Proyecto proyecto, ModelMapper mapper) {
        super.toDto(proyecto, mapper);
        return this;
    }
}
