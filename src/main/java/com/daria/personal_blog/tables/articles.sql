CREATE TABLE articles (
	id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50) UNIQUE,
    shortDescription VARCHAR(100),
    articleText VARCHAR(2000),
    Creationdate DATE DEFAULT (CURRENT_DATE)
);
