@CreationCompte
Feature: Création un compte facebook
  Je veux créer un compte facebook

  @inscri
  Scenario Outline: Création un compte facebook
    Given Ouvrir URL "https://www.facebook.com/?locale=fr_FR"
    When cliquer sur le bouton creér un compte
    And saisir le prénom "<Prénom>"
    And saisir le nom "<Nom>"
    And saisir Email "<Email>"
    And confirmer Email "<Email>"
    And saisir le mot de passe "<mot de passe>"
    And choisir le Jour "<Jour>"
    And choisir le mois "<Mois>"
    And choisir l année "<Annee>"
    And choisir le Genre "<Genre>"
    And cliquer sur le bouton s inscrire
   

    Examples: 
      | Prénom  | Nom     | Email               | mot de passe | Jour | Mois | Annee | Genre |
      | Maroua  | Sellami | Sellami@gmail.com   | Mimi96       |   30 |    4 |  1996 | Femme |
      | Marouen | Sellami | Sellami96@gmail.com | Mimi96       |   30 |    4 |  1996 | Homme |
