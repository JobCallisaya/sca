/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.AccidenteDto;
import edu.umss.dip.ssiservice.model.Accidente;
import edu.umss.dip.ssiservice.service.AccidenteService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/accidentes")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class AccidenteController extends GenericController<Accidente, AccidenteDto> {
    private AccidenteService service;

    public AccidenteController(AccidenteService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}
