/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Trabajador;
import edu.umss.dip.ssiservice.repositories.TrabajadorRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class TrabajadorServiceImpl extends GenericServiceImpl<Trabajador> implements TrabajadorService {
    private final TrabajadorRepository repository;

    public TrabajadorServiceImpl(TrabajadorRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Trabajador> getRepository() {
        return repository;
    }
}
