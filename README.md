# Микросервисный проект - Доставка еды "Голодный волк".

[![Java CI](https://github.com/PerpetuumEbner/job4j_dish/actions/workflows/maven.yml/badge.svg)](https://github.com/PerpetuumEbner/job4j_dish/actions/workflows/maven.yml)

## Общее описание:

Заказ блюд на дом. Блок блюда.
* [Блок заказов](https://github.com/PerpetuumEbner/job4j_order)
* [Блок кухня](https://github.com/PerpetuumEbner/job4j_kitchen)
* [Блок уведомления](https://github.com/PerpetuumEbner/job4j_notification)

***

## Реализовано:

* Добавление/просмотр блюд
* Удаление/редактирование блюд

***

## Технологии:

[![java](https://img.shields.io/badge/java-17-red)](https://www.java.com/)
[![maven](https://img.shields.io/badge/apache--maven-3.8.3-blue)](https://maven.apache.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.6.0-brightgreen)](https://spring.io/projects/spring-boot)
[![PostgresSQL](https://img.shields.io/badge/PostgreSQL-15-blue)](https://www.postgresql.org/)
[![Lombok](https://img.shields.io/badge/Lombok-1.18.26-red)](https://projectlombok.org/)
[![Liquibase](https://img.shields.io/badge/Liquibase-4.17.2-orange)](https://www.liquibase.org/)
[![Apache Kafka](https://img.shields.io/badge/Kafka-3.4.0-%20%23000000)](https://kafka.apache.org/)

***

## Запуск проекта:

* создать базу данных `dishes`
* `maven install`
* `java -jar target/dish-0.0.1-SNAPSHOT.jar`