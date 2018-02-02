/**
 *  Problem: 595. Big Countries
 *  Link: https://leetcode.com/problems/big-countries/description/
 *  Date (MDY): 02/02/2018
 *  Notes: Use WHERE and OR
 */

SELECT name, population, area 
FROM World
WHERE area > 3000000
	OR population > 25000000;
