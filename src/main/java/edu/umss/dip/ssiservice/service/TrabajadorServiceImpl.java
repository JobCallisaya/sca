/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Proyecto;
import edu.umss.dip.ssiservice.model.Trabajador;
import edu.umss.dip.ssiservice.repositories.TrabajadorRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajadorServiceImpl extends GenericServiceImpl<Trabajador> implements TrabajadorService {
    @Autowired
    private final TrabajadorRepository repository;

    public TrabajadorServiceImpl(TrabajadorRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Trabajador> getRepository() {
        return repository;
    }
}
