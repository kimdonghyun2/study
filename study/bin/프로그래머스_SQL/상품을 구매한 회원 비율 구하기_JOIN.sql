-- 코드를 입력하세요
SELECT 
      year(os.sales_date)  as year
    , month(os.sales_date) as month
    , count(distinct os.user_id) as puchased_users
    , round(count(distinct os.user_id) / 
            (select count(user_id) 
             from user_info
             where year(joined) = 2021)
            , 1) as puchased_ratio
  from user_info    ui
    , online_sale   os
 where ui.user_id = os.user_id
   and year(ui.joined) = 2021
 group by year, month
 order by year, month asc;