-- We do have 2 tables in a relational database:
-- ∙ Clients (client_id(PK), client_name)
-- ∙ Orders (order_id(PK), client_id, order_sum, order_date)
-- Please write the following SQL queries:
--   a- list of clients, which have an order with order_sum > 50
--   b- clients, whose total sum of orders exceeds 100


-- Query A

select distinct c.client_id, c.client_name  from Clients c
inner join Orders o on o.client_id = c.client_id
where o.order_sum > 50


-- Query B

select c.client_id, sum(order_sum) from Clients c
inner join Orders o on o.client_id = c.client_id
group by c.client_id having sum(order_sum) > 100
