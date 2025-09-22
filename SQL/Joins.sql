-- JOINS --

-- Allow you to retrieve Data from multiple tables

use store;

-- INNER JOINS
	-- retrieves data only when there are matching values in both tables
    
    
    SELECT customers.FIRST_NAME AS 'First Name', customers.surname AS 'Last Name', products.NAME AS 'Product Name', orders.purchase_date AS 'Order Time' FROM orders			-- select the columns you wish to work with, and then state FROM the Primary Table
		INNER JOIN products ON orders.PRODUCT_ID = products.product_ID							-- this line exlusively acts to provide the bridge between the two tables, otherwise they wouldnt know how to correlate
        INNER JOIN customers on orders.CUSTOMER_ID = customers.user_ID;						-- each additional table needs a specific line linking it to the Primary Table
    
    
    
-- LEFT JOINS
	-- Retrieves all data from Table 1 (the first table you select) but only matching data from table 2

-- RIGHT JOINS
	-- Retrieves all data from Table 2 (the second table you select) but only matching data from table 1
    
-- OUTER JOINS
	-- Retrieves all data from both tables
	-- Doesnt exist in MySQL
    


-- ONE LARGE TABLE --
SELECT orders.ID, customers.FIRST_NAME, customers.LAST_NAME, customers.GENDER, customers.PHONE_NUMBER, products.NAME, products.PRICE, products.ORIGINS, orders.ORDER_TIME FROM orders
	INNER JOIN products ON orders.PRODUCT_ID = products.ID							
	INNER JOIN customers on orders.CUSTOMER_ID = customers.ID
    ORDER BY orders.ID ASC;