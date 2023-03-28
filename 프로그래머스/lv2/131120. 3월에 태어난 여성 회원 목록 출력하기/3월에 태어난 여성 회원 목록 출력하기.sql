-- 코드를 입력하세요
SELECT member_id MEMBER_ID, member_name MEMBER_NAME, gender GENDER, date_format(date_of_birth,'%Y-%m-%d') DATE_OF_BIRTH
from member_profile
where month(date_of_birth) = '03'
and gender = 'W'
and tlno is not null
order by member_id;