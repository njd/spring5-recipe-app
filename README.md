# Spring 5 Recipe App

## Running
```
mvn spring-boot:run

mvn spring-boot:start
mvn spring-boot:stop
```

## For Docker Desktop
```
mvn spring-boot:build=image
docker run -p8080:8080 --name recipe-app spring5-recipe-app:0.0.1-SNAPSHOT
```
