# Vehicle API project
Vehicle API project for Udacity java nanodegree course

# Requirements
* Java 11
* Maven

# How to run
It is required to have `Eureka` server running before running `pricing` and `vehicles` module altogether

```shell script
# Boogle maps module
$ cd boogle-maps
$ mvn package
$ java -jar target/boogle-maps-0.0.1-SNAPSHOT.jar

# Eureka server module
$ cd eureka-server
$ mvn package
$ java -jar target/eureka-0.0.1-SNAPSHOT.jar

# Pricing module
$ cd pricing-service
$ mvn package
$ java -jar target/pricing-service-0.0.1-SNAPSHOT.jar

# Vehicles API module
$ cd vehicles-api
$ mvn package
$ java -jar target/eureka-0.0.1-SNAPSHOT.jar
```

# Test

```shell script
# Boogle maps module
$ cd boogle-maps
$ mvn test

# Eureka server module
$ cd eureka-server
$ mvn test

# Pricing module
$ cd pricing-service
$ mvn test

# Vehicles API module
$ cd vehicles-api
$ mvn test
```
