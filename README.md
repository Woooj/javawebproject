# simplewebproject
После того, как скачали проект, запустите schema.sql файл(src/resources), чтобы создать бд.
Запускайте Application.java
После запуска сервера заходим по адресу : localhost:8080/
Чтобы изменить данные в файле GreetingController изменяем код :
Info info = new Info();
            info.setInfo("Hello Adik");
            infoMapper.insert(info);
            Вместо "Hello Adik" пишем что-то другое.
     
