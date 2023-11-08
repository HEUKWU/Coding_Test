-- 코드를 입력하세요
SELECT p.product_id, product_name, sum(price * amount) total_sales
from food_product p
inner join food_order o
on p.product_id = o.product_id
where produce_date like '2022-05%'
group by product_id
order by total_sales desc, p.product_id