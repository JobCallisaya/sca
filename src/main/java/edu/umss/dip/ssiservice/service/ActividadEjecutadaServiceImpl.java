/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Accidente;
import edu.umss.dip.ssiservice.model.ActividadEjecutada;
import edu.umss.dip.ssiservice.repositories.AccidenteRepository;
import edu.umss.dip.ssiservice.repositories.ActividadEjecutadaRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadEjecutadaServiceImpl extends GenericServiceImpl<ActividadEjecutada> implements ActividadEjecutadaService {
    @Autowired
    private final ActividadEjecutadaRepository repository;

    public ActividadEjecutadaServiceImpl(ActividadEjecutadaRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<ActividadEjecutada> getRepository() {
        return repository;
    }
}
