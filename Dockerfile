FROM ubuntu:latest
LABEL authors="postgres"

ENTRYPOINT ["top", "-b"]