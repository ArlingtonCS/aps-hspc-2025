#!/usr/bin/env bash

echo "password: $(cat /run/secrets/password)" >> ~/.config/code-server/config.yaml
code-server /root/hspc
