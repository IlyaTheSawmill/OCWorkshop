package org.lokova.ocw;

import java.awt.Color;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private static Map<Integer, Person> map;

	public static Map<Integer, Person> getMap() {
		return Collections.unmodifiableMap(map);
	}

	private int uid;
	private String fullName;
	private String name;
	private Set<String> nicknames;
	private Sex sex;
	private LocalDate dob;
	private int height;
	private int weight;
	private Color hairColor;
	private Color eyeColor;
	private int polarity;
	private Mbti mbti;
	private Alignment alignment;
	private Set<String> tags;
	private String description;
	private Person partner;

	public Alignment getAlignment() {
		return alignment;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getDob() {
		return dob;
	}

	public Color getEyeColor() {
		return eyeColor;
	}

	public String getFullName() {
		return fullName;
	}

	public Color getHairColor() {
		return hairColor;
	}

	public int getHeight() {
		return height;
	}

	public Mbti getMbti() {
		return mbti;
	}

	public String getName() {
		return name;
	}

	public Set<String> getNicknames() {
		return nicknames;
	}

	public Person getPartner() {
		return partner;
	}

	public int getPolarity() {
		return polarity;
	}

	public Sex getSex() {
		return sex;
	}

	public Set<String> getTags() {
		return Collections.unmodifiableSet(tags);
	}

	public int getUid() {
		return uid;
	}

	public int getWeight() {
		return weight;
	}

	public void setAlignment(Alignment alignment) {
		Objects.requireNonNull(alignment);
		this.alignment = alignment;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDob(LocalDate dob) {
		Objects.requireNonNull(dob);
		this.dob = dob;
	}

	public void setEyeColor(Color eyeColor) {
		Objects.requireNonNull(eyeColor);
		this.eyeColor = eyeColor;
	}

	public void setFullName(String fullName) {
		Objects.requireNonNull(fullName);
		this.fullName = fullName;
	}

	public void setHairColor(Color hairColor) {
		Objects.requireNonNull(hairColor);
		this.hairColor = hairColor;
	}

	public void setHeight(int height) {
		if ((height < 1400) || (height > 2000)) {
			throw new IllegalArgumentException("Height must be between 1400 and 2000 millimeters");
		}
		this.height = height;
	}

	public void setMbti(Mbti mbti) {
		Objects.requireNonNull(mbti);
		this.mbti = mbti;
	}

	public void setName(String name) {
		Objects.requireNonNull(name);
		this.name = name;
	}

	protected void setPartner(Person partner) {
		this.partner = partner;
	}

	public void setPolarity(int polarity) {
		if ((polarity < 0) || (polarity > 100)) {
			throw new IllegalArgumentException("Polarity must be between 0 and 100");
		}
		this.polarity = polarity;
	}

	public void setSex(Sex sex) {
		Objects.requireNonNull(sex);
		this.sex = sex;
	}

	public void setWeight(int weight) {
		if ((weight < 40000) || (weight > 100000)) {
			throw new IllegalArgumentException("Weight must be between 40000 and 100000 grams");
		}
		this.weight = weight;
	}

}