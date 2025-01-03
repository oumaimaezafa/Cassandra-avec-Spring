# Développement d'une Application Spring Boot pour la Gestion des Produits avec Cassandra

Ce projet implémente une application Spring Boot qui interagit avec une base de données Cassandra pour effectuer des opérations CRUD (Create, Read, Update, Delete) sur les produits. Cassandra est utilisé comme système de gestion de base de données NoSQL en raison de ses capacités de scalabilité et de haute disponibilité.

## Exemples d'images

### Création d'un produit
![Création d'un produit](images/create.png)
Cette image montre probablement l'interface utilisateur ou une illustration liée à la fonctionnalité de création d'un produit dans l'application. Il pourrait s'agir d'un formulaire de création ou de l'ajout d'un produit dans la base de données Cassandra.

### Récupération des produits
![Récupération des produits](images/get.png)
Cette image illustre probablement la fonction "Get", c'est-à-dire la récupération des informations d'un produit depuis la base de données. L'image pourrait afficher une réponse à une requête GET ou la liste des produits récupérés.

### Interface Swagger
![Interface Swagger](images/swagger.png)
Swagger est une interface populaire utilisée pour tester les API REST. Cette image pourrait être une capture d'écran de l'interface Swagger qui permet d'interagir avec les endpoints de l'application. Swagger génère automatiquement la documentation des API et permet de tester les différentes opérations CRUD (comme GET, POST, PUT, DELETE).

### Récupération des produits (autre illustration)
![Récupération des produits](images/get.png)
Cette répétition de l'image "get.png" pourrait être une erreur, ou peut-être une tentative d'illustrer une autre utilisation de la fonction "GET", comme par exemple la récupération de plusieurs produits ou d'autres cas d'usage similaires.

### Interaction avec Cassandra via cqlsh
![Interaction avec Cassandra via cqlsh](images/sqlsh.png)
Cette image pourrait illustrer l'utilisation de l'outil en ligne de commande `cqlsh` de Cassandra pour exécuter des requêtes CQL (Cassandra Query Language). Elle montre probablement l'exécution de commandes pour interagir directement avec la base de données Cassandra, comme des insertions ou des sélections de produits.

## Résumé des Concepts et Outils Utilisés

- **Spring Boot** : Framework utilisé pour développer l'application backend, simplifiant la configuration et le développement des services RESTful.
- **Cassandra** : Base de données NoSQL utilisée pour stocker les informations des produits. Elle est configurée avec Spring Boot via Spring Data Cassandra pour effectuer les opérations CRUD.
- **Swagger** : Outil permettant de tester et documenter les API. Il génère une interface web pour tester facilement les différentes fonctionnalités exposées par votre application.
- **CQLSH** : Outil en ligne de commande pour interagir directement avec Cassandra, utile pour gérer les données à travers des requêtes CQL.

## Conclusion

Le projet illustre l'utilisation conjointe de Spring Boot et Cassandra pour créer une application de gestion des produits. Les images mentionnées servent à illustrer les différentes fonctionnalités de l'application, comme la création et la récupération de produits, l'utilisation de Swagger pour tester les API, et l'interaction avec la base de données Cassandra via des outils comme `cqlsh`. Ce processus fournit une solution robuste et scalable pour gérer des produits dans un environnement de production.
