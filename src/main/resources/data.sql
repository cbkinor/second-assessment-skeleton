insert into twibber.profiles (email, first_name, last_name, phone) values ('rmarley@gmail.com', 'Robert', 'Marley', '5555555555');

insert into twibber.credentials (username, password) values ('rmarley', 'testing');

insert into twibber.users (username, deleted, credential_id, profile_id) values ('rmarley', false, 1, 1);

