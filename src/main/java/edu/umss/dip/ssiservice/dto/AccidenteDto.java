package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Accidente;
import org.apache.tomcat.util.codec.binary.Base64;
import org.modelmapper.ModelMapper;

public class AccidenteDto extends DtoBase<Accidente> {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public AccidenteDto toDto(Accidente accidente, ModelMapper mapper) {
        super.toDto(accidente, mapper);
        return this;
    }
}
