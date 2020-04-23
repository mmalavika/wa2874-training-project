DELETE FROM CUSTOMERS WHERE ID = 0;
insert into CUSTOMERS (ID, CUSTOMER_NAME, EMAIL) VALUES (0, 'System', 'system@system.com');

--Run once only or else it will keep inserting these records every time
--insert into CUSTOMERS (CUSTOMER_NAME, EMAIL) VALUES ('Bruce', 'bruce@a.com');
--insert into CUSTOMERS (CUSTOMER_NAME, EMAIL) VALUES ('Paul', 'paul@b.com');
--insert into CUSTOMERS (CUSTOMER_NAME, EMAIL) VALUES ('Rick', 'rick@c.com');
--insert into CUSTOMERS (CUSTOMER_NAME, EMAIL) VALUES ('Tom', 'tom@d.com');