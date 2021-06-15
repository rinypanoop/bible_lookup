package com.church.scriptures.biblelookup.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BibleVerse {
	
	@Id
	UUID id;
	
	@Column(name = "chapter_number")
	int chapterNumber ;

	@Column(name = "verse_number")
	int verseNumber ;

	@Column(name = "verse")
	String verse ;

	@Column(name = "book_name_id")
	UUID bookNameId ;

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

	public UUID getBookNameId() {
		return bookNameId;
	}

	public void setBookNameId(UUID bookNameId) {
		this.bookNameId = bookNameId;
	}

}
