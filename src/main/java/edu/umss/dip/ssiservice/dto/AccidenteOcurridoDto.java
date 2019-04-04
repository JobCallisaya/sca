package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Accidente;
import org.modelmapper.ModelMapper;

public class AccidenteOcurridoDto extends DtoBase<Accidente> {
    private String nombre;
    private String descripcion;
    private String tipo;
    private String severidad;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSeveridad() {
        return severidad;
    }

    public void setSeveridad(String severidad) {
        this.severidad = severidad;
    }

    @Override
    public AccidenteOcurridoDto toDto(Accidente accidente, ModelMapper mapper) throws InstantiationException, IllegalAccessException {
        super.toDto(accidente, mapper);
        this.setTipo(accidente.getTipo().name());
        this.setSeveridad(accidente.getSeveridad().name());
        return this;
    }
}
