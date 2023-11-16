-- 코드를 입력하세요
select year, month, count(*) puchased_users,
round((count(*) / (select count(*) from user_info where year(joined) = 2021)), 1) puchased_ratio
from (select distinct year(s.sales_date) year, month(s.sales_date) month, i.user_id
      from online_sale s
      inner join user_info i on s.user_id = i.user_id
      where year(joined) = 2021) a
group by year, month
order by year, month