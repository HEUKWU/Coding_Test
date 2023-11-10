-- 코드를 입력하세요
with m as (select distinct cart_id, name
        from cart_products
        where name = 'Milk'),
y as (select distinct cart_id, name
      from cart_products
      where name = 'Yogurt')
      
select m.cart_id
from m
inner join y on m.cart_id = y.cart_id
order by m.cart_id