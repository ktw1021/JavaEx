package com.javaex.oop.song.v1;

public class Song {
	String title;
	String artist;
	String album;
	String composer;
	int year;
	int track;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist=artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album=album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer=composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track=track;
	}
	
	public void showInfo(String artist, String title, String album, 
			int year, int track, String composer) {
		System.out.printf("%s, %s( %s, %d, %d번 track, %s 작곡 )%n",
				artist,title,album,year,track,composer);
		return;
	}
	
	
}
