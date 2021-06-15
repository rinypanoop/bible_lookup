CREATE TABLE IF NOT EXISTS public.bible_verse
(
    id uuid NOT NULL DEFAULT uuid_generate_v4(),
    chapter_number integer NOT NULL,
    verse_number integer NOT NULL,
    verse text COLLATE pg_catalog."default" NOT NULL,
    book_name_id uuid NOT NULL,
    CONSTRAINT bible_verse_pkey PRIMARY KEY (id),
    CONSTRAINT "constraint" FOREIGN KEY (book_name_id)
        REFERENCES public.book_name (id) MATCH FULL
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        DEFERRABLE
)
