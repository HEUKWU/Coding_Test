-- 코드를 입력하세요
SELECT CATEGORY, sum(SALES) TOTAL_SALES
from BOOK b
inner join BOOK_SALES s 
on b.BOOK_ID = s.BOOK_ID
where month(SALES_DATE) = 1
group by CATEGORY
order by CATEGORY