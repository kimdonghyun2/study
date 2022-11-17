-- 코드를 입력하세요
/*
select fp.product_id,
    fp.product_name,
    fp.price * fo.amount
  from food_product fp,
    food_order fo
 where fp.product_id = fo.product_id
 group by fp.product_id
*/
SELECT 
    fp.product_id,
    fp.product_name,
    fp.price * sum(fo.amount) as 'total_sales'
  from 
    food_product fp,
    food_order fo
where fp.product_id = fo.product_id
  and fo.produce_date like '2022-05%'
group by fp.product_id
order by total_sales desc, product_id asc;