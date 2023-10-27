-- 코드를 입력하세요
SELECT substring(PRODUCT_CODE, 1, 2) CATEGORY, count(*) PRODUCTS from PRODUCT
group by CATEGORY
order by CATEGORY