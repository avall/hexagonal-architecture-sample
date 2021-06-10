ARG ELK_VERSION

# https://github.com/elastic/kibana-docker
FROM docker.elastic.co/kibana/kibana:${ELK_VERSION}

#USER 1000:1000


# Add your kibana plugins setup here
# Example: RUN kibana-plugin install <name|url>
COPY --chown=1000:1000 wait-for-it.sh wait-for-it.sh
COPY --chown=1000:1000 wait-for-it.sh /wait-for-it.sh
COPY --chown=1000:1000 wait-for-it.sh /virtual_kibana/wait-for-it.sh

#RUN ls -la
#RUN whoami

#RUN chmod +x wait-for-it.sh
#RUN chmod +x /wait-for-it.sh
#RUN chmod +x /virtual_kibana/wait-for-it.sh
#
#RUN pwd
#RUN ls -l
#RUN ls bin -l