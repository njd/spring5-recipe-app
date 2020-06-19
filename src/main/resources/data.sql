INSERT INTO category (id, description) VALUES (1, 'American');
INSERT INTO category (id, description) VALUES (2, 'Italian');
INSERT INTO category (id, description) VALUES (3, 'British');
INSERT INTO category (id, description) VALUES (4, 'Fast Food');

INSERT INTO unit_of_measure (description) VALUES ('Tablespoon');
INSERT INTO unit_of_measure (description) VALUES ('Teaspoon');
INSERT INTO unit_of_measure (description) VALUES ('Cup');
INSERT INTO unit_of_measure (description) VALUES ('Pinch');
INSERT INTO unit_of_measure (description) VALUES ('Ounce');

INSERT INTO recipe (id, cook_time, description, DIFFICULTY, prep_time) VALUES (1, 20, 'Oven Chips', 'EASY', 10);
INSERT INTO recipe (id, cook_time, description, DIFFICULTY, prep_time) VALUES (2, 15, 'Pizza', 'MODERATE', 25);
INSERT INTO recipe (id, cook_time, description, DIFFICULTY, prep_time) VALUES (3, 240, 'Christmas Turkey', 'HARD', 45);

insert into recipe_category (RECIPE_ID, CATEGORY_ID) values ( 1, 3 );
insert into recipe_category (RECIPE_ID, CATEGORY_ID) values ( 1, 4 );
insert into recipe_category (RECIPE_ID, CATEGORY_ID) values ( 2, 1 );
insert into recipe_category (RECIPE_ID, CATEGORY_ID) values ( 2, 2 );
insert into recipe_category (RECIPE_ID, CATEGORY_ID) values ( 3, 4 );
