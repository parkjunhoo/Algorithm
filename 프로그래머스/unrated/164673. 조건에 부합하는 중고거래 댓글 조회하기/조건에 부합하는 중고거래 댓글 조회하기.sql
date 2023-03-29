-- 코드를 입력하세요
SELECT board.title, board.board_id , reply.reply_id ,
reply.writer_id , reply.contents , date_format(reply.created_date,'%Y-%m-%d')
from used_goods_board board, used_goods_reply reply
where board.board_id = reply.board_id
and board.created_date like '2022-10%'
order by reply.created_date , board.title;