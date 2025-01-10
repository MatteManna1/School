 <script>
        // Definizione della classe Canzone con metodo print
        class Canzone {
            constructor(titolo, autore) {
                this.titolo = titolo;
                this.autore = autore;
            }

            // Metodo per restituire una stringa formattata con titolo e autore
            print() {
                return `${this.titolo} - ${this.autore}`;
            }
        }

        // Creazione dell'array di canzoni
        const canzoni = [
            new Canzone("Bohemian Rhapsody", "Queen"),
            new Canzone("Imagine", "John Lennon"),
            new Canzone("Hotel California", "Eagles")
        ];
