-- �ڵ带 �Է��ϼ���
SELECT A.ANIMAL_ID
      ,A.ANIMAL_TYPE
      ,A.NAME
  FROM ANIMAL_INS   A
      ,ANIMAL_OUTS  B
 WHERE A.ANIMAL_ID = B.ANIMAL_ID
   AND A.ANIMAL_TYPE = B.ANIMAL_TYPE
   AND A.SEX_UPON_INTAKE LIKE '%Intact%'
   AND (
       B.SEX_UPON_OUTCOME LIKE '%Spayed%'      
       OR
       B.SEX_UPON_OUTCOME LIKE '%Neutered%'      
       )
;