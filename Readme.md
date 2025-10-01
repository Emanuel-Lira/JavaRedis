# API de Produtos com Cache em Redis

![Java](https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java)
![Spring](https://img.shields.io/badge/Spring_Boot-3.x-green?style=for-the-badge&logo=spring)
![Docker](https://img.shields.io/badge/Docker-Compose-blue?style=for-the-badge&logo=docker)
![MySQL](https://img.shields.io/badge/MySQL-8.0-orange?style=for-the-badge&logo=mysql)
![Redis](https://img.shields.io/badge/Redis-7-red?style=for-the-badge&logo=redis)

## 📝 Descrição

Este projeto consiste em uma API RESTful desenvolvida em **Spring Boot** para o gerenciamento de produtos. A aplicação utiliza **MySQL** como banco de dados principal para persistência dos dados e **Redis** como uma camada de cache de alta performance para otimizar as consultas. Todo o ambiente de banco de dados e cache é gerenciado e provisionado de forma isolada e reproduzível com **Docker Compose**.

## ✨ Funcionalidades

- **API REST**  para gerenciamento de produtos (Criar, Ler, Atualizar).
- **Cache de Leitura:** Utiliza Redis para armazenar em cache os produtos consultados, reduzindo a carga no banco de dados e o tempo de resposta em leituras subsequentes (`@Cacheable`).
- **Invalidação de Cache:** O cache de um produto é automaticamente removido após uma atualização de preço, garantindo a consistência dos dados (`@CacheEvict`).
- **Ambiente Containerizado:** O ambiente de desenvolvimento (MySQL e Redis) é 100% gerenciado pelo Docker Compose, facilitando a configuração e execução.
- **Persistência de Dados:** Utiliza Spring Data JPA e Hibernate para o mapeamento objeto-relacional e persistência no MySQL.

## 🛠️ Tecnologias Utilizadas

- **Backend:**
    - Java 17
    - Spring Boot 3.x
    - Spring Web
    - Spring Data JPA
    - Spring Cache
    - Spring Data Redis
    - Hibernate
    
- **Banco de Dados:**
    - MySQL 8.0
- **Cache:**
    - Redis 7
- **Build & Ambiente:**
    - Maven
    - Docker & Docker Compose
