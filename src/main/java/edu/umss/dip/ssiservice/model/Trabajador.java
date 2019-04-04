/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.TrabajadorDto;

import javax.persistence.Entity;

@Entity
public class Trabajador extends ModelBase<TrabajadorDto> {

    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombres) {
        this.nombre = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellidos) {
        this.apellido = apellidos;
    }
}
