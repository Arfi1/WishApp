
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

INSERT INTO Users (UserName, Email) VALUES
('Alice', 'alice@email.com'),
('Charlie', 'charlie@email.com'),
('David', 'david@email.com'),
('Eva', 'eva@email.com');


INSERT INTO Wish (UserID, beskrivelse, image, URL) VALUES
(2, 'Description of wish 5', 'image5.jpg', 'http://example.com/wish5'),
(3, 'Description of wish 6', 'image6.jpg', 'http://example.com/wish6'),
(4, 'Description of wish 7', 'image7.jpg', 'http://example.com/wish7'),
(1, 'Description of wish 8', 'image8.jpg', 'http://example.com/wish8'),
(2, 'Description of wish 9', 'image9.jpg', 'http://example.com/wish9'),
(3, 'Description of wish 10', 'image10.jpg', 'http://example.com/wish10'),
(4, 'Description of wish 11', 'image11.jpg', 'http://example.com/wish11'),
(1, 'Description of wish 12', 'image12.jpg', 'http://example.com/wish12');


INSERT INTO Wishlist (UserID, WishID, Titel, Billed) VALUES
(2, 5, 'Wishlist 2', 'wishlist_image5.jpg'),
(3, 6, 'Wishlist 3', 'wishlist_image6.jpg'),
(4, 7, 'Wishlist 4', 'wishlist_image7.jpg'),
(1, 8, 'Wishlist 1', 'wishlist_image8.jpg'),
(2, 9, 'Wishlist 2', 'wishlist_image9.jpg'),
(3, 10, 'Wishlist 3', 'wishlist_image10.jpg'),
(4, 11, 'Wishlist 4', 'wishlist_image11.jpg'),
(1, 12, 'Wishlist 1', 'wishlist_image12.jpg');
