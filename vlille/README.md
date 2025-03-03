# Auteur: Yousra CHBIB, GR 04  

# Introduction :  
* Dans ce TP de poo, nous allons se concentrer sur l'organisation des classes en paquetages, et l'utilisation des tests unitaire. L'objectif de ce TP est de reussir tous les tests et s'assurer qu'il n y a pas d'erreur.  

Q1: j'ai recuperer dans le portail les fichiers necéssaire, et je les ai placer dans un dossier tp4 dans mon depot poo.

# PAQUETAGE: 
- Q02:pour définir la classe BikeModel comme appartenant au paquetage vlille.util, il faut modifier le code de la classe BikeModel en ajoutant la ligne suivant: **package vlille.util;**  

- Q03: la compilation se fait donc avec la commande suivante :  **javac -sourcepath src src/vlille/util/BikeModel.java -d classes**  
- Q04: pour définir la classe *Bike* comme appartenant au package vlille : **package vlille;**
- Q05: la compilation se fait alors avec la commande suivante: **javac -sourcepath src src/vlille/Bike.java -d classes**  
- Q06: lors de la compilation de la classe Bike , j'ai remarquer des erreurs, cela est dû  au fait que * les deux classes ne sont pas dans le meme package *, pour cela j'ai rajouter la ligne suivante dans le code de la classe Bike pour importer la classe BikeModel dans la classe Bike sans changer leur emplacement : **import vlille.util.BikeModel;**  
- Q07.1: idem, BikeMain appartenant au package vlille : **package vlille;**  
- Q07.2: j'ai compiler la classe BikeMain avec : **javac -sourcepath src src/vlille/BikeMain.java -d classes**  
- Q07.3: - dans l'execution de la classe BikeMain, il faut tenir compte du nom complet de la classe.  
   - l'execution de la classe BikeMain se fait à l'aide de la commande suivante: **java -classpath classes vlille.BikeMain** , et donne commme résultat : in bike id: biclou, model : ELECTRIC  
   - la génération de la documentation d'un package et de ses sous-packages se fait à l'aide de la commande suivante: **javadoc -sourcepath src -subpackages vlille -d docs**  
         
- Q08: j'ai rajouter la ligne : **package vlille;** dans les deux fichiers, puis je les ai compiler sans erreur.  

