/**
 *  Problem: 197. Rising Temperature
 *  Link: https://leetcode.com/problems/rising-temperature/description/
 *  Date (MDY): 02/05/2018
 *  Notes:
 */

SELECT w1.Id
FROM Weather AS w1, Weather AS w2
WHERE DATEDIFF(w1.Date, w2.Date) = 1
AND w1.Temperature > w2.Temperature;
