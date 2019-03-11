/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.NormaSeguridad;
import edu.umss.dip.ssiservice.repositories.GenericSpRepository;
import edu.umss.dip.ssiservice.repositories.NormaSeguridadRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class NormaSeguridadServiceImpl extends GenericServiceImpl<NormaSeguridad> implements NormaSeguridadService {
    @Autowired
    private final NormaSeguridadRepository repository;

    public NormaSeguridadServiceImpl(NormaSeguridadRepository repository) {
        this.repository = repository;
        this.repository.setTClass(NormaSeguridad.class);

    }

    @Override
    protected GenericSpRepository<NormaSeguridad> getRepository() {
        return repository;
    }
}
