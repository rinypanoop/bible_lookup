package com.church.scriptures.biblelookup.repsitory;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.church.scriptures.biblelookup.entities.BookName;

public interface BookNameRepository extends CrudRepository<BookName, UUID> {
	



}
