-- 코드를 입력하세요
SELECT month(START_DATE) MONTH, CAR_ID, count(*) RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where date_format(START_DATE, '%Y-%m') between '2022-08' and '2022-10' 
and CAR_ID in 
(   
    select CAR_ID from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where date_format(START_DATE, '%Y-%m') between '2022-08' and '2022-10'
    group by CAR_ID
    having count(*) >= 5
)
group by month(START_DATE), CAR_ID
order by MONTH, CAR_ID desc;

# SELECT MONTH(START_DATE) AS MONTH, CAR_ID, COUNT(*) AS RECORDS
# FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
# WHERE DATE_FORMAT(START_DATE, '%Y-%m') BETWEEN '2022-08' AND '2022-10'
#     AND CAR_ID IN (SELECT CAR_ID
#                    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
#                    WHERE DATE_FORMAT(START_DATE, '%Y-%m') BETWEEN '2022-08' AND '2022-10'
#                    GROUP BY CAR_ID
#                    HAVING COUNT(CAR_ID) >= 5)
# GROUP BY CAR_ID, MONTH(START_DATE)
# HAVING RECORDS >= 1
# ORDER BY MONTH, CAR_ID DESC