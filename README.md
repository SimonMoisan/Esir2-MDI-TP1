# Compte rendu de TP 1 MDI PATTERN

## Auteurs: 
### MOISAN Simon
### GEGOUT Adrien

## But de ce TP

Le but de ce TP était de revisiter l'exercice 4 du du TP sur les design patterns.
Plus précisement sur l'implémentation des __Observers__ en Java.

## Etapes de réalisation

### Interface et classe abstraite

Dans un premier temps, nous avons construit la classe abstraite __Subject__ (classe qui est observée) et nous avons implémenté ses méthodes __attach()__ et __detach()__ et laissé la méthode __notifyObserver()__ abstraite.

Nous avons ensuite créé l'interface __Observer__ avec une seule méthode, __update()__.

Ensuite, nous avons modifié la classe __MailBox__ existante pour qu'elle extends la classe abstraite __Subject__.

### MailBox

Les méthodes de MailBox étant déjà créées et valides, nous avons juste implémenté la méthode __notifyObserver()__, qui envoit à tous les observers de la liste une référence de MailBox via la méthode __update()__ des observers.

Puis, pour compléter __MailBox__ nous avons fait en sorte qu'à chaque rajout d'un mail, un appel vers __notifyObserver()__ soit fait.

### CounterObserver

Ensuite, nous avons créé la classe __CounterObserver__, qui implémente l'interface __Observer__, et qui a pour but de compter le nombre de mail présent dans une boîte mail.
Cette classe, qui étend JLabel, change donc juste le texte de son label à chaque fois que sa méthode __update()__ est appelée.

La classe __MailBoxObserver__ du même genre que __CounterObserver__, a pour but d'afficher le sujet du dernier mail reçu.

### Modification du Main

Nos classes créées, il ne restait qu'à les utiliser dans le __Main__ fournit préalablement.
Nous créons les objets CounterObserver et MailBoxObserver, puis on les attache à la MailBox via la méthode __attach()__ de MailBox.

A chaque rajout d'un mail dans la MailBox, les observers sont notifiés et change leur affichage dynamiquement.

## Difficultés

Nous n'avons pas rencontré de difficultés particulière pour ce TP. Nous avons pris juste un peu de temps pour comprendre comment utiliser les objets observers dans la classe Main, mais principalement à cause du fonctionnement de Java.swing.

## Ce que nous avons appris

Dans ce TP, nous avons expérimenté avec le pattern d'observateurs. Ce type de pattern nous a permis d'apprendre à créer des moyens de surveiller un objet ( de plusieurs façons différentes ) avec des objets "externes". Ce qui permet de ne pas surcharger la classe à surveiller de pleins de méthodes, et qui permet d'organiser proprement les différentes façon de surveiller. Ce qui "déresponsabilise" l'objet observé.
