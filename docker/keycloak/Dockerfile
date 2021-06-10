ARG KEYCLOAK_VERSION

FROM jboss/keycloak:${KEYCLOAK_VERSION}

ENV KEYCLOAK_HOME=/opt/jboss/keycloak

COPY jbcrypt-0.4.jar jbcrypt-0.4.jar
COPY keycloak-bcrypt-1.4.0.jar  ${KEYCLOAK_HOME}/standalone/deployments/keycloak-bcrypt-1.4.0.jar

RUN ${KEYCLOAK_HOME}/bin/jboss-cli.sh --command="module add --name=org.mindrot.jbcrypt --resources=jbcrypt-0.4.jar"
