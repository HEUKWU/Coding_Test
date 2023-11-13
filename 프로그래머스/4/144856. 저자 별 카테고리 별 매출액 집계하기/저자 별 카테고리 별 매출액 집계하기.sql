-- 코드를 입력하세요
SELECT a.author_id, author_name, category, sum(sales * price) total_sales
from author a
inner join book b on a.author_id = b.author_id
inner join book_sales s on b.book_id = s.book_id
where month(sales_date) = 1
group by a.author_id, category
order by a.author_id, category desc