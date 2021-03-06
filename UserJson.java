package lastfm;
import java.util.*;

import org.json.JSONObject;

public class UserJson {
	private String ID, name, realName, country, gender;
	private int age, playCount, playLists;
	private Date registrationDate;
	private HashMap<TrackJson, ArrayList<String>> hsTracks;
	
	
	public String getUserID() {
		return ID;
	}
	public void setUserID(String ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealname(String realName) {
		this.realName = realName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPlayCount() {
		return playCount;
	}
	public void setPlayCount(int playCount) {
		this.playCount = playCount;
	}
	public int getPlayLists() {
		return playLists;
	}
	public void setPlayLists(int playLists) {
		this.playLists = playLists;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public HashMap<TrackJson, ArrayList<String>> getHsTracks() {
		return hsTracks;
	}
	public void setHsTracks(HashMap<TrackJson, ArrayList<String>> hsTracks) {
		this.hsTracks = hsTracks;
	}
	
	/*public void addTrack(JSONObject track){
		if(this.hsTracks.containsKey(track)){
			ArrayList<String> timeOfP = this.hsTracks.get(track);
			timeOfP.add(track.getTimeofPlay());
			this.hsTracks.put(track, timeOfP);
		}else{
			ArrayList<String> timeOfP = new ArrayList<String>();
			timeOfP.add(track.getTimeofPlay());
			this.hsTracks.put(track, timeOfP);
		}
	}*/
	
	public boolean equals(Object o) {
		if (o instanceof UserOld)
			return this.ID.equals(((UserOld) o).getUserID());
		else return false;
	}
	
	public int hashCode() {
		return this.ID.hashCode();
	}	
}
