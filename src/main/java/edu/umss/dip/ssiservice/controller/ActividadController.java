/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.dto.ActividadDto;
import edu.umss.dip.ssiservice.model.Actividad;
import edu.umss.dip.ssiservice.service.ActividadService;
import edu.umss.dip.ssiservice.service.GenericService;
import edu.umss.dip.ssiservice.service.NormaSeguridadService;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.List;

@Path("/actividades")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class ActividadController extends GenericController<Actividad, ActividadDto> {
    private ActividadService service;
    private NormaSeguridadService normaSeguridadService;

    public ActividadController(ActividadService service, NormaSeguridadService normaSeguridadService) {
        this.service = service;
        this.normaSeguridadService = normaSeguridadService;
    }

    @Override
    protected Actividad toModel(ActividadDto dto) {
        Actividad actividad = super.toModel(dto);
        if(dto.getNormaSeguridadId() != null) {
            actividad.setNormaSeguridad(normaSeguridadService.findById(dto.getNormaSeguridadId()));
        }

        return actividad;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}
