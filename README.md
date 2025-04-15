
  <h1 align="center">
  <b>Mini-projet Spring - Gestion de devises</b>
  </h1><br>

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
🔹La classe DaoImpl implémente cette interface avec des taux codés pour simplifier : <br> 
    - 1 MAD ➝ 0.09 EUR  <br>
    - 1 EUR ➝ 11 MAD  <br>
➝ Cette couche simule le rôle d’une source de données (ex. : une base de données ou une API réelle dans une vraie application).<br>

<h4><b>📁 Package ext : deuxième version DAO </b></h4>
   &nbsp;&nbsp;Ce package contient DaoImpl2, une deuxième version de l’implémentation de l’interface IDao.<br>   
&nbsp;🔹Elle permet de tester l’injection dynamique de différentes versions du DAO. <br> 
&nbsp;🔹Utile pour illustrer la souplesse de Spring, car on peut passer d’un DAO à un autre sans modifier le code métier.<br>

 <h4><b>📁 Package metier : couche métier</b></h4>
   &nbsp;&nbsp;Ce package contient l’interface IMetier et sa classe MetierImpl. <br>   
🔹IMetier définit une méthode convertir(String from, String to, double montant) qui effectue la conversion. <br> 
    &nbsp;&nbsp;&nbsp;MetierImpl implémente cette interface : <br>
    &nbsp;&nbsp;- Elle utilise un DAO injecté pour obtenir le taux de conversion.<br>
    &nbsp;&nbsp;- Puis elle retourne montant * taux. <br>
➝ On y applique l’injection des dépendances de 3 manières différentes :<br>
    &nbsp;&nbsp;1. Par constructeur: Injection de la dépendance DAO dès la création de l’objet métier. <br>
    &nbsp;&nbsp;2. Par setter: Injection après création via un setter setDao()<br>
    &nbsp;&nbsp;3. Par champ (field): Injection directe via @Autowired<br>
    
<h4><b>📁 Package pres : couche de présentation</b></h4>
   &nbsp;&nbsp;Ce package contient les classes PresSpringAnnotation et PresSpringXML.<br>   
&nbsp;&nbsp;&nbsp;🔹La classe PresSpringAnnotation utilise un contexte d'application Spring basé sur des annotations (AnnotationConfigApplicationContext) qui scanne automatiquement le package 'net.anejjar' pour détecter les composants Spring (@Component, etc.) et configure l'injection automatique des dépendances.<br> 
&nbsp;&nbsp;&nbsp;🔹PresSpringXML repose sur un fichier de configuration config.xml pour déclarer et injecter manuellement les beans Spring. <br>
➝ Ces deux classes permettent de tester le fonctionnement de l’application avec les deux approches : XML et Annotations.<br>
<h2><b>🧪 Résultats attendus: </b></h2>
&nbsp;&nbsp;&nbsp;Lorsque l’on exécute la classe de présentation, le programme affiche le résultat de la conversion, par exemple : <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Résultat : 500 MAD ➝ 45 EUR</b><br>
&nbsp;Cela prouve que :<br>
 &nbsp;&nbsp;- Le DAO fournit bien le taux. <br>
    &nbsp;&nbsp;- La couche métier effectue la conversion.<br>
    &nbsp;&nbsp;- Les injections fonctionnent.<br>
<h2><b>✨ Conclusion: </b></h2>
&nbsp;&nbsp;&nbsp;Ce mini-projet m’a permis de comprendre comment Spring gère les dépendances de manière souple et évolutive.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;J’ai pu :</b><br>
 &nbsp;&nbsp;- Créer une architecture en couches claire. <br>
    &nbsp;&nbsp;- Appliquer différents types d’injection.<br>
    &nbsp;&nbsp;- Utiliser à la fois des fichiers XML et des annotations modernes.<br>
➝ Ce TP m’a donné une bonne base pour construire des projets plus grands avec Spring.<br>  




   



