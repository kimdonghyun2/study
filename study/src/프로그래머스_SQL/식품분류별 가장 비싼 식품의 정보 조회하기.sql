-- �ڵ带 �Է��ϼ���
SELECT category
    ,price as max_price
    ,product_name
  from food_product
 where 
    category in ("����", "��", "��ġ", "�Ŀ���")
 and 
    price in (select max(price) from food_product group by category)
 order by price desc;

-- select * from food_product;