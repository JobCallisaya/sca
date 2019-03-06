package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Trabajador;
import org.modelmapper.ModelMapper;

public class TrabajadorDto extends DtoBase<Trabajador> {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public TrabajadorDto toDto(Trabajador trabajador, ModelMapper mapper) {
        super.toDto(trabajador, mapper);
        return this;
    }
}
