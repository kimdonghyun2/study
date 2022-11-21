-- 코드를 입력하세요
SELECT year(sales_date)  as year
    , month(sales_date)  as month
    , ui.gender          as gender
    , count(distinct os.user_id) as users
  from user_info    ui
    , online_sale   os
 where ui.user_id = os.user_id
   and ui.gender is not null
 group by year, month, gender
 order by year, month, gender asc;