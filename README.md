# evaluation-system
Système d'évaluation

## Description
L'application permet de soumettre des evaluations (note sur 10) pour des critères, voir la moyenne des evaluations et aussi voir en detail les evaluations précédentes
Si le critere d'evaluation n'existe pas, on peut le creer.

##Application web
L'application web accéssible sur l'adresse http://localhost:8080/accueil  demarre sur une page d'acceuil. 
A partir de cette page, on peut voir la liste des criteres et en creer un. 
En choisissant de creer un critere, on remplit un formulaire, qui une fois complet et soumis, renvoie à la liste des criteres. 
En choisissant la liste des criteres, on est redirige vers cette derniere.De la liste des criteres, on peut voir les criteres deja créés et leurs notes d'evaluation moyennes.
De la, on peut aussi voir l'historique des evaluations précédentes d'un critère, avec le nom de l'évaluateur et la date d'evaluation
On peut aussi, soumettre une evaluation sur un critere. 
    
## API
Les fonctions de l'API sont les suivantes:

### Création d'un critère
On envoie le corps du critère sous la forme ci-dessus dans une requête post à localhost:8080/api/critere/.
{
		"designation": "Cohérence",
}

### Liste des critère
On envoie une requête GET à localhost:8080/api/critere/.

### Trouver un critère
On envoie une requête GET à localhost:8080/api/critere/{id} id étant celui du critère.

### Modifier un critère
On envoie une requête PUT à localhost:8080/api/critere/{id} id étant celui du critère. La requête doît contenir  le nouveau corps du critère.
{
		"designation": "Ambiguité",
}

### Supprimmer un critère
On envoie une requête DELETE à localhost:8080/api/critere/{id} id étant celui du critère.

### Création d'une évaluation
On envoie le corps de l'évaluation sous la forme ci-dessus dans une requête post à localhost:8080/api/evaluation. La requête doît contenir comme paramètre sous le nom critere_id l'id du critère concerné.
{
	"note": 7,
	"utilisateur": "KABORE Alex"
}

### Liste des critère
On envoie une requête GET à localhost:8080/api/evaluation.

### Trouver une évaluation critère
On envoie une requête GET à localhost:8080/api/critere/{id} id étant celui du critère.

### Modifier une évaluation
On envoie une requête PUT à localhost:8080/api/evaluation/{id} id étant celui de l'évaluation. La requête doît contenir  le nouveau corps de l'évaluation.
{
	"note": 5,
	"utilisateur": "KABORE Alexandre"
}

### Supprimmer une évaluation
On envoie une requête DELETE à localhost:8080/api/critere/{id} id étant celui de l'évaluation.
   
