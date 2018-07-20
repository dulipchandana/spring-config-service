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
  
  
  access the default profile 
   localhost:8888/config-client-app/default
   
   Bootstrapping with bootstrap.properties or bootstrap.yml
   
   specify the location of the config server 
   
  #bootstrap.properties
   spring.application.name=<application_name>
   
   spring.cloud.config.uri=http://localhost:8888
   
   --if discovery first 
   spring.cloud.config.discovery.enable=true
   
   -- how to refresh the properties manualy ..
   
   POST localhost:8080/refresh
   
   in spring boot 1.5.15.BUILD-SNAPSHOT the refresh path is unothrized with default 
   
   management.security.enabled=false enabling the path 
   
   
   --
//auto refreshing with git repo properies 
@RefreshScope

encripting a config server properties 
application.properties

my.datasource.username=unam
my.datasource.password={cipher}JDJDJJYRVUFVVFF


application.yml

my:
 datasource:
  uasename: uname
  password: '{cipher}IUIURIJRHHUH'
  
  
 
 
