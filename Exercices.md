Commande clean : Cette commande supprime le dossier target/ et tout son contenu généré par les compilations précédentes ou les tests.

Commande test : Maven exécute les phases suivantes du default lifecycle jusqu’à test :
1.	validate – vérifie que le projet est correct et que toutes les informations nécessaires sont disponibles.
2.	compile – compile le code source situé dans src/main/java.
3.	test-compile – compile les tests situés dans src/test/java.
4.	test – exécute les tests unitaires.

Le fichier target contient :
•	target/classes/
•	target/generated-sources/
•	target/generated-test-sources/
•	target/maven-status/
•	target/surefire-reports/
•	target/test-classes/

Commande package : Maven exécute les phases suivantes du default lifecycle jusqu’à test :
1.	validate – vérifie que le projet est correct et que toutes les informations nécessaires sont disponibles.
2.	compile – compile le code source situé dans src/main/java.
3.	test-compile – compile les tests situés dans src/test/java.
4.	test – exécute les tests unitaires.
5.	package – empaquette le projet dans un fichier JAR (selon le packaging défini dans le pom.xml).

Le fichier target contient en plus :
•	bank-application-1.0-SNAPSHOT.jar


Hypothèse sur Verify :
Le cycle verify vient tester directement le projet sous format .jar.

Exercice 8
Test "HappyPath" dans BankAccountTest ligne 50


Exercice 9
La couverture de BankAcccount est de 31% et les fonctions :
- getInitMoneyAmount()
- loadFromText(String)
ne sont pas courverte du tout. 

Après test de la première fonction, j'obtiens une courverture de 32% de la classe BankAccount avec une couverture de 100% de la fontion getInitMoneyAmount().

Exercice 10 : Voir GitHub action 
