/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Actividad;
import edu.umss.dip.ssiservice.model.Proyecto;
import edu.umss.dip.ssiservice.repositories.ActividadRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadServiceImpl extends GenericServiceImpl<Actividad> implements ActividadService {

    @Autowired
    private final ActividadRepository repository;

    public ActividadServiceImpl(ActividadRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Actividad> getRepository() {
        return repository;
    }
}
