package de.eshop.userserviceAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Role {

	private int id;
	private String typ;
	private int level;

	public Role() {
	}

	public Role(String typ, int level) {
		this.typ = typ;
		this.level = level;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTyp() {
		return this.typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
//    @Override
//    public String toString() {
//        return "Value{" +
//                "id=" + id +
//                ", quote='" + quote + '\'' +
//                '}';
//    }
}
