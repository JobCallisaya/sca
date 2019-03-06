/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.ProyectoDto;
import edu.umss.dip.ssiservice.model.Proyecto;
import edu.umss.dip.ssiservice.service.ProyectoService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/proyectos")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class ProyectoController extends GenericController<Proyecto, ProyectoDto> {
    private ProyectoService service;

    public ProyectoController(ProyectoService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}
