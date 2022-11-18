-- �ڵ带 �Է��ϼ���
SELECT ri.rest_id
    ,ri.rest_name
    ,ri.food_type
    ,ri.favorites
    ,ri.address
    ,round(sum(rr.review_score) / count(rr.review_score), 2) as score
 from rest_info     ri
    , rest_review   rr
where ri.rest_id = rr.rest_id
  and ri.address like '����%'
group by rest_id
order by score desc, favorites desc;