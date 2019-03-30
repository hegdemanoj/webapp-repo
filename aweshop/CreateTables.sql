CREATE TABLE items (
    Personid int NOT NULL AUTO_INCREMENT,
    ItemName varchar(255),
    Quantity varchar(255),
    PRIMARY KEY (Personid)
);



insert into items(ItemName,Quantity) values('Shampoo',10);