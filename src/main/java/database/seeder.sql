USE adlister_db;

TRUNCATE users;
TRUNCATE ads;

insert into users (username, email, password) values ('mlelande0', 'sgoby0@gnu.org', 'N3WVc2HJ');
insert into users (username, email, password) values ('ebischop1', 'bdeveraux1@dedecms.com', 'hqkxgS');
insert into users (username, email, password) values ('rfindlow2', 'ecantu2@ehow.com', 'UKTiKYCc6c0');
insert into users (username, email, password) values ('fevesque3', 'josan3@pen.io', 'Te6xW8ZBg');
insert into users (username, email, password) values ('nmariner4', 'gstapele4@goo.ne.jp', '3r6rZFhc39Lr');

INSERT INTO ads (user_id, title, description) values (1, 'a great ad 1', 'this is the section for a description');
INSERT INTO ads (user_id, title, description) values (2, 'a great ad 2', 'this is the section for a description');
INSERT INTO ads (user_id, title, description) values (3, 'a great ad 3', 'this is the section for a description');
INSERT INTO ads (user_id, title, description) values (4, 'a great ad 4', 'this is the section for a description');
INSERT INTO ads (user_id, title, description) values (5, 'a great ad 5', 'this is the section for a description');