#!/usr/bin/env bash
mvn clean
mvn install -Dmaven.test.skip=true
docker build -t ruanxingke/auth .
docker push ruanxingke/auth
