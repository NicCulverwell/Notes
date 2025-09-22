use store;

-- IN --


SELECT * FROM products
	WHERE PRICE IN(89.99, 98.99);			-- IN can be used to find all data relating to multiple different options
    
SELECT * FROM products
	WHERE PRICE NOT IN(89.99, 98.99);		-- NOT IN will exclude the provided data
    
    
-- BETWEEN --
    
    
SELECT * FROM products						-- Finds all data between two points
	WHERE PRICE BETWEEN 50 AND 100;
    
SELECT * FROM products						-- Finds all data outside of the two points
	WHERE PRICE NOT BETWEEN 50 AND 100;		


-- LIKE


SELECT * FROM products						-- Used to find any data that is the provided data, the % sign means, starts with M and has any number of letters afterwards
	WHERE NAME LIKE 'M%';
    
SELECT * FROM PRODUCTS						-- In this case, %M% means any letters before or after M are allowed, so long as there is an M
	WHERE NAME LIKE '%M%';						-- _M_ would be used, if only a single character was allowed before and after the letter. ie. EMU
    
SELECT * FROM PRODUCTS						-- multiple _ can be used, if you want a specific number of letters before or after
	WHERE NAME LIKE 'M_____________';
    
 
 -- ORDER BY
 

SELECT * FROM PRODUCTS						-- Ordering our table in asceding order based on the price
	ORDER BY PRICE ASC;

SELECT * FROM PRODUCTS						-- Ordering our table in descending order based on the price
	ORDER BY NAME DESC;
    
SELECT * FROM PRODUCTS						-- Orders the Products in ascending order by Name, if there are 2 identical Names, then it will go in ascending order of price
	ORDER BY NAME, PRICE ASC;
    
    
 -- DISTINCT   
    
    
SELECT DISTINCT NAME FROM PRODUCTS;			-- returns the NAME column, without duplicates (if there were any duplicates, they wouldnt be shown)
    
    
-- LIMITS
    
    
SELECT * FROM products						-- limits the result, to the first 2 rows based on the Primary Key
	LIMIT 2;

SELECT * FROM products						-- limits the result, to the next 2 rows based on the Primary Key, skipping the 1st row
	LIMIT 2 OFFSET 1;


-- ALIAS


SELECT NAME as PRODUCT FROM products;		-- Allows us to bring up selections of data under a different name, using as <ALIAS NAME>



