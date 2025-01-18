# Système de Gestion et Surveillance d'un Réseau Informatique

Ce projet vise à développer un système de gestion et de surveillance d'un réseau informatique. Il permet de surveiller les équipements réseau, de gérer les utilisateurs, de collecter des logs, et de générer des rapports.

## Table des matières
- [Fonctionnalités](#fonctionnalités)
- [Technologies utilisées](#technologies-utilisées)
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Structure du projet](#structure-du-projet)
- [Auteurs](#auteurs)
- [Licence](#licence)

## Fonctionnalités

- **Surveillance des équipements réseau** :
  - Vérification de l'état des équipements (en ligne/hors ligne).
  - Collecte des données système (CPU, mémoire, espace disque).
- **Gestion des utilisateurs** :
  - Authentification des utilisateurs.
  - Gestion des rôles (admin, utilisateur standard).
- **Journalisation (logs)** :
  - Enregistrement des événements et des erreurs.
- **Génération de rapports** :
  - Rapports sur l'état du réseau et des équipements.
- **Interface graphique** :
  - Tableaux pour afficher les données.
  - Boutons pour exécuter les actions.

## Technologies utilisées

- **Backend** :
  - Java (pour la logique métier et la gestion des équipements).
  - Threads (pour la surveillance en temps réel).
  - Bash (pour les scripts système).
- **Frontend** :
  - JavaFX (pour l'interface graphique).
- **Base de données** :
  - MySQL/PostgreSQL (pour stocker les données des équipements, logs, et utilisateurs).
  - PL/SQL (pour les procédures stockées et les rapports).
- **Outils** :
  - Git (pour le versioning).
  - Maven/Gradle (pour la gestion des dépendances).

## Installation

### Prérequis

- Java JDK 11 ou supérieur.
- MySQL/PostgreSQL.
- Maven/Gradle.

### Étapes d'installation

1. Clonez le dépôt :
   ```bash
   git clone https://github.com/votre-utilisateur/votre-depot.git
