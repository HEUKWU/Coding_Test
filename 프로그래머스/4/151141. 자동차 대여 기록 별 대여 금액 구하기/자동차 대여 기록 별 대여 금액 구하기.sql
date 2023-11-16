-- 코드를 입력하세요
with common as (
    select c.daily_fee, c.car_type, h.history_id, 
           datediff(end_date, start_date) + 1 period,
    case
      when datediff(end_date, start_date) + 1 >= 90 then '90일 이상'
      when datediff(end_date, start_date) + 1 >= 30 then '30일 이상'
      when datediff(end_date, start_date) + 1 >= 7 then '7일 이상'
      else 'none' end duration_type
from car_rental_company_rental_history h
inner join car_rental_company_car c on h.car_id = c.car_id
where c.car_type = '트럭')

select common.history_id history_id,
    round(common.daily_fee * common.period * 
          (100 - ifnull(p.discount_rate, 0)) / 100) fee
from common
left join car_rental_company_discount_plan p
    on p.duration_type = common.duration_type
    and p.car_type = common.car_type
order by fee desc, history_id desc