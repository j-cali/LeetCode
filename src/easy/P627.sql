/**
 *  Problem: 627. Swap Salary
 *  Link: https://leetcode.com/problems/swap-salary/description/
 *  Date (MDY): 02/02/2018
 *  Notes: Use CASE
 */

UPDATE salary
SET sex =
CASE WHEN sex = 'f' THEN 'm'
	ELSE 'f'
END;
