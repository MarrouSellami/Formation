
@tag
Feature: Authetification 
  Je veux m athentifier en tand que admin 

  @tag1
  Scenario: Authentification 
    Given ouvrir le navigateur chrome 
    And ouvrir Url 
    When saisir le login 
    And saisir le mot de passe 
    And cliquer sur le bouton login 
    Then la page d acceuil s ouvrir 
    And vérifier le nom de profil 

 
