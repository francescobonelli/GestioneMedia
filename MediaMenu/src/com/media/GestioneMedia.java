package com.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestioneMedia {
    private static List<Media> mediaList = new ArrayList<>();
    private static int idCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("\n Gestione Media ");
            System.out.println("1. Aggiungi un nuovo media");
            System.out.println("2. Visualizza elenco dei media");
            System.out.println("3. Esci");
            System.out.print("Scegli un'opzione: ");
            try {
                scelta = Integer.parseInt(scanner.nextLine());

                switch (scelta) {
                    case 1:
                        aggiungiMedia(scanner);
                        break;
                    case 2:
                        visualizzaMedia();
                        break;
                    case 3:
                        System.out.println("Uscita dal programma");
                        break;
                    default:
                        System.out.println("Opzione non valida. Riprova.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input non valido. Inserisci un numero.");
                scelta = 0;
            }
        } while (scelta != 3);

        scanner.close();
    }

    
    private static void aggiungiMedia(Scanner scanner) {
        System.out.println("\n--- Aggiungi Media ---");
        System.out.println("1. Video");
        System.out.println("2. Foto");
        System.out.println("3. Audio");
        System.out.print("Scegli il tipo di media: ");
        int tipoMedia;
        try {
            tipoMedia = Integer.parseInt(scanner.nextLine());
            switch (tipoMedia) {
                case 1:
                    aggiungiVideo(scanner);
                    break;
                case 2:
                    aggiungiFoto(scanner);
                    break;
                case 3:
                    aggiungiAudio(scanner);
                    break;
                default:
                    System.out.println("Tipo di media non valido.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input non valido. Inserisci un numero.");
        }
    }

    
    private static void aggiungiVideo(Scanner scanner) {
        System.out.print("Nome Video: ");
        String nome = scanner.nextLine();
        System.out.print("Peso Video: ");
        String peso = scanner.nextLine();
        System.out.print("Estensione Video: ");
        String estensione = scanner.nextLine();
        System.out.print("Autore Video: ");
        String autore = scanner.nextLine();
        System.out.print("Durata Video: ");
        String durata = scanner.nextLine();
        System.out.print("Risoluzione Video: ");
        String risoluzione = scanner.nextLine();

        mediaList.add(new Video(idCounter++, nome, peso, estensione, autore, durata, risoluzione));
        System.out.println("Video aggiunto con successo!");
    }

   
    private static void aggiungiFoto(Scanner scanner) {
        System.out.print("Nome Foto: ");
        String nome = scanner.nextLine();
        System.out.print("Peso Foto: ");
        String peso = scanner.nextLine();
        System.out.print("Estensione Foto: ");
        String estensione = scanner.nextLine();
        System.out.print("Autore Foto: ");
        String autore = scanner.nextLine();
        System.out.print("Risoluzione Foto: ");
        String risoluzione = scanner.nextLine();
        System.out.print("ISO Foto: ");
        String iso = scanner.nextLine();
        System.out.print("Lunghezza Focale: ");
        String lunghezzaFocale = scanner.nextLine();

        mediaList.add(new Foto(idCounter++, nome, peso, estensione, autore, risoluzione, iso, lunghezzaFocale));
        System.out.println("Foto aggiunta con successo!");
    }

  
    private static void aggiungiAudio(Scanner scanner) {
        System.out.print("Nome Audio: ");
        String nome = scanner.nextLine();
        System.out.print("Peso Audio: ");
        String peso = scanner.nextLine();
        System.out.print("Estensione Audio: ");
        String estensione = scanner.nextLine();
        System.out.print("Autore Audio: ");
        String autore = scanner.nextLine();
        System.out.print("Sample Resolution: ");
        String sampleResolution = scanner.nextLine();
        System.out.print("Canale Audio: ");
        String canaleAudio = scanner.nextLine();
        System.out.print("Frequenza: ");
        String frequenza = scanner.nextLine();

        mediaList.add(new Audio(idCounter++, nome, peso, estensione, autore, sampleResolution, canaleAudio, frequenza));
        System.out.println("Audio aggiunto con successo!");
    }

    private static void visualizzaMedia() {
        if (mediaList.isEmpty()) {
            System.out.println("Nessun media presente.");
        } else {
            System.out.println("\n Elenco Media ");
            for (Media media : mediaList) {
                media.stampaDettagli();
            }
        }
    }
}

