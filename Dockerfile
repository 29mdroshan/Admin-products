FROM java:openjdk-8u111-jdk-alpine
ADD build/libs/admin-products-0.0.1-SNAPSHOT.war app.war
EXPOSE 9500
ENTRYPOINT ["java", "-jar", "/app.war"]