
  <h1 align="center">
  <b>Mini-projet Spring - Gestion de devises</b>
  </h1>

<h2><b>🔰 Introduction:  </b></h2><br>
   &nbsp;&nbsp;Ce mini-projet a été réalisé dans le cadre d’un TP pour découvrir le principe d’inversion de contrôle (IOC) et injection des dépendances avec Spring.
L’objectif est de construire une petite application capable de convertir un montant d’une devise à une autre à l’aide de taux de change simulés.  <br>
       &nbsp;&nbsp;- L’accent est mis sur : <br>   
     🔹  L'injection des dépendances (constructeur, setter, Attribut). <br>   
     🔹  L’utilisation de Spring XML et des annotations.    
    <br>
<h2><b>🧱 Architecture du projet: </b></h2>
<h4><b>📁 Package dao : couche d’accès aux taux de change: </b></h4>
   &nbsp;&nbsp;Ce package contient l’interface IDao et sa classe d’implémentation DaoImpl. L’interface IDao définit une méthode getTaux(String from, String to) qui renvoie un taux de conversion entre deux devises. <br>   
🔹La classe DaoImpl implémente cette interface avec des taux codés en dur pour simplifier : <br> 
    - 1 MAD ➝ 0.09 EUR  <br>
    - 1 EUR ➝ 11 MAD  <br>
➝ Cette couche simule le rôle d’une source de données (ex. : une base de données ou une API réelle dans une vraie application).<br>

<h4><b>📁 Package ext : deuxième version DAO </b></h4>
   &nbsp;&nbsp;Ce package contient DaoImpl2, une deuxième version de l’implémentation de l’interface IDao. <br>   
🔹Elle permet de tester l’injection dynamique de différentes versions du DAO. <br> 
🔹Utile pour illustrer la souplesse de Spring, car on peut passer d’un DAO à un autre sans modifier le code métier.<br>

 <h4><b>📁 Package metier : couche métier</b></h4>
   &nbsp;&nbsp;Ce package contient l’interface IMetier et sa classe MetierImpl. <br>   
🔹IMetier définit une méthode convertir(String from, String to, double montant) qui effectue la conversion. <br> 
    &nbsp;&nbsp;MetierImpl implémente cette interface : <br>
    &nbsp;- Elle utilise un DAO injecté pour obtenir le taux de conversion.<br>
    &nbsp;- Puis elle retourne montant * taux. <br>
➝ On y applique l’injection des dépendances de 3 manières différentes :<br>
    &nbsp;1. Par constructeur. <br>
    &nbsp;2. Par setter.<br>
    &nbsp;3. Par champ (@Autowired).<br>



