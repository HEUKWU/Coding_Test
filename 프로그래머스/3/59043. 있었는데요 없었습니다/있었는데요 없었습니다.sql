-- 코드를 입력하세요
SELECT i.ANIMAL_ID, i.NAME from ANIMAL_INS i
inner join ANIMAL_OUTS o on i.ANIMAL_ID = o.ANIMAL_ID
where o.DATETIME < i.DATETIME
order by i.DATETIME