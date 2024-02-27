
@tag
Feature: Recherche google 
  je veux faire un recherche  sur google 

  @tag1
  Scenario: Recherche sur google 
    Given Ouvrir navigateur chrome
    And ouvrir URL "https://www.google.fr/"
    When saisir le mot rechercher "tunisie"
    And cliquer sur entrer 
    Then vérifier si le texte affiché contient le mot "résultats" 
  