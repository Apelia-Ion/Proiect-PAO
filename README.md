# Proiect PAO

**Tema aleasa: Biblioteca (sectiuni, carti, autori, cititori)**

&emsp; **Actiuni/Interogari:**  
	1. Creare abonament (cititor)  
	2. Adugare carte  
	3. Adaugare autor  
	4. Adaugare sectiune  
	5. Imprumut  
	6. Returnare  
	7. Adaugare sectiune  
	8. Vizualizare carti dintr-o anumita sectiune  
	9. Vizualizare carti (ce apartin unui autor)  
	10. Vizualizare cititori (abonati)  

&emsp;**Obiecte:**    
	1. Utilizator  
		&emsp; a. Abonat  
		&emsp; b. Administrator/i  
	2. Carte  
	3. Sectiune  
		&emsp;a. Beletristica  
		&emsp;b. Pentru copii  
		&emsp;c. Dezvoltare personala  
		&emsp;d. Manuale  
		&emsp;e. De specialitate  
	4. Autor  
	5. Abonament  

&emsp;**Servicii**   
		&emsp;a. Imprumut  
		&emsp;b. Returnare   
		&emsp;c. Cerere  
		&emsp;d. Vizualizare  
		&emsp;e. Main  



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

