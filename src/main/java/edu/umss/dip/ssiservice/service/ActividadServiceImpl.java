/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Actividad;
import edu.umss.dip.ssiservice.repositories.ActividadRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class ActividadServiceImpl extends GenericServiceImpl<Actividad> implements ActividadService {
    private final ActividadRepository repository;

    public ActividadServiceImpl(ActividadRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Actividad> getRepository() {
        return repository;
    }
}
