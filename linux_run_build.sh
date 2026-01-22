#!/bin/bash

set -e

latest_jar=$(ls -t RBMK-1500-Simulator-*.jar | head -1)

if [ -f "$latest_jar" ]; then
    echo "Running: $latest_jar"
    java -jar "$latest_jar"
else
    echo "No artifact JAR found"
fi
