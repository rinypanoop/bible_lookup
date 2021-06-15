CREATE TABLE IF NOT EXISTS public.relations
(
    id uuid NOT NULL DEFAULT uuid_generate_v4(),
    bible_verse_id uuid NOT NULL,
    bible_verse_relations json NOT NULL,
    CONSTRAINT relations_pkey PRIMARY KEY (id),
    CONSTRAINT constraint_name FOREIGN KEY (bible_verse_id)
        REFERENCES public.bible_verse (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

