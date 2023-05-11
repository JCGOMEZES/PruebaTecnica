#!/bin/bash -x
set -e

sudo apt update
sudo apt install -y nginx
sudo yum install -y docker
sudo apt-get install docker-compose
sudo service docker start
sudo chkconfig docker on 
sudo usermod -a -G docker ec2-user
docker pull juancamilodevops/imagen-apigateway:latest
docker run juancamilodevops/imagen-apigateway  


cat << EOF > /home/ubuntu/test.txt
// ARCHIVO DE PRUEBA
   Contenido del archivo de texto.
// FIN DE ARCHIVO DE PRUEBA
EOF
