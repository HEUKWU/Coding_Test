-- 코드를 입력하세요
SELECT h.flavor
from first_half h
inner join (
    select flavor, sum(total_order) total_order
    from july
    group by flavor) j
on h.flavor = j.flavor
order by h.total_order + j.total_order desc
limit 3