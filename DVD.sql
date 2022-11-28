USE wileyDI001;

CREATE TABLE Dvd(
DVD_ID int AUTO_INCREMENT PRIMARY KEY,
TITLE varchar(30) NOT NULL,
RELEASE_DATE date,
DIRECTOR varchar(30) NOT NULL,
STUDIO varchar(30) NOT NULL
);

-- DATE : YYYY-MM-DD
INSERT INTO Dvd
VALUES(111, "Avatar", "2009-12-10", "James Cameron", "20th Century Fox"),
(222, "Black Panther", "2018-01-29", "Ryan Coogler", "Marvel Studios"),
(333, "Soul", "2020-10-11", "Pete Docter", "Walt Disney Pictures"),
(444, "The OA", "2016-12-16", "Brit Marling", "Plan B Entertainment");

SELECT * FROM Dvd;

-- KEYWORD AS TO GIVE ALIAS TO COLUMNS
SELECT DVD_ID AS ID, TITLE AS Title, RELEASE_DATE "Release Date",  DIRECTOR AS Director, STUDIO AS Studio
FROM Dvd;