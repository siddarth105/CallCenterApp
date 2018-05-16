FROM java:8
ADD /target/callcenter-0.0.1-SNAPSHOT.war callcenter-0.0.1-SNAPSHOT.war
EXPOSE 8080
RUN bash -c 'touch /callcenter-0.0.1-SNAPSHOT.war'
ENTRYPOINT ["java","-jar","/callcenter-0.0.1-SNAPSHOT.war"]
