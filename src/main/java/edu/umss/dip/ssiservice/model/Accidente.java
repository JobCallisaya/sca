/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.AccidenteDto;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Accidente extends ModelBase<AccidenteDto> {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}