-- �ڵ带 �Է��ϼ���
SELECT cart_id
  from cart_products
 
 where name in ("Yogurt","Milk")
 group by cart_id
 having count(distinct name)=2