/**
 *  Problem: 183. Customers Who Never Order
 *  Link: https://leetcode.com/problems/customers-who-never-order/description/
 *  Date (MDY): 02/05/2018
 *  Notes:
 */

SELECT Name AS 'Customers'
FROM Customers
WHERE Customers.Id NOT IN 
	(SELECT CustomerId 
	FROM Orders 
	WHERE CustomerId IS NOT NULL);
