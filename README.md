## 💳 Digital Banking Backend

Ce projet est un backend complet pour la gestion de comptes bancaires, développé avec **Spring Boot**, **Spring Data JPA**, **Spring Security**, et **Hibernate**. Il propose des fonctionnalités CRUD sur les clients et comptes, des opérations bancaires, et une API REST sécurisée.

---

### 📁 Structure du projet

```bash
ma.enset.digitalbankingbackend
├── entities/                # Entités JPA : Customer, BankAccount, SavingAccount, CurrentAccount, AccountOperation
├── dtos/                   # Objets de transfert (DTOs) pour exposer les données
├── enums/                  # Enums : AccountStatus, OperationType
├── repositories/           # Interfaces Spring Data JPA
├── services/               # Interfaces et implémentations des services métiers
├── mappers/                # MapStruct ou classe manuelle pour mapper Entity <-> DTO
├── web/                    # Contrôleurs REST exposant les endpoints
├── security/               # Spring Security config (optionnelle)
└── DigitalBankingBackendApplication.java  # Classe principale Spring Boot
```

### Le diagramme de Classe 

![Diagramme de classe](/images/img.png)

---

### ⚙️ Technologies utilisées

* **Java 17+**
* **Spring Boot 3.x**
* **Spring Data JPA (Hibernate)**
* **Spring Web (REST)**
* **Spring Security (en option)**
* **H2 Database / MySQL**
* **Lombok**
* **MapStruct (ou mappage manuel)**

---

### 🧑‍💻 Fonctionnalités implémentées

#### ✅ Gestion des clients (Customer)

* Création, consultation, mise à jour et suppression de clients
* Association d’un ou plusieurs comptes bancaires à un client

Test de Customer avec mysql

![TableCustomer](/images/img_2.png)

#### ✅ Gestion des comptes bancaires

* Création de :

    * **Current Account** (avec découvert autorisé)
    * **Saving Account** (avec taux d’intérêt)
* Consultation des détails d’un compte
* Listing des comptes d’un client

Test de Compte bancaire avec mysql

![TableBank_account](/images/img_3.png)

#### ✅ Opérations bancaires

* Crédit et débit sur un compte
* Historique des opérations
* Consultation du solde
* Pagination de l’historique des opérations

Test de Operation Bancaire avec mysql

![TableBank_Operation](/images/img_1.png)

#### ✅ Initialisation des données

Un `CommandLineRunner` injecte automatiquement des données fictives à chaque démarrage :

* Clients de test (Hassan, Imane, Mohamed)
* Comptes courants et d’épargne associés
* 10 opérations aléatoires (crédit/débit) par compte

---

### 🔐 Sécurité (à venir ou partielle)

* Prévu : authentification via Spring Security + JWT
* Gestion des rôles (ADMIN / USER)

---

### 🔗 Exposition via API REST

* API RESTful complète pour les opérations CRUD
* Endpoints exposés sous `/api/customers`, `/api/accounts`, `/api/operations`, etc.
* Compatible avec Swagger/OpenAPI si souhaité

 La capture de la API REST exposé
 ![APiRestExpose](/images/img_4.png)

 La capture Avec Swagger/OpenAPI  et documentation api-docs
 ![APiRestExpose](/images/img_5.png)

 ![APidocs](/images/img_6.png)

### Tester les web services Restful

#### La capture des test pour BankAccountRestapi

![APiRest](/images/img_7.png)

![APiRest](/images/img_8.png)

![APiRest](/images/img_9.png)

![APiRest](/images/img_10.png)

![APiRest](/images/img_11.png)

![APiRest](/images/img_12.png)

#### La capture des test pour CustomerRestController

![APiRest](/images/img_13.png)

![APiRest](/images/img_14.png)

![APiRest](/images/img_15.png)

![APiRest](/images/img_16.png)

![APiRest](/images/img_17.png)







---

### ▶️ Exécution du projet

#### Avec H2 Database (test rapide)

1. Cloner le repo
2. Lancer `DigitalBankingBackendApplication`
3. Accéder à la console H2 : [http://localhost:8085/h2-console](http://localhost:8080/h2-console)

    * JDBC URL : `jdbc:h2:mem:testdb`
    * User : `sa`
    * Pass : \`\`

#### Avec MySQL (prod/dev)

Configurer le fichier `application.properties` :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/digital_banking
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

---


---

### 📄 Auteur

* Projet réalisé dans le cadre d’un module **Architecture JEE & Spring Boot**
* **Encadré par** : Pr. Mohamed Youssfi – ENSET Mohammedia
* **Réalisé par** : TANGARA YOUSSOUF

---

