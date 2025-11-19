# Rapport Maven et Exercices

## Commandes Maven

### Commande `clean`
Cette commande supprime le dossier `target/` et tout son contenu généré par les compilations précédentes ou les tests.

### Commande `test`
Maven exécute les phases suivantes du **default lifecycle** jusqu’à `test` :

1. `validate` – vérifie que le projet est correct et que toutes les informations nécessaires sont disponibles.
2. `compile` – compile le code source situé dans `src/main/java`.
3. `test-compile` – compile les tests situés dans `src/test/java`.
4. `test` – exécute les tests unitaires.

Le dossier `target/` contient alors :

- `target/classes/`
- `target/generated-sources/`
- `target/generated-test-sources/`
- `target/maven-status/`
- `target/surefire-reports/`
- `target/test-classes/`

### Commande `package`
Maven exécute les phases suivantes du **default lifecycle** jusqu’à `package` :

1. `validate` – vérifie que le projet est correct et que toutes les informations nécessaires sont disponibles.
2. `compile` – compile le code source situé dans `src/main/java`.
3. `test-compile` – compile les tests situés dans `src/test/java`.
4. `test` – exécute les tests unitaires.
5. `package` – empaquette le projet dans un fichier JAR (selon le packaging défini dans le `pom.xml`).

Le dossier `target/` contient en plus :

- `bank-application-1.0-SNAPSHOT.jar`

### Hypothèse sur `verify`
La phase `verify` sert à **tester le projet sous format JAR**, en exécutant toutes les vérifications de qualité, tests et validations définies après `package` dans le lifecycle Maven.

---

## Exercice 8
- Tests dans `BankAccountTest` ligne 50.

---

## Exercice 9
- La couverture de la classe `BankAccount` est de **31%**.
- Les fonctions suivantes ne sont pas couvertes du tout :
    - `getInitMoneyAmount()`
    - `loadFromText(String)`

- Après avoir écrit un test pour `getInitMoneyAmount()`, la couverture de la classe `BankAccount` passe à **32%**, et la fonction `getInitMoneyAmount()` est maintenant **100% couverte**.

---

## Exercice 10
- Voir le workflow GitHub Actions