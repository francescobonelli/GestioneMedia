package com.media;

public class Audio extends Media {
	
	private String sampleResolution;
	private String canaleAudio;
	private String frequenza;
	

	public Audio(int idMedia, String nomeMedia, String pesoMedia, String estensioneMedia, String autoreMedia, String sampleResolution, String canaleAudio, String frequenza) {
		super(idMedia, nomeMedia, pesoMedia, estensioneMedia, autoreMedia);
		this.sampleResolution=sampleResolution;
		this.canaleAudio=canaleAudio;
		this.frequenza=frequenza;
	}

	@Override
	public void stampaDettagli() {
		  System.out.println("Audio [ID: " + getIdMedia() + ", Nome: " + getNomeMedia() + ", Peso: " + getPesoMedia() + ", Estensione: " + getEstensioneMedia()
          + ", Autore: " + getAutoreMedia() + ", Sample Resolution: " + sampleResolution + ", Canale Audio: " + canaleAudio + ", Frequenza:" + frequenza + "]");
}

		
	}


