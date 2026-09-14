INSERT INTO item (id, name, manufacturing, expiry, price, category)
VALUES (1, 'iPhone 15', '2025-01-10', '2028-01-10', 65000, 'Electronics');

INSERT INTO item (id, name, manufacturing, expiry, price, category)
VALUES (2, 'Samsung Galaxy S24', '2025-02-15', '2028-02-15', 55000, 'Electronics');

INSERT INTO item (id, name, manufacturing, expiry, price, category)
VALUES (3, 'HP Laptop', '2025-03-20', '2028-03-20', 70000, 'Electronics');

INSERT INTO item (id, name, manufacturing, expiry, price, category)
VALUES (4, 'Headphones', '2025-04-05', '2028-04-05', 3000, 'Accessories');

INSERT INTO mall (id, mall_name, location, categories)
VALUES (1, 'City Mall', 'Bengaluru', 'Electronics, Fashion, Food');

INSERT INTO users (id, name, type, password)
VALUES (1, 'Sourabh', 'CUSTOMER', '1234');

INSERT INTO order_details (id, date_of_purchase, total, payment_mode)
VALUES (101, '2026-09-14 17:00:00', 60000, 'UPI');