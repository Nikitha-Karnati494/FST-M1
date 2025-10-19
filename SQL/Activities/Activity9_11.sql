-- Create the customers table
create table customers (customer_id int primary key, customer_name varchar(32),city varchar(20), grade int, salesman_id int);

-- Insert values into it
INSERT ALL
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;

-- Activity 9
-- Write an SQL statement to know which salesman are working for which customer
SELECT c.customer_name, s.salesmanname
FROM customers c INNER JOIN salesman s
ON c.salesman_id=s.salesmanid;

-- Write an SQL statement to make a list of customers in ascending order with a salesman that have a grade less than 300
SELECT c.customer_name, c.city, c.grade, s.salesmanname, s.salesmancity
FROM customers c LEFT OUTER JOIN salesman s
ON c.salesman_id=s.salesmanid WHERE s.grade<300
ORDER BY customer_id;

-- Write an SQL statement to find the list of customers who appointed a salesman who gets a commission of more than 12%
SELECT c.customer_id, c.customer_name, c.city, s.salesmanname, s.commission
FROM customers c INNER JOIN salesman s
ON c.salesman_id=s.salesmanid
WHERE s.commission > 12
ORDER BY customer_id;

-- Write an SQL statement to find the following details of an order - order number, order date, purchase amount of order, which customer gives the order and which salesman works for that customer and commission rate they get for the order
SELECT o.order_no, o.order_date, o.purchase_amount, c.customer_name, c.grade, s.salesmanname, s.commission
FROM orders o 
INNER JOIN customers c ON o.customer_id=c.customer_id
INNER JOIN salesman s ON o.salesman_id=s.salesmanid;

-- Activity 10
-- Write a query to find all the orders issued against the salesman who may works for customer whose id is 3007
SELECT * FROM orders WHERE salesman_id = (SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);
-- Write a query to find all orders attributed to a salesman in New York.
SELECT * FROM orders WHERE salesman_id IN (SELECT salesmanid FROM salesman WHERE salesmancity='New York');
-- Write a query to count the customers with grades above New York's average
SELECT count(*), grade FROM customers GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');  
-- Write a query to extract the data from the orders table for those salesman who earned the maximum commission
SELECT order_no, purchase_amount, order_date, salesman_id FROM orders WHERE salesman_id IN (SELECT salesmanid FROM salesman WHERE COMMISSION = (SELECT MAX(commission) FROM salesman));

-- Activity 11
-- Write a query that produces the name and number of each salesman and each customer with more than one current order. Put the results in alphabetical order.
SELECT * FROM customers;
SELECT * FROM salesman;
SELECT customer_id, customer_name FROM customers a
WHERE 1<(SELECT COUNT(*) FROM orders o WHERE a.customer_id=o.customer_id)
UNION
SELECT salesmanid, salesmanname FROM salesman b
WHERE 1<(SELECT COUNT(*) FROM orders o WHERE b.salesmanid=o.salesman_id)
ORDER BY customer_name;

-- Write a query to make a report of which salesman produce the largest and smallest orders on each date.
SELECT a.salesmanid, a.salesmanname, o.order_no, o.order_date, o.purchase_amount FROM salesman a, orders o
WHERE a.salesmanid=o.salesman_id AND 
o.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date=o.order_date)
UNION
SELECT a.salesmanid, a.salesmanname, o.order_no, o.order_date, o.purchase_amount FROM salesman a, orders o
WHERE a.salesmanid=o.salesman_id
AND o.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = o.order_date)
ORDER BY order_date;