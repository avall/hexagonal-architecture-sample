ARG ELK_VERSION

# https://github.com/elastic/elasticsearch-docker
FROM docker.elastic.co/elasticsearch/elasticsearch:${ELK_VERSION}


#RUN ls -l
# Add your elasticsearch plugins setup here
# Example: RUN elasticsearch-plugin install analysis-icu
COPY wait-for-it.sh wait-for-it.sh
COPY wait-for-it.sh /wait-for-it.sh
COPY wait-for-it.sh /virtual_elastic/wait-for-it.sh


#RUN whoami

#RUN ls / -la
#RUN ls /virtual_elastic -la
#
RUN chmod +x wait-for-it.sh
RUN chmod +x /wait-for-it.sh
RUN chmod +x /virtual_elastic/wait-for-it.sh

USER elasticsearch

#
#RUN pwd
#RUN ls -l
