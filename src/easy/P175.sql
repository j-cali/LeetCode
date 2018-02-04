/**
 *  Problem: 175. Combine Two Tables
 *  Link: https://leetcode.com/problems/combine-two-tables/description/
 *  Date (MDY): 02/04/2018
 *  Notes: Use LEFT JOIN
 */

SELECT Person.FirstName, Person.LastName, Address.City, Address.State 
FROM Person 
LEFT JOIN Address
ON Person.PersonId = Address.PersonId;
