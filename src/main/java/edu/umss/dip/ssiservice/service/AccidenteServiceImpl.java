/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Accidente;
import edu.umss.dip.ssiservice.model.Proyecto;
import edu.umss.dip.ssiservice.repositories.AccidenteRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccidenteServiceImpl extends GenericServiceImpl<Accidente> implements AccidenteService {
    @Autowired
    private final AccidenteRepository repository;

    public AccidenteServiceImpl(AccidenteRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Accidente> getRepository() {
        return repository;
    }
}
