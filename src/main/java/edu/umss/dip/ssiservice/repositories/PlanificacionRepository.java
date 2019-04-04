/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.repositories;

import edu.umss.dip.ssiservice.model.Actividad;
import edu.umss.dip.ssiservice.model.Planificacion;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanificacionRepository extends GenericRepository<Planificacion> {
}
