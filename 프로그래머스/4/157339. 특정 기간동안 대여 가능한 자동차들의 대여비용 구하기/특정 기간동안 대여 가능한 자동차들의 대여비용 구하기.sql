-- 코드를 입력하세요
SELECT c.car_id, c.car_type, daily_fee * ((100 - substring_index(discount_rate, '%', 1)) / 100) * 30 
fee
from CAR_RENTAL_COMPANY_CAR c
inner join CAR_RENTAL_COMPANY_RENTAL_HISTORY h on c.car_id = h.car_id
inner join CAR_RENTAL_COMPANY_DISCOUNT_PLAN p on c.car_type = p.car_type
where c.car_type in ('세단', 'SUV')
and c.car_id not in (
    select car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where END_DATE>='2022-11-01'
    and START_DATE<'2022-12-01')
and duration_type like '30%'
group by car_id
having fee >= 500000 and fee < 2000000
order by daily_fee desc, c.car_type, c.car_id desc