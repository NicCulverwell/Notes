-- OPERATIONS


use store;	

SELECT * FROM products;					-- * means all data

SELECT NAME FROM products;				-- selects a specific Column

SELECT NAME, PRICE FROM products; 		-- more than one column can be selected

SELECT * FROM products					-- WHERE can give additional criteria
	WHERE PRICE > 50; 

SELECT * FROM products					-- USING AND / OR we can give as many criteria as we want
	WHERE PRICE > 50
    AND PRICE < 90;
    

SELECT * FROM products
	WHERE ID = 3
    OR ID = 1;

SELECT * FROM PRODUCTS					-- When working with NULL as an answer, you use IS or IS NOT
	WHERE PRICE IS NOT NULL;
    
    
    -- Inequality Symbols"
/* 
	=			EQUAL TO
	!= 			NOT EQUAL TO		<> also can be used for not equal to
	>			GREATER THAN
    <			LESS THAN
    >=			GREATER THAN OR EQUAL TO
    <=			LESS THAN OR EQUAL TO
*/






