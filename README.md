Admin App - Application de Gestion

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.18-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-orange.svg)](https://www.mysql.com/)
[![Redis](https://img.shields.io/badge/Redis-5.0-red.svg)](https://redis.io/)


Description
Application Spring Boot pour la gestion des utilisateurs, rôles et produits avec authentification et caching Redis.


Fonctionnalités
- Gestion des utilisateurs (CRUD)
- Gestion des rôles (CRUD)  
- Gestion des produits (CRUD)
- Authentification et autorisations
- Caching avec Redis
- Base de données MySQL

Technologies utilisées
- **Backend** : Spring Boot 2.7.18
- **Base de données** : MySQL 8.0
- **Cache** : Redis 5.0
- **ORM** : Spring Data JPA (Hibernate)
- **Build** : Maven


# Prérequis
- Java 17
- Docker et Docker Compose
- MySQL 8.0 (ou Docker)
- Redis 5.0 (ou Docker)
- Maven 3.8+

# Installation

# 1. Cloner le dépôt

git clone https://github.com/votre-username/admin-app.git
cd admin-app

2. Configuration de la base de données avec Docker
   
# Démarrer MySQL et Redis
docker-compose up -d

# Vérifier que les conteneurs tournent
docker ps

3. Configuration manuelle de MySQL
   
CREATE DATABASE IF NOT EXISTS adminapp-db;
CREATE USER IF NOT EXISTS 'user'@'%' IDENTIFIED BY 'user123';
CREATE USER IF NOT EXISTS 'user'@'localhost' IDENTIFIED BY 'user123';
GRANT ALL PRIVILEGES ON adminapp-db.* TO 'user'@'%';
GRANT ALL PRIVILEGES ON adminapp-db.* TO 'user'@'localhost';
FLUSH PRIVILEGES;

5. Configuration de l'application
   
# application.yml configuré avec :
- MySQL: localhost:3307
- Redis: localhost:6379
- Utilisateur: user/password: user123
  
5. Compiler et lancer
   
# Avec Maven
mvn clean install
mvn spring-boot:run

# Ou depuis IntelliJ
Run -> AdminAppApplication

# Déploiement avec Docker

# Construction de l'image Docker
docker build -t admin-app .


# Lancement avec Docker Compose
docker-compose up -d

# API Endpoints
Rôles (/roles)
Méthode	Endpoint	Description
GET	/roles	Liste tous les rôles
GET	/roles/{id}	Rôle par ID
POST	/roles	Créer un rôle
PUT	/roles/{id}	Modifier un rôle
DELETE	/roles/{id}	Supprimer un rôle

# Exemples de requêtes (Postman)
Créer un rôle
json
POST http://localhost:8080/roles
Content-Type: application/json

{
    "nom": "ADMIN"
}


# Contact
Votre Nom 
# Jean-Leon KABOBI 
  # Email : jeanleon.kabobi@gmail.com

Lien du projet: https://github.com/jean-leonkabobi/admin-app

# Remerciements

Mr Ngor Seck

Spring Boot

Docker

Redis

MySQL

