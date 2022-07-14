TRUNCATE TABLE kata.users;
TRUNCATE TABLE kata.role;
TRUNCATE TABLE kata.users_roles;

/*

INSERT INTO kata.users (name, car, age, username, password)
VALUES
	("Anton", "Volga", 35, "admin", "$2a$12$ednl0KoMCQ9IwvlP5mlFleh/ZGON3vDqfC5NTOMwd24xZgDC8Yu/2"), 
	("Liza", "Kia", 27, "user", "$2a$12$Nu2k/x6nNhwjO0wQm.dwROyIlZ3ucyPh38jbujLo/iMYufosyzRDG"); 

INSERT INTO kata.role (name)
VALUES
	('ROLE_USER'),
	('ROLE_ADMIN');

INSERT INTO kata.users_roles (roles_id, user_id)
VALUES
	(2,1),
    (1,2);


*/
