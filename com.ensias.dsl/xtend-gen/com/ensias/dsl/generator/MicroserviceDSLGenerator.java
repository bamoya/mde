/**
 * generated by Xtext 2.37.0
 */
package com.ensias.dsl.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

import com.ensias.dsl.microserviceDSL.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MicroserviceDSLGenerator extends AbstractGenerator {
    @Override
    public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
        for (EObject root : resource.getContents()) {
            if (root instanceof Model) {
                Model model = (Model) root;
                generateProjectStructure(model, fsa);
            }
        }
    }
    
    // To-do Bassim 
    private void generateProjectStructure(Model model, IFileSystemAccess2 fsa) {
        // Generate parent pom.xml
        generateParentPom(model, fsa);
        
        // Generate Discovery Service
        generateDiscoveryService(model.getDiscovery(), model, fsa);
        
        // Generate Gateway Service
        generateGatewayService(model.getGateway(), model, fsa);
        
        // Generate Config Server
        generateConfigServer(model.getConfigServer(), model, fsa);
        
        // Generate Microservices
        for (Service service : model.getServices()) {
            generateMicroservice(service, model, fsa);
        }
    }
    
    // to-do Bassim 
    private void generateParentPom(Model model, IFileSystemAccess2 fsa) {
        StringBuilder pomContent = new StringBuilder();
        pomContent.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n")
                 .append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n")
                 .append("    xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd\">\n")
                 .append("    <modelVersion>4.0.0</modelVersion>\n\n")
                 .append("    <groupId>").append(model.getGroupName()).append("</groupId>\n")
                 .append("    <artifactId>").append(model.getName()).append("</artifactId>\n")
                 .append("    <version>").append(model.getVersion().replace("\"", "")).append("</version>\n")
                 .append("    <packaging>pom</packaging>\n\n")
                 .append("    <name>").append(model.getName()).append("</name>\n")
                 .append("    <description>").append(model.getDescription().replace("\"", "")).append("</description>\n\n")
                 .append("    <parent>\n")
                 .append("        <groupId>org.springframework.boot</groupId>\n")
                 .append("        <artifactId>spring-boot-starter-parent</artifactId>\n")
                 .append("        <version>2.7.0</version>\n")
                 .append("        <relativePath/>\n")
                 .append("    </parent>\n\n")
                 .append("    <modules>\n")
                 .append("        <module>").append(model.getDiscovery().getName()).append("</module>\n")
                 .append("        <module>").append(model.getGateway().getName()).append("</module>\n")
                 .append("        <module>").append(model.getConfigServer().getName()).append("</module>\n");

        for (Service service : model.getServices()) {
            pomContent.append("        <module>").append(service.getName()).append("</module>\n");
        }

        pomContent.append("    </modules>\n")
                 .append("</project>");

        fsa.generateFile("pom.xml", pomContent.toString());
    }

    //to-do Bassim
    private void generateDiscoveryService(Discovery discovery, Model model, IFileSystemAccess2 fsa) {
        String basePackagePath = model.getGroupName().replace(".", "/");
        String servicePath = discovery.getName() + "/";

        // Generate pom.xml
        StringBuilder pomContent = new StringBuilder();
        pomContent.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n")
                 .append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\">\n")
                 .append("    <modelVersion>4.0.0</modelVersion>\n\n")
                 .append("    <artifactId>").append(discovery.getName()).append("</artifactId>\n\n")
                 .append("    <parent>\n")
                 .append("        <groupId>").append(model.getGroupName()).append("</groupId>\n")
                 .append("        <artifactId>").append(model.getName()).append("</artifactId>\n")
                 .append("        <version>").append(model.getVersion().replace("\"", "")).append("</version>\n")
                 .append("    </parent>\n\n")
                 .append("    <properties>\n")
                 .append("        <spring-cloud.version>2021.0.3</spring-cloud.version>\n")
                 .append("    </properties>\n\n")
                 .append("    <dependencies>\n")
                 .append("        <dependency>\n")
                 .append("            <groupId>org.springframework.cloud</groupId>\n")
                 .append("            <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>\n")
                 .append("        </dependency>\n");

        // Add custom dependencies
        for (Dependency dep : discovery.getCustomDeps()) {
            addDependencyToPom(pomContent, dep);
        }

        pomContent.append("    </dependencies>\n\n")
                 .append("    <dependencyManagement>\n")
                 .append("        <dependencies>\n")
                 .append("            <dependency>\n")
                 .append("                <groupId>org.springframework.cloud</groupId>\n")
                 .append("                <artifactId>spring-cloud-dependencies</artifactId>\n")
                 .append("                <version>${spring-cloud.version}</version>\n")
                 .append("                <type>pom</type>\n")
                 .append("                <scope>import</scope>\n")
                 .append("            </dependency>\n")
                 .append("        </dependencies>\n")
                 .append("    </dependencyManagement>\n")
                 .append("</project>");

        fsa.generateFile(servicePath + "pom.xml", pomContent.toString());

        // Generate application.yml
        StringBuilder ymlContent = new StringBuilder();
        ymlContent.append("server:\n")
                 .append("  port: ").append(discovery.getPort()).append("\n\n")
                 .append("eureka:\n")
                 .append("  client:\n")
                 .append("    registerWithEureka: false\n")
                 .append("    fetchRegistry: false\n");
        
        if (discovery.getDefaultZone() != null) {
            ymlContent.append("    serviceUrl:\n")
                     .append("      defaultZone: ").append(discovery.getDefaultZone().replace("\"", "")).append("\n");
        }

        fsa.generateFile(servicePath + "src/main/resources/application.yml", ymlContent.toString());

        // Generate main application class
        StringBuilder mainClass = new StringBuilder();
        mainClass.append("package ").append(model.getGroupName()).append(".discovery;\n\n")
                .append("import org.springframework.boot.SpringApplication;\n")
                .append("import org.springframework.boot.autoconfigure.SpringBootApplication;\n")
                .append("import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;\n\n")
                .append("@SpringBootApplication\n")
                .append("@EnableEurekaServer\n")
                .append("public class DiscoveryApplication {\n\n")
                .append("    public static void main(String[] args) {\n")
                .append("        SpringApplication.run(DiscoveryApplication.class, args);\n")
                .append("    }\n")
                .append("}\n");

        fsa.generateFile(servicePath + "src/main/java/" + basePackagePath + "/discovery/DiscoveryApplication.java",
                mainClass.toString());
    }
    
    // To-do Bassim
    private void generateConfigServer(ConfigServer configServer, Model model, IFileSystemAccess2 fsa) {
        String basePackagePath = model.getGroupName().replace(".", "/");
        String servicePath = configServer.getName() + "/";

        // Generate pom.xml
        StringBuilder pomContent = new StringBuilder();
        pomContent.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n")
            .append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\">\n")
            .append(" <modelVersion>4.0.0</modelVersion>\n\n")
            .append(" <artifactId>").append(configServer.getName()).append("</artifactId>\n\n")
            .append(" <parent>\n")
            .append(" <groupId>").append(model.getGroupName()).append("</groupId>\n")
            .append(" <artifactId>").append(model.getName()).append("</artifactId>\n")
            .append(" <version>").append(model.getVersion().replace("\"", "")).append("</version>\n")
            .append(" </parent>\n\n")
            .append(" <dependencies>\n")
            .append(" <dependency>\n")
            .append(" <groupId>org.springframework.cloud</groupId>\n")
            .append(" <artifactId>spring-cloud-config-server</artifactId>\n")
            .append(" </dependency>\n");

        // Add custom dependencies
        for (Dependency dep : configServer.getCustomDeps()) {
            addDependencyToPom(pomContent, dep);
        }

        pomContent.append(" </dependencies>\n")
            .append("</project>");

        fsa.generateFile(servicePath + "pom.xml", pomContent.toString());

        // Generate application.yml with git configuration
        StringBuilder ymlContent = new StringBuilder();
        ymlContent.append("server:\n")
            .append(" port: ").append(configServer.getPort()).append("\n\n")
            .append("spring:\n")
            .append("	cloud:\n")
            .append(" 		config:\n")
            .append(" 			server:\n")
            .append(" 				git:\n")
            .append(" 					uri: ").append(configServer.getGitUri()).append("\n");
        
        // Add git branch if specified
        if (configServer.getGitBranch() != null && !configServer.getGitBranch().isEmpty()) {
            ymlContent.append(" 					default-label: ").append(configServer.getGitBranch()).append("\n");
        }

        fsa.generateFile(servicePath + "src/main/resources/application.yml", ymlContent.toString());

        // Generate main application class
        StringBuilder mainClass = new StringBuilder();
        mainClass.append("package ").append(model.getGroupName()).append(".config;\n\n")
            .append("import org.springframework.boot.SpringApplication;\n")
            .append("import org.springframework.boot.autoconfigure.SpringBootApplication;\n")
            .append("import org.springframework.cloud.config.server.EnableConfigServer;\n\n")
            .append("@SpringBootApplication\n")
            .append("@EnableConfigServer\n")
            .append("public class ConfigServerApplication {\n\n")
            .append(" public static void main(String[] args) {\n")
            .append(" SpringApplication.run(ConfigServerApplication.class, args);\n")
            .append(" }\n")
            .append("}\n");

        fsa.generateFile(servicePath + "src/main/java/" + basePackagePath + "/config/ConfigServerApplication.java",
            mainClass.toString());
    }
    

    
    
    // Helper method to add dependencies to pom.xml
    // to-do bassim
    private void addDependencyToPom(StringBuilder pomContent, Dependency dep) {
        switch (dep) {
            case SPRING_WEB:
                pomContent.append("        <dependency>\n")
                         .append("            <groupId>org.springframework.boot</groupId>\n")
                         .append("            <artifactId>spring-boot-starter-web</artifactId>\n")
                         .append("        </dependency>\n");
                break;
            case ACTUATOR:
                pomContent.append("        <dependency>\n")
                         .append("            <groupId>org.springframework.boot</groupId>\n")
                         .append("            <artifactId>spring-boot-starter-actuator</artifactId>\n")
                         .append("        </dependency>\n");
                break;
            case LOMBOK:
                pomContent.append("        <dependency>\n")
                         .append("            <groupId>org.projectlombok</groupId>\n")
                         .append("            <artifactId>lombok</artifactId>\n")
                         .append("            <optional>true</optional>\n")
                         .append("        </dependency>\n");
                break;
            case JPA:
                pomContent.append("        <dependency>\n")
                         .append("            <groupId>org.springframework.boot</groupId>\n")
                         .append("            <artifactId>spring-boot-starter-data-jpa</artifactId>\n")
                         .append("        </dependency>\n");
                break;
            case CONFIG_CLIENT:
                pomContent.append("        <dependency>\n")
                         .append("            <groupId>org.springframework.cloud</groupId>\n")
                         .append("            <artifactId>spring-cloud-starter-config</artifactId>\n")
                         .append("        </dependency>\n");
                break;
        }
    }
}

private void generateMicroservice(Service service, Model model, IFileSystemAccess2 fsa) {
    String basePackagePath = model.getGroupName().replace(".", "/");
    String servicePath = service.getName() + "/";

    // Generate pom.xml with dependencies
    generateServicePom(service, model, servicePath, fsa);

    // Generate application.yml
    generateServiceApplicationYml(service, servicePath, fsa);

    // Generate main application class
    generateServiceMainClass(service, model, basePackagePath, servicePath, fsa);
}

private void generateServicePom(Service service, Model model, String servicePath, IFileSystemAccess2 fsa) {
    StringBuilder pomContent = new StringBuilder();
    pomContent.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n")
            .append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\">\n")
            .append("    <modelVersion>4.0.0</modelVersion>\n\n")
            .append("    <artifactId>").append(service.getName()).append("</artifactId>\n\n")
            .append("    <parent>\n")
            .append("        <groupId>").append(model.getGroupName()).append("</groupId>\n")
            .append("        <artifactId>").append(model.getName()).append("</artifactId>\n")
            .append("        <version>").append(model.getVersion().replace("\"", "")).append("</version>\n")
            .append("    </parent>\n\n")
            .append("    <dependencies>\n");

    // Add Spring Boot Starter Web dependency
    pomContent.append("        <dependency>\n")
            .append("            <groupId>org.springframework.boot</groupId>\n")
            .append("            <artifactId>spring-boot-starter-web</artifactId>\n")
            .append("        </dependency>\n");

    // Add Eureka Client dependency
    pomContent.append("        <dependency>\n")
            .append("            <groupId>org.springframework.cloud</groupId>\n")
            .append("            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>\n")
            .append("        </dependency>\n");

    // Process additional dependencies based on service configuration
    for (Dependency dependency : service.getDependencies()) {
        addDependencyToPom(pomContent, dependency);
    }

    // Add database driver dependency if database config exists
    for (ServiceConfigEntry config : service.getConfiguration()) {
        if (config instanceof DatabaseConfig) {
            DatabaseConfig dbConfig = (DatabaseConfig) config;
            switch (dbConfig.getDriver()) {
                case MYSQL:
                    pomContent.append("        <dependency>\n")
                            .append("            <groupId>mysql</groupId>\n")
                            .append("            <artifactId>mysql-connector-java</artifactId>\n")
                            .append("            <scope>runtime</scope>\n")
                            .append("        </dependency>\n");
                    break;
                case POSTGRESQL:
                    pomContent.append("        <dependency>\n")
                            .append("            <groupId>org.postgresql</groupId>\n")
                            .append("            <artifactId>postgresql</artifactId>\n")
                            .append("            <scope>runtime</scope>\n")
                            .append("        </dependency>\n");
                    break;
                case H2:
                    pomContent.append("        <dependency>\n")
                            .append("            <groupId>com.h2database</groupId>\n")
                            .append("            <artifactId>h2</artifactId>\n")
                            .append("            <scope>runtime</scope>\n")
                            .append("        </dependency>\n");
                    break;
            }
        }
    }

    // Add Spring Cloud dependency management
    pomContent.append("    </dependencies>\n\n")
            .append("    <dependencyManagement>\n")
            .append("        <dependencies>\n")
            .append("            <dependency>\n")
            .append("                <groupId>org.springframework.cloud</groupId>\n")
            .append("                <artifactId>spring-cloud-dependencies</artifactId>\n")
            .append("                <version>2021.0.3</version>\n")
            .append("                <type>pom</type>\n")
            .append("                <scope>import</scope>\n")
            .append("            </dependency>\n")
            .append("        </dependencies>\n")
            .append("    </dependencyManagement>\n\n")
            .append("    <build>\n")
            .append("        <plugins>\n")
            .append("            <plugin>\n")
            .append("                <groupId>org.springframework.boot</groupId>\n")
            .append("                <artifactId>spring-boot-maven-plugin</artifactId>\n")
            .append("                <configuration>\n")
            .append("                    <excludes>\n")
            .append("                        <exclude>\n")
            .append("                            <groupId>org.projectlombok</groupId>\n")
            .append("                            <artifactId>lombok</artifactId>\n")
            .append("                        </exclude>\n")
            .append("                    </excludes>\n")
            .append("                </configuration>\n")
            .append("            </plugin>\n")
            .append("        </plugins>\n")
            .append("    </build>\n")
            .append("</project>");

    fsa.generateFile(servicePath + "pom.xml", pomContent.toString());
}


// Helper method to generate package structure
// to-do hajar & fatiha
private void generatePackageStructure(Service service, Model model, String basePackagePath, String servicePath, IFileSystemAccess2 fsa) {
    String basePath = servicePath + "src/main/java/" + basePackagePath + "/" + service.getName().toLowerCase() + "/";

    // Create basic package structure
    String[] packages = {"controller", "service", "model", "repository", "config"};

    for (String pkg : packages) {
        String packagePath = basePath + pkg;
        // Create empty .gitkeep file to maintain directory structure
        fsa.generateFile(packagePath + "/.gitkeep", "");
    }
}

// Helper method to capitalize first letter

private String capitalize(String str) {
    if (str == null || str.isEmpty()) {
        return str;
    }
    return str.substring(0, 1).toUpperCase() + str.substring(1);
}
