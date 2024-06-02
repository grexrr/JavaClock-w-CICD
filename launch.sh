#!/bin/bash
docker build -t java-clock .
docker rm -f grexrr-clock
docker run --name grexrr-clock --rm java-clock
