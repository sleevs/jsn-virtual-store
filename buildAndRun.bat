@echo off
call mvn clean package
call docker build -t br.com.jsn/virtual-store-with-javaEE .
call docker rm -f virtual-store-with-javaEE
call docker run -d -p 9080:9080 -p 9443:9443 --name virtual-store-with-javaEE br.com.jsn/virtual-store-with-javaEE