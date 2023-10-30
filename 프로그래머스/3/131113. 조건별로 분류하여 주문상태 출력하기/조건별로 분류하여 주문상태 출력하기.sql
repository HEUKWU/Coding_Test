-- 코드를 입력하세요
SELECT ORDER_ID, PRODUCT_ID, date_format(OUT_DATE, '%Y-%m-%d') OUT_DATE,
case when date_format(OUT_DATE, '%Y-%m-%d') <= '2022-05-01' then '출고완료' when OUT_DATE is null then '출고미정' else '출고대기' end
출고여부 from FOOD_ORDER
order by ORDER_ID