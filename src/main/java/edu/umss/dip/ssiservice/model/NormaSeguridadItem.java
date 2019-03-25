/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.ActividadDto;
import edu.umss.dip.ssiservice.dto.NormaSeguridadItemDto;

import javax.persistence.*;

@Entity
public class NormaSeguridadItem extends ModelBase<NormaSeguridadItemDto> {

    private String nombre;

    @OneToOne(optional = false)
    private NormaSeguridad normaSeguridad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NormaSeguridad getNormaSeguridad() {
        return normaSeguridad;
    }

    public void setNormaSeguridad(NormaSeguridad normaSeguridad) {
        this.normaSeguridad = normaSeguridad;
    }
}
