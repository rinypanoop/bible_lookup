package com.church.scriptures.biblelookup.dto;

import java.util.UUID;

public class BookNameDTO {

    public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	UUID id;
	String bookName ; 
	
}
