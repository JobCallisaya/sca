/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.AccidenteDto;
import org.modelmapper.ModelMapper;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class AccidenteOcurrido extends ModelBase<AccidenteDto> {

    @ManyToOne
    private ActividadEjecutada actividadEjecutada;

    @ManyToOne(optional = true)
    private Accidente accidente;

    private Date when;

    @ManyToMany
    private List<Trabajador> trabajadoresInvolucrados;

    @ManyToMany
    private List<NormaSeguridadItem> normasIncumplidas;

    private String otraCausaDescripcion;

    public ActividadEjecutada getActividadEjecutada() {
        return actividadEjecutada;
    }

    public void setActividadEjecutada(ActividadEjecutada actividadEjecutada) {
        this.actividadEjecutada = actividadEjecutada;
    }

    public Accidente getAccidente() {
        return accidente;
    }

    public void setAccidente(Accidente accidente) {
        this.accidente = accidente;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    public List<Trabajador> getTrabajadoresInvolucrados() {
        return trabajadoresInvolucrados;
    }

    public void setTrabajadoresInvolucrados(List<Trabajador> trabajadoresInvolucrados) {
        this.trabajadoresInvolucrados = trabajadoresInvolucrados;
    }

    public List<NormaSeguridadItem> getNormasIncumplidas() {
        return normasIncumplidas;
    }

    public void setNormasIncumplidas(List<NormaSeguridadItem> normasIncumplidas) {
        this.normasIncumplidas = normasIncumplidas;
    }

    public String getOtraCausaDescripcion() {
        return otraCausaDescripcion;
    }

    public void setOtraCausaDescripcion(String otraCausaDescripcion) {
        this.otraCausaDescripcion = otraCausaDescripcion;
    }
}
