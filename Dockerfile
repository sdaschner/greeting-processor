FROM tomee:8-jre-7.0.3-plus

COPY target/greeting-processor.war /usr/local/tomee/webapps/
