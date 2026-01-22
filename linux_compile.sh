#!/bin/bash
set -e

mvn clean package

JAR_FILE=$(find target -name "*jar-with-dependencies.jar" | head -1)

if [ -n "$JAR_FILE" ] && [ -f "$JAR_FILE" ]; then
    ln -sf "$(pwd)/$JAR_FILE" "./latest-simulator.jar"
    echo "Built: $JAR_FILE"
    echo "Symlink: ./latest-simulator.jar"
fi