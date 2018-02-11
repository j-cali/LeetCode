/**
 *  Problem: 176. Second Highest Salary
 *  Link: https://leetcode.com/problems/second-highest-salary/description/
 *  Date (MDY): 02/10/2018
 *  Notes:
 */

SELECT
    (SELECT DISTINCT Salary
     FROM Employee
     ORDER BY Salary DESC
     LIMIT 1 OFFSET 1) AS SecondHighestSalary;
