/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Actividad;
import edu.umss.dip.ssiservice.repositories.ActividadRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import edu.umss.dip.ssiservice.repositories.GenericSpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

@Service
public class ActividadServiceImpl extends GenericServiceImpl<Actividad> implements ActividadService {

    @Autowired
    private final ActividadRepository repository;

    public ActividadServiceImpl(ActividadRepository repository) {
        this.repository = repository;
        this.repository.setTClass(Actividad.class);
    }

    @Override
    protected GenericSpRepository<Actividad> getRepository() {
        return repository;
    }
}
