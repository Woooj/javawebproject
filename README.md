# simplewebproject
1. Запускаем Application.java
2. Открываем в браузере "localhost:8080/"
   Всё должно прекрасно работать
3. Если хотите изменить данные в базе данных, измените в файле "schema.sql" в строчке 
"INSERT INTO datatable(info) VALUES ('Hello World' );"
значение "Hello World" на что-нибудь другое и перезапустите проект.
Примечание: сервер отправляет клиенту данные в виде JSON объекта, если хотите проверить их, перейдите по ссылке "localhost:8080/main"

