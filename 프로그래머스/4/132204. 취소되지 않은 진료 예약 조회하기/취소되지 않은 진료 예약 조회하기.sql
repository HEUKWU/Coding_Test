-- 코드를 입력하세요
SELECT a.apnt_no, p.pt_name, p.pt_no, a.mcdp_cd, d.dr_name, a.apnt_ymd
from doctor d 
inner join appointment a
on d.dr_id = a.mddr_id
inner join patient p
on a.pt_no = p.pt_no
where d.mcdp_cd = 'CS'
and a.apnt_ymd like '2022-04-13%'
and a.apnt_cncl_yn = 'N'
order by a.apnt_ymd