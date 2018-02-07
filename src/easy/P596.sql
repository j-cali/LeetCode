/**
 *  Problem: 596. Classes More Than 5 Students
 *  Link: https://leetcode.com/problems/classes-more-than-5-students/description/
 *  Date (MDY): 02/07/2018
 *  Notes:
 */

SELECT class
FROM
	(SELECT class, COUNT(DISTINCT student) as num
	FROM courses
	GROUP BY class) as crs
WHERE num >= 5;
