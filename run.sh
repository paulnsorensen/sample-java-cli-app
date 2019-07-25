#!/usr/bin/env bash

# Change your jar name to match your output here
JAR_NAME=app-1.0-SNAPSHOT-shaded.jar

java -jar target/$JAR_NAME "$@"
