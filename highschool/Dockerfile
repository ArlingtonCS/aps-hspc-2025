FROM debian:bookworm-slim

ARG PORT=5000
ARG CODESERVER_VERSION="4.96.2"
ARG TARGETPLATFORM
EXPOSE $PORT

RUN apt-get update && \
    apt-get install -y java-common python3 curl build-essential && \
    curl -L "https://github.com/coder/code-server/releases/download/v$(echo $CODESERVER_VERSION)/code-server_$(echo $CODESERVER_VERSION)_$(echo $TARGETPLATFORM | cut -d "/" -f 2).deb" -o /tmp/code-server.deb && \
    apt-get install /tmp/code-server.deb && \
    curl -L "https://corretto.aws/downloads/latest/amazon-corretto-17-$(echo $TARGETPLATFORM | cut -d "/" -f 2 | sed "s/amd/x/" | sed "s/arm/aarch/")-linux-jdk.deb" -o /tmp/jdk.deb && \
    apt-get install /tmp/jdk.deb && \
    apt-get clean && \
    mkdir -p ~/.config/code-server && \
    echo "bind-addr: 0.0.0.0:$PORT\nauth: password\ncert: false\n" > ~/.config/code-server/config.yaml && \
    code-server --install-extension task.vscode-task && \
    sh -c "$(curl --location https://taskfile.dev/install.sh)" -- -d -b /usr/local/bin;

COPY ./run.sh /run.sh

RUN chmod +x /run.sh;

COPY ./container/ /root/hspc
VOLUME /root/hspc

WORKDIR /root/hspc

CMD [ "/run.sh" ]
