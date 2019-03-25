/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.NormaSeguridad;
import edu.umss.dip.ssiservice.model.Proyecto;
import edu.umss.dip.ssiservice.repositories.NormaSeguridadRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NormaSeguridadServiceImpl extends GenericServiceImpl<NormaSeguridad> implements NormaSeguridadService {
    @Autowired
    private final NormaSeguridadRepository repository;

    public NormaSeguridadServiceImpl(NormaSeguridadRepository repository) {
        this.repository = repository;

    }

    @Override
    protected GenericRepository<NormaSeguridad> getRepository() {
        return repository;
    }
}
