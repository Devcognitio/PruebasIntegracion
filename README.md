# PruebasIntregracion
Arquetipo para pruebas de integracion y unitarias - Gradle, Spring, Java8

## Ejecutar pruebas unitarias
./gradlew test

## Ejecutar pruebas integracion
./gradlew integrationTest

## Ejecutar build del proyecto ejecutando todas las pruebas
./gradlew build

## Ejecutar build del proyecto excluyendo todas las pruebas
./gradlew build -x test -x integrationTest