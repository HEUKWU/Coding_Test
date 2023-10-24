-- 코드를 입력하세요
SELECT hour(DATETIME) HOUR, count(*) COUNT from ANIMAL_OUTS
group by HOUR having hour >= 9 and hour <= 19
order by HOUR