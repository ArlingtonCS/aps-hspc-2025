#!/usr/bin/env bash

echo "password: $(cat /run/secrets/password)" >> ~/.config/code-server/config.yaml
code-server --welcome-text "Please enter your team's password that is found on your team information slip" /root/hspc 
