SELECT * FROM (SELECT V.*, ROWNUM AS RNUM FROM (SELECT * FROM (SELECT * FROM MEMBER_TRADE
WHERE ID = 'MENTOR01'
ORDER BY TRADE_NO DESC)V)V)
WHERE RNUM BETWEEN = 1 AND 3;



SELECT * FROM (SELECT V.*, ROWNUM AS RNUM FROM (SELECT * FROM (SELECT * FROM MEMBER_TRADE
WHERE ID = #{id}
ORDER BY TRADE_NO DESC))V)
WHERE RNUM BETWEEN #{cPage} AND #{numPerPage}





SELECT * FROM (SELECT * FROM MEMBER_TRADE WHERE ID = 'MENTOR01' ORDER BY TRADE_NO DESC)

SELECT * FROM (SELECT V.*, ROWNUM AS RNUM FROM (SELECT * FROM (SELECT * FROM MEMBER_TRADE WHERE ID = 'MENTOR01' ORDER BY TRADE_NO DESC))V)WHERE RNUM BETWEEN  1 AND 3;     





SELECT * FROM MEMBER_TRADE WHERE ID = 'MENTOR01'

SELECT * FROM (SELECT * FROM MEMBER_TRADE WHERE ID = 'MENTOR01' ORDER BY TRADE_NO DESC