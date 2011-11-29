package lastfm;

import java.util.ArrayList;

import org.json.JSONObject;

public class TrackJson {
	private String ID, name;
	private long duration;
	private int listeners, playCount;
	private JSONObject artist;
	private JSONObject album;
	private String timeofPlay;
	private String tagName;
	
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public String getTimeofPlay() {
		return timeofPlay;
	}
	public void setTimeofPlay(String string) {
		this.timeofPlay = string;
	}
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public int getListeners() {
		return listeners;
	}
	public void setListeners(int listeners) {
		this.listeners = listeners;
	}
	public int getPlayCount() {
		return playCount;
	}
	public void setPlayCount(int playCount) {
		this.playCount = playCount;
	}
	public JSONObject getArtist() {
		return artist;
	}
	public void setArtist(JSONObject artist) {
		this.artist = artist;
	}
	public JSONObject getAlbum() {
		return album;
	}
	public void setAlbum(JSONObject album) {
		this.album = album;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Track)
			return (this.name.toLowerCase().equals(((Track) o).getName().toLowerCase()) );
		else return false;
	}
	
	public int hashCode() {
		return this.name.hashCode();
	}	
}