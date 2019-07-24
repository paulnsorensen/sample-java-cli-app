#!/usr/bin/env bash

command -v java >/dev/null 2>&1 || { echo >&2 "Java is required but it's not installed. See README."; exit 1; }
command -v mvn >/dev/null 2>&1 || { echo >&2 "Maven is required but it's not installed. See README."; exit 1; }

mvn clean package
