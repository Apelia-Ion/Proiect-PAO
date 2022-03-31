# Proiect PAO

**Tema aleasa: Biblioteca (sectiuni, carti, autori, cititori)**

Tema aleasa: Biblioteca (sectiuni, carti, autori, cititori)

Actiuni/Interogari:
1.	Creare cont abonat
2.	Suspendare/inchidere cont abonat
3.	Adaugare carte
4.	Adaugare autor
5.	Adaugare sectiune
6.	Vizualizare carti dintr-o anumita sectiune
7.	Vizualizare carti (ce apartin unui autor)
8.	Vizualizare cititori (abonati)
9.	Imprumut
10.	Rezervare
11.	Returnare
12.	Vizualizare istoric imprumuturi ale unui abonat

 Obiecte:
1.	Biblioteca (singleton)
2.	Autor
3.	Adresa
4.	Persoana
5.	Cont
a.	Abonat
b.	Administrator
6.	Sectiune
7.	Carte
a.	Exemplar
8.	Catalog (pentru vizaulizari carti)

 Servicii
a.	 Imprumut
b.	 Returnare
c.	 Rezervare
d.	 Vizualizari (dupa sectiune, autor, vizualizare abonati, imprumuturi abonat)

 



Cerinte proiect:

Fiecare student va lucra la un proiect individual. Proiectul este structurat în mai multe etape. Condiția de punctare a proiectelor:
• să nu prezinte erori de compilare
• să se implementeze cerințele date

Termene de predare:
• Etapa I: 29 martie 2022
• Etapa II: 3 mai 2022
• Etapa III: 31 mai 2022

Etapa I
1) Definirea sistemului
Să se creeze o lista pe baza temei alese cu cel puțin 10 acțiuni/interogări care se pot face în cadrul sistemului și o lista cu cel puțin 8 tipuri de obiecte.
2) Implementare
Sa se implementeze în limbajul Java o aplicație pe baza celor definite la primul punct.
Aplicația va conține:
• clase simple cu atribute private / protected și metode de acces
• cel puțin 2 colecții diferite capabile să gestioneze obiectele definite anterior (eg: List, Set, Map, etc.) dintre care cel puțin una sa fie sortata – se vor folosi array-uri uni-
/bidimensionale în cazul în care nu se parcurg colectiile pana la data checkpoint-ului.
• utilizare moștenire pentru crearea de clase adiționale și utilizarea lor încadrul colecțiilor;
• cel puțin o clasă serviciu care sa expună operațiile sistemului
• o clasa Main din care sunt făcute apeluri către servicii

Etapa II
1) Extindeți proiectul din prima etapa prin realizarea persistentei utilizând fișiere:
• Se vor realiza fișiere de tip CSV pentru cel puțin 4 dintre clasele definite în prima etapa. Fiecare coloana din fișier este separata de virgula. Exemplu:nume,prenume,varsta
• Se vor realiza servicii singleton generice pentru scrierea și citirea din fișiere;
• La pornirea programului se vor încărca datele din fișiere utilizând serviciile create;
2) Realizarea unui serviciu de audit
Se va realiza un serviciu care sa scrie într-un fișier de tip CSV de fiecare data când este executată una dintre acțiunile descrise în prima etapa. Structura fișierului: nume_actiune, timestamp

Etapa III
Înlocuiți serviciile realizate în etapa a II-a cu servicii care sa asigure persistenta utilizând baza de date folosind JDBC.
Să se realizeze servicii care sa expună operații de tip create, read, update si delete pentru cel puțin 4 dintre clasele definite.

Barem Etapa 1:
![image](https://user-images.githubusercontent.com/79162778/160544021-b751fdcb-b6d1-40e4-9a08-4f0d494a13e2.png)

