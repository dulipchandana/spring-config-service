# spring-config-service
Application Configuration Server 
 - Sedicated , dynamic , centralized key/value store 
 - Authoritative source 
 - Auditing 
 - versioning 
 Manage config with 
  -Spring Cloud console 
  -Spring Cloud Zookeeper
  -spring Cloud config
Config Client 
 Embedded in application
 Spring Envirnment abstraction 
  eg @Injection , 
  
Config Server 
 - Standalone (can be embedded )
 
 
Config Server 
 HTTP REST access 
 out put formats 
  - JSON (default)
  - Properties
  -YAML
 backend stores 
  -GIT(default)
  -SVN
  -Filessystems

 application.properties
  spring.cloud.config.server.gituri = <uri.to.git config>
  
  
  secure config server 
  
  Rest endpoint 
  GET/{application}/{profile}/{label}
  
  GET/{application}-{profile}.(yml|properties)
  
  eg : /master/myapp-prod.yml
  
  
  
 
 