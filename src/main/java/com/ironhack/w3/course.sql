DROP SCHEMA IF EXISTS course;
CREATE SCHEMA course;
USE course;

-- DDL: CREATE, ALTER , DROP, TRUNCATE

CREATE TABLE teacher (
	id INT NOT NULL AUTO_INCREMENT,
	teacher VARCHAR(255),	
	PRIMARY KEY (id)
);

CREATE TABLE course(
	course VARCHAR (50) NOT NULL,
	hours INT,
	classroom VARCHAR (255),
	vacations VARCHAR (255),
	teacher_id INT NOT NULL,
	PRIMARY KEY (course),
	FOREIGN KEY (teacher_id) REFERENCES teacher(id)
);

-- CRUD: CREATE, RETRIEVE (SELECT), UPDATE, DELETE

INSERT INTO teacher (teacher) VALUES 
('Alberto García'),
('Beatriz López'),
('Carmen Martín');

INSERT INTO course (course, hours, classroom, vacations, teacher_id) VALUES
('Math', 100, 'A1', '2 weeks', 1),
('Programming', 150, 'B1', '3 weeks', 2),
('Computer Science', 150, 'B1', '3 weeks', 2),
('English', 50, 'A2', '1 week', 1),
('Physics', 200, 'C1', '4 weeks', 1),
('Chemistry', 100, 'Lab1', '2 weeks', 3);

-- UPDATE course SET hours = 160, classroom = 'A9' WHERE course = 'Math';
-- DELETE FROM course WHERE hours > 100;

SELECT * FROM teacher;
SELECT * FROM course;

-- SELECT * FROM course ORDER BY hours;
-- SELECT * FROM course ORDER BY hours DESC;
-- SELECT * FROM course ORDER BY hours DESC LIMIT 2;

-- SELECT course, hours FROM course;
-- SELECT course, hours FROM course WHERE hours >= 100 AND hours <= 200;
-- SELECT course, hours FROM course WHERE hours BETWEEN 100 AND 200;

-- SELECT * FROM course WHERE classroom = 'B1';
-- SELECT * FROM course WHERE classroom LIKE '_1';
-- SELECT * FROM course WHERE classroom LIKE '%1';
-- SELECT * FROM course WHERE course LIKE '%p%';

-- SELECT classroom FROM course;
-- SELECT COUNT(classroom) AS classrooms FROM course;
-- SELECT COUNT(DISTINCT classroom) AS classrooms FROM course;

-- SELECT SUM(hours) AS total_hours FROM course;
-- SELECT SUM(hours) AS total_hours FROM course WHERE teacher_id=1;

-- SELECT AVG(hours) AS avg_hours FROM course;

-- SELECT MAX(hours) AS max_hours, MIN(hours) AS min_hours FROM course;

-- SELECT teacher_id, SUM(hours) AS total_hours FROM course GROUP BY teacher_id;
-- SELECT teacher_id, SUM(hours) AS total_hours FROM course GROUP BY teacher_id HAVING total_hours > 200;

SELECT * 
FROM course AS c
JOIN teacher AS t ON c.teacher_id = t.id;

SELECT c.course, c.hours, c.classroom, t.teacher
FROM course c
JOIN teacher t ON c.teacher_id = t.id;

SELECT c.course, c.hours, c.classroom, t.teacher
FROM course c
JOIN teacher t ON c.teacher_id = t.id
WHERE c.hours > 100;

SELECT t.teacher, SUM(c.hours)
FROM course c
JOIN teacher t ON c.teacher_id = t.id
GROUP BY t.teacher;

-- ESR: Equality, Sort, Range

SELECT * FROM course
WHERE classroom = "a1"
ORDER BY course DESC
AND hours > 100;