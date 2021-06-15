package com.church.scriptures.biblelookup.dto;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;

public class BibleVerseDTO {


	UUID id;
	
	int chapterNumber ;

	int verseNumber ;

	String verse ;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public int getChapterNumber() {
		return chapterNumber;
	}

	public void setChapterNumber(int chapterNumber) {
		this.chapterNumber = chapterNumber;
	}

	public int getVerseNumber() {
		return verseNumber;
	}

	public void setVerseNumber(int verseNumber) {
		this.verseNumber = verseNumber;
	}

	public String getVerse() {
		return verse;
	}

	public void setVerse(String verse) {
		this.verse = verse;
	}

}
