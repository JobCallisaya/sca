/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.NormaSeguridadDto;
import edu.umss.dip.ssiservice.model.NormaSeguridad;
import edu.umss.dip.ssiservice.service.NormaSeguridadService;
import edu.umss.dip.ssiservice.service.GenericService;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/normasSeguridad")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class NormaSeguridadController extends GenericController<NormaSeguridad, NormaSeguridadDto> {
    private NormaSeguridadService service;

    public NormaSeguridadController(NormaSeguridadService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}
