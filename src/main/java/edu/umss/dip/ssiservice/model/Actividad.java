/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.ActividadDto;

import javax.persistence.*;
import java.util.List;

@Entity
public class Actividad extends ModelBase<ActividadDto> {

    private String nombre;

    @OneToOne(optional = true)
    private NormaSeguridad normaSeguridad;

    @ManyToMany
    private List<Accidente> accidentes;

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

    public List<Accidente> getAccidentes() {
        return accidentes;
    }

    public void setAccidentes(List<Accidente> accidentes) {
        this.accidentes = accidentes;
    }
}
