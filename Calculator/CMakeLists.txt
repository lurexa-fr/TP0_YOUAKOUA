# Projet Calculator - ouvrir ce dossier dans CLion (File > Open)
cmake_minimum_required(VERSION 3.20)
project(Calculator NONE)
find_package(Java REQUIRED COMPONENTS Development)
include(UseJava)
add_jar(Calculator SOURCES src/calculator/Calculator.java ENTRY_POINT calculator.Calculator)
# Lancer ensuite dans le terminal CLion : java -jar cmake-build-debug/Calculator.jar
