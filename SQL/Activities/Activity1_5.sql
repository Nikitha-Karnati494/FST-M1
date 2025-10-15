-- Drop a table (for full reset)
DROP TABLE salesman;

-- Activity 1
-- Creating salesman table
CREATE TABLE salesman(salesmanid int PRIMARY KEY, salesmanname varchar(20) NOT NULL, salesmancity varchar(20), commission int);
-- To view the structure/schema of a table
DESCRIBE salesman;

-- Activity 2
-- Inserting values into salesman table
INSERT ALL
    INTO salesman values(5001,'James Hoog','New York',15)
    INTO salesman VALUES(5002, 'Nail Knite','Paris',13)
    INTO salesman VALUES(5005,'Pit Alex','London',11)
    INTO salesman VALUES(5006,'McLyon','Paris',14)
    INTO salesman VALUES(5007,'Paul Adam','Rome',13)
    INTO salesman VALUES(5003,'Lauson Hen','San Jose',12)
SELECT 1 FROM DUAL;
-- To view the data
SELECT * FROM salesman;

-- Activity 3
-- Show data from the salesman_id and salesman_city columns
SELECT salesmanid, salesmancity FROM salesman;
-- Show data of salesman from Paris
SELECT * FROM salesman WHERE salesmancity='Paris';
-- Show salesman_id and commission of Paul Adam
SELECT salesmanid, commission FROM salesman WHERE salesmanname='Paul Adam';

-- Activity 4
-- Add a new column - grade - to the salesman table. The grade will be integer values.
ALTER TABLE salesman ADD grade int;
-- Column values are null by default and new column can always be added at the end of table as last column
-- Set the value in the grade column for everyone to 100.
UPDATE salesman SET grade=100;
-- Use SELECT command to display the results
SELECT * FROM salesman;

-- Activity 5
-- Update the grade score of salesmen from Rome to 200
UPDATE salesman SET grade=200 WHERE salesmancity='Rome';
-- Update the grade score of James Hoog to 300
UPDATE salesman SET grade=300 WHERE salesmanname='James Hoog';
-- Update the name McLyon to Pierre.
UPDATE salesman SET salesmanname='Pierre' WHERE salesmanname='McLyon';
-- Display the modified data
SELECT * FROM salesman;