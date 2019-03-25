/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.AccidenteDto;
import org.modelmapper.ModelMapper;

import javax.persistence.*;

@Entity
public class Accidente extends ModelBase<AccidenteDto> {

    private String nombre;

    private String descripcion;

    private AccidenteTipo tipo;

    private Severidad severidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AccidenteTipo getTipo() {
        return tipo;
    }

    public void setTipo(AccidenteTipo eventoTipo) {
        this.tipo = eventoTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String description) {
        this.descripcion = description;
    }

    public Severidad getSeveridad() {
        return severidad;
    }

    public void setSeveridad(Severidad severidad) {
        this.severidad = severidad;
    }

    @Override
    public Accidente toDomain(AccidenteDto accidenteDto, ModelMapper mapper) {
        super.toDomain(accidenteDto, mapper);

        this.setTipo(Enum.valueOf(AccidenteTipo.class, accidenteDto.getTipo()));
        this.setSeveridad(Enum.valueOf(Severidad.class, accidenteDto.getSeveridad()));

        return this;
    }
}
