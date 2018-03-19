insert into users (username, email, enabled, password, sex) value("irek", "irek@gmail.com", true, "irek", "male");
insert into users (username, email, enabled, password, sex) value("monika", "monika@gmail.com", true, "monika", "female");

insert into roles(name, username) value("ROLE_ADMIN", "irek");
insert into roles(name, username) value("ROLE_USER", "irek");
insert into roles(name, username) value("ROLE_USER", "monika");

insert into companies(description, location, name) value("super", "Lodz", "CleverSan");
insert into companies(description, location, name) value("ok", "Warsaw", "COMARCH");
insert into companies(description, location, name) value("boring", "Krakow", "TheOne");
insert into companies(description, location, name) value("fun", "Szczecin", "BalticPro");

insert into offers(contactData, created, description, expectedSalary, feedback, valid, location, maxSalary, minSalary, refNumber, title, company_id, username) value("maria@mail.pl", "20180301", "test description", 3500, "if feedback present", true, "Lodz", 7000, 2500, "id1111", "Junior Java Developer", 1, "irek");

insert into offers(contactData, created, description, expectedSalary, feedback, valid, location, maxSalary, minSalary, refNumber, title, company_id, username) value("magdalena@mail.pl", "20180311", "test description2222", 40000, "if feedback present2222", true, "Warszawa", 7000, 4000, "id2222", "Junior Android Developer", 2, "irek");

insert into offers(contactData, created, description, expectedSalary, feedback, valid, location, maxSalary, minSalary, refNumber, title, company_id, username) value("ania@mail.pl", "20180313", "test description33333", 3500, "if feedback present3333", true, "Krakow", 7000, 2500, "id3333", "Junior Software Dev", 3, "irek");

insert into offers(contactData, created, description, expectedSalary, feedback, valid, location, maxSalary, minSalary, refNumber, title, company_id, username) value("rysia@mail.pl", "20180304", "test description4444", 2500, "if feedback present4444", true, "Poznan", 7000, 2500, "id444", "Junior Tester", 4, "monika");
