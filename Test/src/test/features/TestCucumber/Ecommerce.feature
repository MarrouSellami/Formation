@tag
Feature: Création d un compte Ecommerce
  Je veux créer un compte

  @tag2
  Scenario Outline: Création d un compte
    Given Ouvrir Navigateur "https://automationexercise.com/"
    When cliquer sur le bouton Sign up / login
    And Saisir Name "<Name>"
    And saisir Email  "<Email>"
    And cliquer sur le boutton signup
    Then vérifier l affichage du page créer d un compte
    When saiir le title "<Title>"
    And saisir Pass "<Password>"
    And saisir DateD "<DateD>"
    And saisir DateM "<DateM>"
    And saisir DateM "<DateA>"
    And saisir FisrtN "<FirstN>"
    And saisir LastN "<LastN>"
    And saisir Adress "<Adress>"
    And saisir Country "<Country>"
    And saisir State "<State>"
    And saisir  City "<City>"
    And saisir Zipcode "<Zipcode>"
    And saisir Mobile "<Mobile>"
    And cliquer sur le bouton se connecter 
    Then compte crée 

    Examples: 
      | Name   | Email                        |
      | Maroua | SellamiSellami2020@gmail.com |

    Examples: 
      | Title | Password | DateD | DateM | DateA | FirstN | LastN   | Company | Adress | Country | State | City   | Zipcode | Mobile       |
      | Mrs   | Mimi1996 |    30 |     4 |  1996 | Maroua | Sellami | hfjzhd  | tunis  | India   | hdgsj | hfjsbn |    1562 | +21621622215 |
