package org.sunir;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@SuppressWarnings("serial")
@Document(collection="songs")
public class Song implements Serializable {
	
	@Id 
	private ObjectId databaseId;
	
	@Field("id")
	private int id;
	@Field("song")
	private String song;
	@Field("artist")
	private String artist;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public ObjectId getDatabaseId() {
		return databaseId;
	}
	public void setDatabaseId(ObjectId databaseId) {
		this.databaseId = databaseId;
	}
	

}
