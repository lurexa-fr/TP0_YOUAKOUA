# Projet Exo1 - ouvrir ce dossier dans CLion (File > Open)
cmake_minimum_required(VERSION 3.20)
project(Exo1 NONE)
find_package(Java REQUIRED COMPONENTS Development)
include(UseJava)
add_jar(Exo1 SOURCES src/exo1/Exo1.java ENTRY_POINT exo1.Exo1)
# Lancer ensuite dans le terminal CLion : java -jar cmake-build-debug/Exo1.jar
