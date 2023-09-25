# boot-session-replication-demo
--------------------------------------
    after setup DB as application.properties .
    [ to setup mysql via docker -please check Dockerfilestore repo to get docker-compose file.]
    
    run application on port-8080 & 8081
    for testing run following 2 url (user/pass =user/user)
    http://localhost:8080/
    http://localhost:8081/

  why :
  because need session accross nodes if one node is down app should not ask user to login again.
  how : configure below 2 properties
  spring.session.store-type=jdbc
  spring.session.jdbc.initialize-schema=always
  how to verifying :
  try login with 2 nodes-> and be down one nodes after and try to access home page.
  
  
