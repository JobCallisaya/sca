/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.repositories;

import edu.umss.dip.ssiservice.model.ModelBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@SuppressWarnings("rawtypes")
@NoRepositoryBean
public interface GenericSpRepository<T extends ModelBase> extends JpaRepository<T, Long> {
    void setTClass(Class<T> clase);
}
