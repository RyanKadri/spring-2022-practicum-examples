#!/bin/bash

sudo yum update -y
sudo yum install java-11-amazon-corretto -y
wget https://github.com/RyanKadri/spring2021-practicum-examples/raw/main/6-apis/housing-data-example/housing-api.jar
wget https://raw.githubusercontent.com/RyanKadri/spring2021-practicum-examples/main/6-apis/housing-data-example/real-estate-data.csv
nohup java -jar housing-api.jar &