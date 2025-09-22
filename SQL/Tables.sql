-- Tables

USE store;
SHOW TABLES;				-- shows every table that we have created

-- products;			-- shows us the definitions of a specific table
-- DESCRIBE customers;
-- DESCRIBE orders;

create TABLE products 		-- creates a Table called products
(	
	ID INT auto_increment PRIMARY KEY,		-- column called ID, stores Integers, is the Primary Key, auto-increment means that it will automatically generate a unqiue number for each new input - used for Primary Keys normally
	NAME VARCHAR(30),						-- column called NAME, stores variable characters (string that can change in length) with a max of 30 cahracters
    PRICE DECIMAL(4,2)						-- column named PRICE, stores Decimal numbers that are a max of 4 digits long, with 2 decimal numbers
);

create TABLE customers
(
	ID int auto_increment,
    FIRST_NAME VARCHAR(20),
    LAST_NAME VARCHAR(20),
    GENDER ENUM('M', 'F'),					-- ENUM is a list of String values that must follow a select few options 'M' or 'F' in this case
    PHONE_NUMBER VARCHAR(12),
    PRIMARY KEY(ID)                         -- Another way of making Primary Keys
);

create TABLE orders
(
	ID int auto_increment, -- auto_increment PRIMARY KEY (going to make it a primary key later)
    PRODUCT_ID INT,							
    CUSTOMER_ID INT,
    ORDER_TIME DATETIME,
    FOREIGN KEY (PRODUCT_ID) REFERENCES products(ID),			-- Defining a Foreign Key, PRODUCT_ID, and stating that it is a reference to the ID Column from the products Table
    FOREIGN KEY (CUSTOMER_ID) REFERENCES customers(ID)			-- Defining a Foreign Key, CUSTOMER_ID, and stating that it is a reference to the ID Column from the customers Table
    
);