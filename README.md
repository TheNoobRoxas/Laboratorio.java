# Laboratorio
Progetto laboratorio A.
Il progetto prevede la creazione di un sistema di annotazione di emozioni percepite durante l'ascolto di canzoni o brani musicali.
Le emozioni devono essere classificate in base alla scala GEMS, usata in letteratura. 
E' previsto l'indicazione delll’intensità dell’emozione percepita durante l’ascolto del brano musicale su una scala
che va da 1 (per niente) a 5 (molto), per ognuna della scala GEMS.

A partire da un repository di canzoni (da costruire), l’applicazione «Emotional
songs» permette di:

• Creare una o più playlist di brani e annotarli singolarmente con le emozioni
indotte dall’ascolto, secondo una scala standard di 9 stati emozionali

• Mostrare un prospetto riassuntivo sui tag emozionali degli utenti (in forma
aggregata) per ciascun brano della propria playlist

Prima di progettare l'applicazione dovete costruire un file dove memorizzare le
canzoni, che deve contenere almeno i seguenti dati:
• Titolo
• Autore
• Anno

Dati opzionali:

• Album
• Durata
• Genere
ed essere chiamato Canzoni.dati (file .txt o .csv)

L’applicazione permette di:
1. consultare le informazioni del repository di canzoni (accesso libero)
2. registrarsi all'applicazione
3. creare playlists (solo dopo login)
4. inserire le emozioni provate nell’ascoltare ciascuna canzone della playlist (solo
dopo login).

1) Per consultare le informazioni di ogni canzone (non è necessario login o registrazione):
a. funzionalità di ricerca cercaBranoMusicale()
• ricerca per titolo (prende in input una stringa di caratteri e restituisce i brani nel cui nome
compare la stringa di caratteri)
• ricerca per autore e anno (prende in input un autore e un anno e restituisce il nome del/i
brano/i corrispondenti al autore e anno ricercato)
b. funzionalità di selezione e visualizzazione visualizzaEmozioneBrano()
• una volta ricercato il brano, deve essere possibile selezionare il brano e visualizzare tutte
le informazioni relative al brano selezionato.
• deve anche essere possibile visualizzare un prospetto riassuntivo delle emozioni
associate a quel brano o l’indicazione che il brano ricercato non contiene emozioni inserite
dagli utenti. Nel caso di presenza di tag emozionali per quel brano, si potranno
visualizzare le emozioni associate dagli utenti, in forma aggregata, con il numero di utenti
per ciascuna emozione e, ad esempio, la media del punteggio per ciascuna emozione,
oltre agli eventuali commenti lasciati dagli utenti.

2) Per registrarsi all’applicazione, tramite la funzione Registrazione(), l’utente deve
inserire:
o nome e cognome
o codice fiscale
o Indirizzo fisico (via/piazza, numero civico, cap, comune, provincia)
o indirizzo di posta elettronica
o userid
o password per accedere al sistema
I dati della registrazione devono essere salvati in un file denominato
UtentiRegistrati.dati (file .txt o .csv)

3) Per creare la playlist (può crearne più di una), l’utente registrato:
a. deve autenticarsi tramite userid e password fornite al momento della registrazione
b. tramite la funzione RegistraPlaylist() deve inserire:
• Nome della playlist
• Elenco brani della playlist (singoli brani, brani di un autore o singoli album)
I dati di ogni playlist per ciascun utente registrato sono memorizzati in un file dedicato
denominato Playlist.dati (file .txt o .csv)

4) Per inserire eventuali emozioni provate durante l’ascolto, l’utente registrato:
a. deve autenticarsi tramite userid e password fornite al momento della registrazione
b. ricercare e selezionare la canzone ascoltata all’interno della playlist
c. può ora usare la funzione inserisciEmozioniBrano()
(la canzone e le emozioni associate dall’utente sono memorizzate nel file Emozioni.dati)

All’avvio l’applicazione mostra un menu iniziale dove:
Tutti possono:
• cercare brani con titolo, autore, anno
• visualizzare le emozioni associate a ciascuna canzone selezionata
• registrarsi al’applicazione
Gli utenti registrati possono:
• creare playlist
• inserire le emozioni provate all’ascolto di determinate canzoni

File e strutture dati:
▪ Canzoni
▪ UtentiRegistrati
▪ Playlist
▪ Emozioni
• Cosa e come memorizzare su file
(formato testuale vs. serializzazione oggetti)
• Interfaccia utente
(terminale vs. interfaccia grafica)
N.B. Non è necessario preoccuparsi di accesso concorrente ai dati e di
architetture distribuite client/server

1. Sviluppo della Soluzione Software
2. Documentazione di Progetto (2 documenti distinti)*
• Manuale Utente
• Manuale Tecnico

1. Il progetto deve essere sviluppato in linguaggio Java (versione 8 o
successive) e deve essere multipiattaforma
2. Il codice deve essere opportunamente commentato in formato javadoc
3. Il package emotionalsongs deve essere definito e deve contenere le
relative classi (ulteriori package sono ammessi)
4. Il main per l’esecuzione dell’applicazione deve essere contenuto nella
classe di nome EmotionalSongs del package emotionalsongs
5. L’intestazione di tutte i file *.java devono contenere nome, cognome,
num. matricola, sede (VA o CO) degli autori del progetto

1. Il progetto deve essere consegnato in formato compresso denominato
cognome_matricola del project manager del team
2. La cartella compressa dovrà contenere:
• un file dal nome autori.txt contenente cognome, nome, numero di matricola e sede
(Va o CO) di ogni membro del team
• la directory doc contenente il manuale utente e il manuale tecnico in formato .pdf
• la directory src contenente il codice sorgente del progetto
• la directory bin contenente il codice eseguibile del progetto
• la directory data contenente i file dati
3. La consegna viene fatta tramite invio cartella compressa all’indirizzo
s******.c*****@uninsubria.it con oggetto email: Progetto Lab A
4. Responsabile della consegna sarà il project manager tramite email
istituzionale di ateneo
5. Le date di consegna verranno comunicate di volta in volta



