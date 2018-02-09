/**
 *  Problem: 196. Delete Duplicate Emails
 *  Link: https://leetcode.com/problems/delete-duplicate-emails/description/
 *  Date (MDY): 02/08/2018
 *  Notes:
 */

DELETE p1 FROM
	Person AS p1, Person AS p2
WHERE
	p1.Email = p2.Email
AND
	p1.Id > p2.Id;
