Spring Boot with Spring Security, JPA, MySQL (Docker image/local)
===

	* Requirements to run the project using docker OR local setup :
	-> Windows 10 pro Operating System with hypervisor enabled and Docker installed on local machine.
	OR
	-> Install MySQL on local machine and use it as database.

	* Prerequisites to run the project with Docker: 
	1. Please install Docker on your local machine properly. Check docker version after installed.
	2. Follow the below steps to pull mysql docker image with mapping of port, start the container.
	3. Create database user, database , table, insert one sample record.
	4. Finally Run the project.

	Steps: 
	*	CMD> docker -v
	*	CMD> docker run --name=pravin-mysql -e MYSQL_ROOT_PASSWORD=mysql -d -p 3306:3306 mysql
	*	CMD> docker exec -it pravin-mysql bash
	*	mysql> mysql -p
		enter pass: mysql
	*	mysql> CREATE USER 'springsecurity'@'%' IDENTIFIED BY 'MYSQL';
	*	mysql> GRANT ALL PRIVILEGES ON *.* TO 'springsecurity'@'%' WITH GRANT OPTION;
	*	mysql> \q
	*	mysql> mysql -u springsecurity -p
	*	enter: MYSQL
	*	mysql> CREATE DATABASE springsecurity;
	*	mysql> CREATE TABLE user (
    					id int,
    					active varchar(255),
    					password varchar(255),
    					roles varchar(255),
    					user_name varchar(255)
					);
	*	mysql> INSERT INTO user (id, active, password, roles, user_name)
							VALUES (1, true, 'pravin', 'ROLE_USER', 'pravin');
