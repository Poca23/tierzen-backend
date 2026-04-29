# 🪪 TierZen — Backend

> API REST Spring Boot pour la carte tiers payant digitale **TierZen** — _"Le tiers payant, sans stress"_

---

## 🎯 Concept

TierZen est une **carte tiers payant digitale** fictive, inspirée des services proposés par les mutuelles de santé.  
Ce dépôt contient le **backend** : une API REST construite avec Spring Boot, exposant les données d'un adhérent fictif.

---

## 🏗️ Stack technique

| Élément         | Valeur            |
| --------------- | ----------------- |
| Langage         | Java 21           |
| Framework       | Spring Boot 4.0.6 |
| Base de données | H2 en mémoire     |
| ORM             | Spring Data JPA   |
| Build           | Maven             |

---

## 📁 Structure du projet

```
tierzen-backend/
├── src/
│   └── main/
│       ├── java/
│       │   └── ...
│       │       ├── controller/   # Couche REST — AdherentController
│       │       ├── service/      # Couche métier — AdherentService
│       │       ├── repository/   # Couche données — AdherentRepository (JPA)
│       │       ├── entity/       # Entité JPA — Adherent
│       │       └── dto/          # DTO — AdherentDTO
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
```

---

## 🚀 Lancer le projet en local

```bash
./mvnw spring-boot:run
```

> L'API est accessible sur `http://localhost:8080`

---

## 📡 Endpoint principal

```
GET /api/adherent/{id}
```

Retourne les informations de l'adhérent fictif.

**Exemple de réponse :**

```json
{
  "id": 1,
  "nom": "Naudin",
  "prenom": "Claire",
  "numeroAdherent": "HM-2026-00142",
  "mutuelle": "TierZen",
  "dateValidite": "2026-12-31"
}
```

---

## 🌐 Déploiement

```
Backend  →  VPS Scaleway · Spring Boot · port 8080 · ✅ En ligne
URL      →  https://tierzen.webisyours.com/api/adherent/1
HTTPS    →  🔒 Let's Encrypt — valide (TLS 1.3)
```

---

## 📐 Architecture en couches

```
Controller  →  reçoit la requête HTTP
Service     →  applique la logique métier
Repository  →  interroge la base H2 via JPA
Entity      →  représente la table en base
DTO         →  expose uniquement les données nécessaires
```

> **JPA ↔ SQL** : `@Entity` = table · `findById()` = `SELECT * WHERE id = ?`

---

## 💡 Choix techniques

| Choix             | Justification                                             |
| ----------------- | --------------------------------------------------------- |
| H2                | Base en mémoire — zéro configuration, idéale pour la démo |
| DTO               | Séparation entité / données exposées — maintenabilité     |
| CommandLineRunner | Données fictives chargées au démarrage automatiquement    |
| `orElseThrow`     | Gestion des erreurs HTTP 404 propre et explicite          |

---

## 📐 Principes de développement

- ✅ **Scalable** — architecture en couches, séparation des responsabilités
- ✅ **Maintenable** — DTOs, code commenté
- ✅ **Léger** — H2 en mémoire, pas de dépendances inutiles
- ✅ **Sécurisé** — validation des entrées, gestion des erreurs HTTP
- ✅ **Bonnes pratiques Git** — commits conventionnels, branches, README

---

## 🔗 Projet complet

| Dépôt          | Lien                                       |
| -------------- | ------------------------------------------ |
| 🖥️ Frontend    | https://github.com/Poca23/tierzen-frontend |
| 🌐 Application | https://tierzen.webisyours.com             |
