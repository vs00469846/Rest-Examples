FROM openjdk:8
ADD helloservice-0.0.1-SNAPSHOT.jar helloservice.jar
#EXPOSE 44445
#COPY tsaqueryconfig.properties /config/
ENTRYPOINT ["java","-Dserver.port=${SERVER.PORT}","-jar","helloservice.jar"]
