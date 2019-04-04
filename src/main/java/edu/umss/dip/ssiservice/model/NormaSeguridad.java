/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.NormaSeguridadDto;

import javax.persistence.*;
import java.util.List;

@Entity
public class NormaSeguridad extends ModelBase<NormaSeguridadDto> {

    private String titulo;
    private String descripcion;

    @OneToMany(mappedBy = "normaSeguridad")
    private List<NormaSeguridadItem> normaSeguridadItems;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<NormaSeguridadItem> getNormaSeguridadItems() {
        return normaSeguridadItems;
    }

    public void setNormaSeguridadItems(List<NormaSeguridadItem> normaSeguridadItems) {
        this.normaSeguridadItems = normaSeguridadItems;
    }
}
