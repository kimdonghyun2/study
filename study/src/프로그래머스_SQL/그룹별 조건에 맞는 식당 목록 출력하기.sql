with A as(
    select member_id
         , count(member_id) as cnt
    from rest_review
    group by member_id
)
SELECT
     mp.member_name
    ,rr.review_text
    ,date_format(rr.review_date, '%Y-%m-%d')
  from 
    member_profile mp,
    rest_review rr,
    A
 where mp.member_id = rr.member_id
   and A.member_id = mp.member_id
   and A.cnt = (select MAX(A.cnt) from A)
 order by 1,3