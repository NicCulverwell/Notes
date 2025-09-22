-- ALTERING TABLES --


use store;

ALTER TABLE products		-- If you want to change a specific table, you open with ALTER TABLE table_name
	ADD column ORIGINS VARCHAR(30);			-- you then follow with the specifics of whaat you wish to do, in this case add a column (column names cannot be duplicate

ALTER TABLE products
	DROP column ORIGINS;					-- removing a column

ALTER TABLE orders
	ADD PRIMARY KEY (ID);					-- changing a column into a Primary Key
    

-- CONSTRAINTS --


use store;

DESCRIBE customers;

ALTER TABLE customers
	ADD CONSTRAINT u_PHONE UNIQUE(PHONE_NUMBER);	-- CONSTRAINTS change the type of key present: UNIQUE | PRIMARY | FOREIGN | CHECK

ALTER TABLE customers
	DROP INDEX u_PHONE;								-- Deleting the Constraint based on its predesigned name
