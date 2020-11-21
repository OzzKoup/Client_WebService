    --Query find out employee by ID  who have  less than 100.00 salary in previous

SELECT E.*,  SUM(ES.SALARY) AS TOTAL_SALARY
FROM EMPLOYEE E
    JOIN EMPLOYEE_SALARY ES on E.ID = ES.EMPLOYEE_ID
WHERE E.ID = ?
GROUP BY E.ID
HAVING SUM(ES.SALARY) > 100000;

    --Query find out employee by certain name who having less than 100.000 salary in previous year

SELECT E.*,  SUM(ES.SALARY) AS TOTAL_SALARY
FROM EMPLOYEE E
    JOIN EMPLOYEE_SALARY ES on E.ID = ES.EMPLOYEE_ID
WHERE NAME like '?'
GROUP BY E.ID
HAVING SUM(ES.SALARY) > 100000;

    --Query find out all employees who having salary less than 100,000

SELECT E.*,  SUM(ES.SALARY) AS TOTAL_SALARY
FROM EMPLOYEE E
    JOIN EMPLOYEE_SALARY ES on E.ID = ES.EMPLOYEE_ID
GROUP BY E.ID
HAVING SUM(ES.SALARY) > 100000;

    -- Query find out all employees who have more than 50 years old and one of month`s salary was less than 5.000

SELECT E.*
FROM EMPLOYEE E
    JOIN EMPLOYEE_SALARY ES on E.ID = ES.EMPLOYEE_ID
WHERE ES.SALARY < 5000
GROUP BY E.ID,E.BIRTH_DAY
HAVING (YEAR(CURRENT_DATE) - YEAR(E.BIRTH_DAY)) > 50 ;
