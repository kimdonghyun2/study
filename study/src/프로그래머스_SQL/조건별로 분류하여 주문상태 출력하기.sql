-- �ڵ带 �Է��ϼ���
SELECT order_id,
    product_id,
    date_format(out_date, '%Y-%m-%d'),
    (case 
        when out_date <= 20220501 then '���Ϸ�'
        when out_date is null then '������'
        else '�����'
    end) as '�����'
  from food_order
  order by order_id asc;