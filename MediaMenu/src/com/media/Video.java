package com.media;

public class Video extends Media {
	
	private String durata;
	private String risoluzione;

	public Video(int idMedia, String nomeMedia, String pesoMedia, String estensioneMedia, String autoreMedia, String durata, String risoluzione) {
		super(idMedia, nomeMedia, pesoMedia, estensioneMedia, autoreMedia);
		this.durata=durata;
		this.risoluzione=risoluzione;
	}

	@Override
	public void stampaDettagli() {
		  System.out.println("Video [ID: " + getIdMedia() + ", Nome: " + getNomeMedia() + ", Peso: " + getPesoMedia() + ", Estensione: " + getEstensioneMedia()
          + ", Autore: " + getAutoreMedia() + ", Durata: " + durata + ", Risoluzione: " + risoluzione + "]");
}

	}


