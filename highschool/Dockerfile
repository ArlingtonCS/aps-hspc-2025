FROM ubuntu:latest

ARG PORT=5000
ARG CODESERVER_VERSION="4.92.2"
ARG TARGETPLATFORM

RUN apt-get update && \
    apt-get install -y openjdk-21-jdk && \
    apt-get install -y python3 && \
    apt-get install -y curl && \
    apt-get clean;

RUN curl -L "https://github.com/coder/code-server/releases/download/v$(echo $CODESERVER_VERSION)/code-server_$(echo $CODESERVER_VERSION)_$(echo $TARGETPLATFORM | cut -d "/" -f 2).deb" -o /tmp/code-server.deb; \
    apt-get install /tmp/code-server.deb;

EXPOSE $PORT

RUN mkdir -p ~/.config/code-server && echo "bind-addr: 0.0.0.0:$PORT\nauth: password\ncert: false\n" > ~/.config/code-server/config.yaml;

RUN code-server --install-extension ms-python.python;
RUN code-server --install-extension redhat.java;

COPY ./run.sh /run.sh

RUN chmod +x /run.sh;

COPY ./ /root/hspc
VOLUME /root/hspc

WORKDIR /root/hspc

CMD [ "/run.sh" ]
