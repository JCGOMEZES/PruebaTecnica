#!/bin/bash -x
set -e

sudo apt update
sudo yum install -y docker
sudo service docker start
sudo chkconfig docker on 
sudo usermod -a -G docker ec2-user
docker run 


cat << EOF > /home/ubuntu/test.txt
// ARCHIVO DE PRUEBA
   Contenido del archivo de texto.
// FIN DE ARCHIVO DE PRUEBA
EOF