-- DATA MANIPULATION

use store;
show tables;

-- Inserting Data into the table customers, indicate what data is being input, and then giving specifics, with each bracket being a new row


-- INSERTING DATA --


INSERT INTO products(NAME, PRICE, ORIGINS) VALUES 
    ('Unknown Potion', 35.99, 'Amazonian Forest'), 
    ('Dawnstar', 98.99, 'Ancient Draugr Burial Mound'),
    ('Wabbojack', 79.99,'Sheogorath Himself'),
    ('Ebony Mail', 89.99, 'Boethiath');
    
SELECT * FROM products;

INSERT INTO customers (FIRST_NAME, LAST_NAME, GENDER, PHONE_NUMBER)	VALUES
    ('Darren', 'Spiers', 'M', '071 680 4567'), 
    ('Julia', 'Collingwood', 'F', '082 987 1234'), 
    ('Zaid', 'Patel', 'M', '087 543 1267'), 
    ('Roberto', 'Gallo', 'M', '099 678 9898');

SELECT * FROM customers;	-- shows us the data stored in customers

INSERT INTO orders(ID, PRODUCT_ID, CUSTOMER_ID, ORDER_TIME) VALUES
	(1, 3, 2, '2022-01-09 01:42:23'),
    (2, 4, 3, '2024-01-27 08:13:51'),
    (3, 2, 1, '2015-08-21 11:52:42'),
    (4, 2, 1, '2001-09-20 21:28:17'),
    (5, 1, 4, '2006-08-30 16:30:58'),
    (6, 4, 2, '2008-07-14 14:29:09');

SELECT * FROM orders;

	-- UPDATING DATA
    
    
    UPDATE products					-- Select the Table you are updating
		SET ORIGINS = 'The Rift' 	-- SET which column it is you are affecting, and what is changing
        WHERE ID = 1;				-- then choose which Specific ID you are changing, using the Primary Key
        
	
    SET sql_safe_updates = false;	-- Allows us to Update more than 1 column at a time, will reset after each session
    
    UPDATE products
		SET NAME = 'Magicka Potion', PRICE = 47.99
        WHERE ID = 1;
        
	
-- DELETING DATA


DELETE FROM products			-- Moving back into Products again
	WHERE ID > 4;				-- Deleting Any Item where the ID is greater than 4 (if you want to test, run the INSERT INTO products command twice, to genereate 8 products, check, then run this line)
    
DELETE FROM orders
	WHERE ID > 0;
    
