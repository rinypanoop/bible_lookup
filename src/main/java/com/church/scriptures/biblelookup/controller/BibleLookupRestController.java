package com.church.scriptures.biblelookup.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.church.scriptures.biblelookup.dto.BibleVerseDTO;
import com.church.scriptures.biblelookup.dto.BookNameDTO;
import com.church.scriptures.biblelookup.entities.BibleVerse;
import com.church.scriptures.biblelookup.entities.BookName;
import com.church.scriptures.biblelookup.repsitory.BibleVerseRepository;
import com.church.scriptures.biblelookup.repsitory.BookNameRepository;

@RestController
public class BibleLookupRestController {

	@Autowired
	BookNameRepository bookNameRepository ;
	
	@Autowired
	BibleVerseRepository bibleVerseRepository ;
	
	@GetMapping("/books")
	public List<BookNameDTO> getBookName() {

		Iterable<BookName> bookNames = bookNameRepository.findAll();
		
		
		List<BookNameDTO> bookNameList = new ArrayList<BookNameDTO>() ; 
		
		if(null != bookNames) {
			
			for(BookName bookName: bookNames) {
				
				BookNameDTO bookNameDTO = new BookNameDTO();
				
				bookNameDTO.setId(bookName.getId());
				bookNameDTO.setBookName(bookName.getBookName());
				
				bookNameList.add(bookNameDTO);
				
				
			}
		}
		return bookNameList;	
	}
	
	
	@GetMapping("/books/{bookNameId}")
	public List<BibleVerseDTO> getVersesByBookNameID(@PathVariable UUID bookNameId) {
		
		List<BibleVerse> versesList = bibleVerseRepository.findBybookNameId(bookNameId);
		
		List<BibleVerseDTO> verseList = new ArrayList<BibleVerseDTO>() ; 
		
		if(null != versesList) {
			
			for(BibleVerse verse: versesList) {
				
				BibleVerseDTO bibleVerseDTO = new BibleVerseDTO();
				
				bibleVerseDTO.setChapterNumber(verse.getChapterNumber());
				bibleVerseDTO.setVerseNumber(verse.getVerseNumber());
				bibleVerseDTO.setVerse(verse.getVerse());
				
				verseList.add(bibleVerseDTO);
			}
			
		}
		
		return verseList;
		
	}
}
