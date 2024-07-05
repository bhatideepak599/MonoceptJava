#Write specific queries that perform the following operations:

#1. Display all employee names in ascending order
	select ename from emp order by ename;

#2. Display all employee names, salary, commision of employees in dept 10
	select ename,sal,comm from emp where dept =10;

#3. Display all employees in deptno 20 and 30
select * from EMP where DEPTNO  between 20 and 30;

#4. Display all employees who are managers(job title)
	select * from EMP where JOB = 'MANAGER';

#5. Display all employees whose salary is between 2000 to 5000
	select * from EMP where SAL between 2000 and 5000;

#6.Display all employees whose commision is NULL
	select * from EMP where COMM is null ;

#7.Display employee name, salary, commission in descending order based on salary
	select ename,sal,comm from emp order by sal desc;

#8. Display average, max, min and sum of salaries of employees
	SELECT AVG(sal) AS average_salary, MAX(sal) AS max_salary, MIN(sal) AS min_salary, 
	SUM(sal) AS total_salary FROM emp;

#9. Display hire date, current date and tenure(in months) of the employees
	SELECT HIREDATE, now()  ,timestampdiff( year, HIREDATE , now() ) AS tenure
	FROM emp;

#10. Display all employees whose name starts with 'S'.
	 select * from EMP where ENAME like 'S%';

#11. Display unique deptno from emp table
	 SELECT DISTINCT DEPTNO FROM emp;

#12. Display employee's job in lower case
	 select LOWER(JOB) as JOB from EMP;
#13. Select top 3 salary earning employees(employees can be more than 3)
	 select ENAME, SAL from EMP order by SAl desc LIMIT 3;
     
#14. Select all clerks and managers in dept 10
	 select * from EMP where DEPTNO=10 and JOB in ('clerk','Manager');

#15. Display all clerks in ascending order of deptno
	 SELECT * from EMP where JOB = 'CLERK' ORDER BY DEPTNO; 
     
#16. Display all employees department wise
	 select * from emp order by deptno ,ename;

#17. Display how many employees are there for each job
	SELECT job, COUNT(*) AS employee_count FROM emp GROUP BY job;

#18. Display what jobs are there for each department and number of employees for each job
     SELECT deptno , job,  COUNT(*) AS employee_count
		FROM emp GROUP By deptno , job ORDER BY deptno, job;
        
#19. Display how many employees are there for each department
		SELECT deptno ,   COUNT(*) AS employee_count
		FROM emp GROUP By deptno  ORDER BY deptno;

#20. Display the rank of each employee with respect to their salary (highest salary will be rank 1)
	 SELECT empno, ename, sal, RANK() OVER (ORDER BY sal DESC) AS salary_rank
	FROM emp ORDER BY salary_rank;