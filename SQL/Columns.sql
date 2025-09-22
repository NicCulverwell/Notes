-- COLUMNS --

use store;


-- CHANGING COLUMN NAMES --


ALTER TABLE products
	CHANGE NAME PRODUCT_NAME VARCHAR(30);	-- Changing a Column Name
    
ALTER TABLE products
	RENAME COLUMN PRODUCT_NAME TO NAME;		-- Alternative way to change the Column Name

ALTER TABLE products
	RENAME COLUMN NAME TO `PRODUCT NAME`;	-- If you wish to include a Special Character, you must use back ticks (button above TAB)


-- CHANGING DATA TYPES --


ALTER TABLE products
	CHANGE `PRODUCT NAME` NAME CHAR(30);	-- Bare in mind, when changing data types, soem data wont be compatible with certain data types. ie. changing 'cat' into an integer, is not going to end well
												-- You Do Not have to Change the Name, in this case type the same name twice ( CHANGE NAME NAME CHAR(30) )
ALTER TABLE products
	MODIFY COLUMN NAME VARCHAR(30);			-- Alternative Way of Changing Data Types

