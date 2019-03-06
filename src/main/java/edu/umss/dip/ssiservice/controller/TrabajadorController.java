/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.TrabajadorDto;
import edu.umss.dip.ssiservice.model.Trabajador;
import edu.umss.dip.ssiservice.service.TrabajadorService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/trabajadores")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class TrabajadorController extends GenericController<Trabajador, TrabajadorDto> {
    private TrabajadorService service;

    public TrabajadorController(TrabajadorService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}
