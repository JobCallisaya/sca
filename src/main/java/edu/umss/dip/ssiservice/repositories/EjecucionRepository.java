/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.repositories;

import edu.umss.dip.ssiservice.model.Actividad;
import edu.umss.dip.ssiservice.model.Ejecucion;
import org.springframework.stereotype.Repository;

@Repository
public interface EjecucionRepository extends GenericRepository<Ejecucion> {
}
