package com.media;

public class Foto extends Media {

	private String iso;
	private String risoluzione;
	private String lunghezzaFocale;
	public Foto(int idMedia, String nomeMedia, String pesoMedia, String estensioneMedia, String autoreMedia, String iso, String risoluzione, String lunghezzaFocale) {
		super(idMedia, nomeMedia, pesoMedia, estensioneMedia, autoreMedia);
		this.iso=iso;
		this.risoluzione=risoluzione;
		this.lunghezzaFocale=lunghezzaFocale;
	}

	@Override
	public void stampaDettagli() {
		  System.out.println("Foto [ID: " + getIdMedia() + ", Nome: " + getNomeMedia() + ", Peso: " + getPesoMedia() + ", Estensione: " + getEstensioneMedia()
          + ", Autore: " + getAutoreMedia() + ", ISO: " + iso + ", Risoluzione: " + risoluzione + ", Lunghezza Focale:"+ lunghezzaFocale + "]");
}

		
	}


