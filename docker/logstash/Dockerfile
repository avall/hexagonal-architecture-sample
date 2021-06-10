ARG ELK_VERSION

# https://github.com/elastic/logstash-docker
FROM docker.elastic.co/logstash/logstash:${ELK_VERSION}

#USER 1000:1000

# Add your logstash plugins setup here
# Example: RUN logstash-plugin install logstash-filter-json
COPY --chown=1000:1000 wait-for-it.sh wait-for-it.sh
COPY --chown=1000:1000 wait-for-it.sh /wait-for-it.sh
COPY --chown=1000:1000 wait-for-it.sh /virtual_logstash/wait-for-it.sh

#RUN ls -la
#RUN whoami

#RUN ls -la
#RUN ls / -la
#RUN ls /virtual_logstash -la

#RUN chmod +x wait-for-it.sh
#RUN chmod +x /wait-for-it.sh
#RUN chmod +x /virtual_logstash/wait-for-it.sh

#RUN pwd
#RUN ls -la
