--Run once only or else it will keep inserting these 4 records every time

DELETE FROM CUSTOMERS WHERE ID = 0;
insert into CUSTOMERS (ID, CUSTOMER_NAME, EMAIL) VALUES (0, 'System', 'system@system.com');
--insert into CUSTOMERS (ID, CUSTOMER_NAME, EMAIL) VALUES (1, 'Bruce', 'bruce@a.com');
--insert into CUSTOMERS (ID, CUSTOMER_NAME, EMAIL) VALUES (2, 'Paul', 'paul@b.com');
--insert into CUSTOMERS (ID, CUSTOMER_NAME, EMAIL) VALUES (3, 'Rick', 'rick@c.com');
--insert into CUSTOMERS (ID, CUSTOMER_NAME, EMAIL) VALUES (4, 'Tom', 'tom@d.com');