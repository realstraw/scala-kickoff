#! /usr/bin/env bash

# Downloads the latest SBT script for the project

PROJECT_ROOT=\$(readlink "\$0" || printf "\$0" | xargs dirname | xargs dirname)

SBT_FILE=\$PROJECT_ROOT/sbt

curl -s https://raw.githubusercontent.com/paulp/sbt-extras/master/sbt > \
    \$SBT_FILE && chmod 0755 \$SBT_FILE
