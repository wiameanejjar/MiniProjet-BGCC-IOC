
  <h1 align="center">
  <b>Mini-projet Spring - Gestion de devises</b>
  </h1>

<h2><b>🔰 Introduction:  </b></h2><br>
   Ce mini-projet a été réalisé dans le cadre d’un TP pour découvrir le principe d’inversion de contrôle (IOC) et injection des dépendances avec Spring.
L’objectif est de construire une petite application capable de convertir un montant d’une devise à une autre à l’aide de taux de change simulés.  <br>
       - L’accent est mis sur :  
     🔹  L'injection des dépendances (constructeur, setter, champ).  
     🔹  L’utilisation de Spring XML et des annotations.  
    <br>
<h2><b>🧱 Architecture du projet: </b></h2><br>
    📁 Package dao : couche d’accès aux taux de change:

Ce package contient l’interface IDao et sa classe d’implémentation DaoImpl. L’interface IDao définit une méthode getTaux(String from, String to) qui renvoie un taux de conversion entre deux devises.  
🔹La classe DaoImpl implémente cette interface avec des taux codés en dur pour simplifier :  
    - 1 MAD ➝ 0.09 EUR  
    - 1 EUR ➝ 11 MAD  
➝ Cette couche simule le rôle d’une source de données (ex. : une base de données ou une API réelle dans une vraie application).


