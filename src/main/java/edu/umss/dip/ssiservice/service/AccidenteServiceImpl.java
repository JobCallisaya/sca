/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Accidente;
import edu.umss.dip.ssiservice.repositories.AccidenteRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import edu.umss.dip.ssiservice.repositories.GenericSpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccidenteServiceImpl extends GenericServiceImpl<Accidente> implements AccidenteService {
    @Autowired
    private final AccidenteRepository repository;

    public AccidenteServiceImpl(AccidenteRepository repository) {
        this.repository = repository;
        this.repository.setTClass(Accidente.class);
    }

    @Override
    protected GenericSpRepository<Accidente> getRepository() {
        return repository;
    }
}
