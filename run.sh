#!/bin/bash
./mvnw clean test install assembly:single
java -jar ./target/interview-practice-jar-with-dependencies.jar