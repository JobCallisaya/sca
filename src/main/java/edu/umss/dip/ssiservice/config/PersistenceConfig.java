/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.config;

import edu.umss.dip.ssiservice.repositories.GenericSpRepositoryImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = {"edu.umss.dip.ssiservice.repositories"},
        repositoryBaseClass = GenericSpRepositoryImpl.class
)
public class PersistenceConfig {
}
