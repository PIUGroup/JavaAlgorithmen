# JavaAlgorithmen

Lass uns verschiedenste Implementierungen für Algorithmen ansehen, erkunden, vergleichen und austauschen.

Hier darf jeder der möchte Lösungsalgorithmen hinzufügen. 

Da sich das Repo besonders an Anfänger und durchaus auch jüngere Entwickler richtet, wäre es schön wenn 
alle in deutscher Sprache dokumentieren.

## Mitarbeit

1. Zunächst benötigst Du einen Github Account.
1. Du darfst nur Kode zur Verfügung stellen wenn die die Lizenz GNU LGPL in Version 2.1 akzeptierst und Deinen Kode
   bereit bist unter dieser Lizenz zu veröffentlichen. Hintergrund: Quellkode ohne Lizenz ist nicht geschützt. Daher 
   sollte immer eine Lizenz vergeben werden. Es gibt leider Tausende und ich mußte mich für eine entscheiden. Ich fand
   die GNU LGPL ist ok für diese Art von Projekt. 
1. Dann solltest Du einen Fork von diesem Repo erstellen. 
1. Auf Deinem Fork erstellst Du dann einen Branch und arbeitest auf diesem.
1. Nun legst Du unter src/main/java ein neues Package für Deinen Algorithmus an. Es muss beginnen mit: com.github.piug.algorithm. 
   gefolgt von einem Bezeichner für die Algorithmenart (z.B. sort für Sortieralgorithmen), optional noch einen 
   Bezeichner für die Lösungsart (z.B. streaming für Streaming API genutzt) und zum Schluss noch einen Bezeichner
   für Deinen Namen. Idealerweise nutzt Du den Bezeichner Deines Accounts als Deinen Namen. Das ist nun Dein package.
1. Dort stellst Du eine Klasse die den Algorithmus enthält bereit. Auch alle benötigten Hilfsklassen platzierst Du hier. 
1. Deinen Algorithmus dokumentierst Du dann indem Du eine package-info.java in Deinem package anlegst.
1. Weiterhin stellst Du einen Test unter src/test/java bereit, welcher Deinen Algorithmus prüft. Falls Dein
   Test nicht aussagekräftig genug ist wird der Mutationstest einen Fehler melden. Dann musst Du einen besseren
   Test schreiben.  
1. Zum Schluss prüfst Du ob noch alles läuft in dem Du im Projektverzeichnis folgenden Befehl eingibst:
   ./mvnw.sh clean install oder unter Windows ./mvnw.cmd clean install
1. Wenn alles funktioniert, solltest Du Deine Änderungen commiten und in Deinen Fork pushen.
1. Anschließend kannst Du einen Pull Request an das Original Projekt unter PIUG stellen.
1. Dein Pull Request wird dann von jemanden der Schreibrechte besitzt gemerged aber nur wenn sein Build grün ist 
   und keine Konflikte existieren. 

Und nun Viel Spaß beim Ausprobieren. 


