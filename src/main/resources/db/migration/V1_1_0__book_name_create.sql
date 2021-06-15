CREATE TABLE IF NOT EXISTS public.book_name
(
    id uuid NOT NULL DEFAULT uuid_generate_v4(),
    book_name text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT books_name_pkey PRIMARY KEY (id),
    CONSTRAINT constraint_name UNIQUE (book_name)
)