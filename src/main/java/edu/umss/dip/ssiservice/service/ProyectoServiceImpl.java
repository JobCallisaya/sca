/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.service;

import edu.umss.dip.ssiservice.model.Proyecto;
import edu.umss.dip.ssiservice.repositories.GenericSpRepository;
import edu.umss.dip.ssiservice.repositories.ProyectoRepository;
import edu.umss.dip.ssiservice.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProyectoServiceImpl extends GenericServiceImpl<Proyecto> implements ProyectoService {
    @Autowired
    private final ProyectoRepository repository;

    public ProyectoServiceImpl(ProyectoRepository repository) {
        this.repository = repository;
        this.repository.setTClass(Proyecto.class);
    }

    @Override
    protected GenericSpRepository<Proyecto> getRepository() {
        return repository;
    }
}
