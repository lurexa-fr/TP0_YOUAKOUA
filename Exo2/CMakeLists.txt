# Projet Exo2 - ouvrir ce dossier dans CLion (File > Open)
cmake_minimum_required(VERSION 3.20)
project(Exo2 NONE)
find_package(Java REQUIRED COMPONENTS Development)
include(UseJava)
add_jar(Exo2 SOURCES src/exo2/Exo2.java ENTRY_POINT exo2.Exo2)
# Lancer ensuite dans le terminal CLion : java -jar cmake-build-debug/Exo2.jar
