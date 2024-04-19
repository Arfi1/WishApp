
drop table if exists users;
drop table if exists wish;
drop table if exists wishlist;

create table Users(
UserID int primary key auto_increment,
UserName varchar(50),
Email varchar(50)
);

create table Wish(
WishID int primary key auto_increment,
UserID int, 
beskrivelse varchar(50),
image varchar(50),
URL varchar(50), 
foreign key (UserID) references Users(UserID)
);

create table Wishlist(
WishlistID int primary key auto_increment,
UserID int,
WishID int,
Titel varchar(50), 
Billed varchar(50),
foreign key (UserID) references Users(UserID),
foreign key (WishID) references Wish(WishID)
);

Insert into users (userid, username, email) values 
(1, 'bob', 'bob@email.dk'),
(2, 'bo', 'bo@email.com'),
(3, 'Eser', 'eser@mail.com');


