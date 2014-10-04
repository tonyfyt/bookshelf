create database booksdb;
 
CREATE TABLE `books` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `authorln` varchar(40) NOT NULL,
  `authorfn` varchar(40) NOT NULL,
  `title` varchar(45) NOT NULL,
  `year` int(4) NOT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1

