-- 코드를 입력하세요
select month(start_date) month, car_id, count(*) records
from car_rental_company_rental_history
where month(start_date) between 8 and 10 and car_id in (select car_id
                 from car_rental_company_rental_history
                 where month(start_date) between 8 and 10
                 group by car_id
                 having count(*) >= 5)
group by month, car_id
having records > 0
order by month, car_id desc;