/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Trabajador;
import edu.umss.dip.ssiservice.repositories.GenericSpRepository;
import edu.umss.dip.ssiservice.repositories.TrabajadorRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TrabajadorServiceImpl extends GenericServiceImpl<Trabajador> implements TrabajadorService {
    @Autowired
    private final TrabajadorRepository repository;

    public TrabajadorServiceImpl(TrabajadorRepository repository) {
        this.repository = repository;
        this.repository.setTClass(Trabajador.class);
    }

    @Override
    protected GenericSpRepository<Trabajador> getRepository() {
        return repository;
    }
}
