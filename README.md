# BanqueWeb
Banque Web application using basic JSP, servlets with no frameworks.

## Commandes et processus d'installation/exécution de l'application BanqueWeb :

### A installer/télécharger avant :
 - docker (doit être installé et être lancé pour les prochaines étapes)
 - Serveur Tomcat v10.0

### Lancer la BDD :
	- Dans un terminal, se rendre à la racine du programme (au même niveau que src)
	- Lancer la commande "docker-compose up". La BDD est maintenant créée et installée.
	- Lancer le fichier "CreationTable.java" dans le répertoire: "src/compte/bdd" afin de créer les tables COMPTE et OPERATION, 
		et insérer des valeurs par défaut dans celles-ci.

### Lancer le programme :
	- Exécuter le servlet "SOperations.java" dans le répertoire: "src/compte/servlets" sur le serveur tomcat v10.0 en localhost.
	- Se rendre sur un navigateur web sur la page suivante : "http://localhost:8080/BanqueWeb/GestionOperations".
	
