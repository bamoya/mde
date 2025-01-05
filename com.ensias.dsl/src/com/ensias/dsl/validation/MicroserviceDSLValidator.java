package com.ensias.dsl.validation;

import com.ensias.dsl.microserviceDSL.*;
import org.eclipse.xtext.validation.Check;
import java.util.HashSet;
import java.util.Set;

public class MicroserviceDSLValidator extends AbstractMicroserviceDSLValidator {
	
    public static final String INVALID_PORT = "invalidPort";
    public static final String DUPLICATE_SERVICE_NAME = "duplicateServiceName";
    public static final String DUPLICATE_ROUTE_PATH = "duplicateRoutePath";
    public static final String INVALID_DEPENDENCIES = "invalidDependencies";
    public static final String INCOMPLETE_CONFIG = "incompleteConfig";
    public static final String INVALID_DATABASE_CONFIG = "invalidDatabaseConfig";
    
    
    //To-do Bassim
    @Check
    public void checkDependencyCompatibility(Service service) {
        Set<Dependency> dependencies = new HashSet<>(service.getDependencies());

        // Check if JPA is present when database config exists
        boolean hasDatabase = service.getConfiguration().stream()
                .anyMatch(it -> it instanceof DatabaseConfig);

        if (hasDatabase && !dependencies.contains(Dependency.JPA)) {
            warning("Database configuration requires JPA dependency",
                    MicroserviceDSLPackage.Literals.SERVICE__DEPENDENCIES,
                    INVALID_DEPENDENCIES);
        }

        // Check for unnecessary SPRING_WEB dependency since it's added by default
        if (dependencies.contains(Dependency.SPRING_WEB)) {
            warning("SPRING_WEB dependency is unnecessary as it's included by default",
                    MicroserviceDSLPackage.Literals.SERVICE__DEPENDENCIES,
                    INVALID_DEPENDENCIES);
        }

        // Check for unnecessary EUREKA_CLIENT dependency since it's added by default
        if (dependencies.contains(Dependency.EUREKA_CLIENT)) {
            warning("EUREKA_CLIENT dependency is unnecessary as it's included by default",
                    MicroserviceDSLPackage.Literals.SERVICE__DEPENDENCIES,
                    INVALID_DEPENDENCIES);
        }

        // Check for Config Client
        if (!dependencies.contains(Dependency.CONFIG_CLIENT)) {
            warning("Service should include CONFIG_CLIENT dependency for configuration management",
                    MicroserviceDSLPackage.Literals.SERVICE__DEPENDENCIES,
                    INVALID_DEPENDENCIES);
        }
    }
    
    //To-do Bassim
    @Check
    public void checkDatabaseConfiguration(DatabaseConfig dbConfig) {
        // Validate database URL format
        if (!dbConfig.getDbUrl().startsWith("jdbc:")) {
            error("Database URL must start with 'jdbc:'",
                    MicroserviceDSLPackage.Literals.DATABASE_CONFIG__DB_URL,
                    INVALID_DATABASE_CONFIG);
        }

        // Validate credentials
        if (dbConfig.getDbUsername() == null || dbConfig.getDbUsername().isEmpty()) {
            error("Database username cannot be empty",
                    MicroserviceDSLPackage.Literals.DATABASE_CONFIG__DB_USERNAME,
                    INVALID_DATABASE_CONFIG);
        }

        if (dbConfig.getDbPassword() == null || dbConfig.getDbPassword().isEmpty()) {
            warning("Database password is empty",
                    MicroserviceDSLPackage.Literals.DATABASE_CONFIG__DB_PASSWORD,
                    INVALID_DATABASE_CONFIG);
        }
    }
    
   

}
