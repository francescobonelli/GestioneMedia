package com.media;

public abstract class Media {

	private int idMedia;
	private String nomeMedia;
	private String pesoMedia;
	private String estensioneMedia;
	private String autoreMedia;
	
	public Media(int idMedia, String nomeMedia, String pesoMedia, String estensioneMedia, String autoreMedia) {
		this.idMedia=idMedia;
		this.nomeMedia=nomeMedia;
		this.pesoMedia=pesoMedia;
		this.estensioneMedia=estensioneMedia;
		this.autoreMedia=autoreMedia;
	}

	public int getIdMedia() {
		return idMedia;
	}

	public void setIdMedia(int idMedia) {
		this.idMedia = idMedia;
	}

	public String getNomeMedia() {
		return nomeMedia;
	}

	public void setNomeMedia(String nomeMedia) {
		this.nomeMedia = nomeMedia;
	}

	public String getPesoMedia() {
		return pesoMedia;
	}

	public void setPesoMedia(String pesoMedia) {
		this.pesoMedia = pesoMedia;
	}

	public String getEstensioneMedia() {
		return estensioneMedia;
	}

	public void setEstensioneMedia(String estensioneMedia) {
		this.estensioneMedia = estensioneMedia;
	}

	public String getAutoreMedia() {
		return autoreMedia;
	}

	public void setAutoreMedia(String autoreMedia) {
		this.autoreMedia = autoreMedia;
	}
	
	public abstract void stampaDettagli();
}
