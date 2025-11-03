Question 1 : 

stockInitial / int / Contient le nombre de produits disponibles au départ et évolue selon les ventes et réceptions. / Saisie par l’utilisateur. 

seuilAlerte / int / Niveau de stock minimum à partir duquel une alerte doit s’afficher. / Saisie par l’utilisateur.

simulation / int / Nombre de jours pendant lesquels on veut simuler l’évolution du stock. / Saisie par l’utilisateur.

jour / int / Compteur du jour actuel dans la boucle de simulation. / Gérée par le programme.

reception / int / Quantité de produits reçus dans la journée. / Saisie par l’utilisateur.

vente / int / Quantité de produits vendus dans la journée. / Saisie par l’utilisateur. 	


question 2 :

Le programme utilise une boucle for pour répéter les actions de simulation sur plusieurs jours.
Elle permet d’exécuter automatiquement les mêmes instructions (réception, vente, calcul du stock et vérification du seuil) pour chaque jour de simulation.
Ce type de boucle est adapté car le nombre de répétitions est connu à l’avance : il correspond au nombre de jours saisi par l’utilisateur.


Cette condition sert à vérifier si le stock est inférieur au seuil d’alerte.
Lorsque cette situation se produit, un message d’alerte est affiché afin de signaler que le stock devient faible.
Une structure conditionnelle est adaptée ici, car elle permet de déclencher une action uniquement quand une certaine situation est vraie.


Cette condition permet de détecter si le stock devient négatif.
Dans ce cas, un message d’erreur s’affiche et la simulation est interrompue à l’aide du mot-clé break.
Cette structure conditionnelle est pertinente, car elle empêche le programme de continuer en cas d’erreur logique (stock impossible).

question 3 :

Début

Afficher "Entrez le stock initial : "
Lire stockInitial

Afficher "Entrez le seuil d’alerte : "
Lire seuilAlerte

Afficher "Entrez le nombre de jours à simuler : "
Lire simulation

Pour jour allant de 1 à simulation faire
    Afficher " x Jour " + jour
    Afficher "Entrez le nombre de produits reçus : "
    Lire reception
    stockInitial ← stockInitial + reception

    Afficher "Entrez le nombre de ventes : "
    Lire vente
    stockInitial ← stockInitial - vente

    Afficher "Le stock actuel est de : " + stockInitial

    Si stockInitial < seuilAlerte et stockInitial ≥ 0 alors
        Afficher "Alerte : le stock est en dessous du seuil d’alerte !"
    Fin Si

    Si stockInitial < 0 alors
        Afficher "Erreur : le stock est négatif. Simulation arrêtée."
        Sortir de la boucle
    Fin Si la simulation a atteint x jours
