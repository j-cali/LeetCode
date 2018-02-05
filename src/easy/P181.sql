/**
 *  Problem: 181. Employees Earning More Than Their Managers
 *  Link: https://leetcode.com/problems/employees-earning-more-than-their-managers/description/
 *  Date (MDY): 02/05/2018
 *  Notes:
 */

SELECT Name AS 'Employee'
FROM Employee AS e1
WHERE Salary > 
	(SELECT Salary 
	FROM Employee AS e2 
	WHERE e1.ManagerId = e2.Id);
