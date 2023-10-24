-- 코드를 입력하세요
SELECT 
    (case
        when PRICE < 10000 then 0
        else truncate(PRICE, -4)
    END) PRICE_GROUP, COUNT(*) PRODUCTS from PRODUCT
group by PRICE_GROUP
order by PRICE_GROUP