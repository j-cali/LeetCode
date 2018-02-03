/**
 *  Problem: 182. Duplicate Emails
 *  Link: https://leetcode.com/problems/duplicate-emails/description/
 *  Date (MDY): 02/03/2018
 *  Notes:
 */

SELECT DISTINCT Email 
FROM Person
GROUP BY Email
HAVING COUNT(*) > 1;
