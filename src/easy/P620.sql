/**
 *  Problem: 620. Not Boring Movies
 *  Link: https://leetcode.com/problems/not-boring-movies/description/
 *  Date (MDY): 02/02/2018
 *  Notes:
 */

SELECT *
FROM cinema
WHERE id % 2 != 0
AND description != 'boring'
ORDER BY rating DESC;
