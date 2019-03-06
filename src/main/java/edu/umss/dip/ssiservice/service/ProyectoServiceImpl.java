/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Proyecto;
import edu.umss.dip.ssiservice.repositories.ProyectoRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServiceImpl extends GenericServiceImpl<Proyecto> implements ProyectoService {
    private final ProyectoRepository repository;

    public ProyectoServiceImpl(ProyectoRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Proyecto> getRepository() {
        return repository;
    }
}
