package com.church.scriptures.biblelookup.repsitory;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.church.scriptures.biblelookup.entities.BibleVerse;
import com.church.scriptures.biblelookup.entities.BookName;

public interface BibleVerseRepository extends CrudRepository<BibleVerse, UUID> {

	public List<BibleVerse> findBybookNameId(UUID bookNameId);
		
}
