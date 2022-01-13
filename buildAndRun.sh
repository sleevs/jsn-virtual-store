#!/bin/sh
mvn clean package && docker build -t br.com.jsn/virtual-store-with-javaEE .
docker rm -f virtual-store-with-javaEE || true && docker run -d -p 9080:9080 -p 9443:9443 --name virtual-store-with-javaEE br.com.jsn/virtual-store-with-javaEE