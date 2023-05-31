# Final_2
1. Используя команду cat в терминале операционной системы Linux, создать
два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).

![image](https://github.com/Natalia-Orlova/Final_2/assets/109914840/02ce9111-979b-4f23-ae1d-6b93b56b33a6)

2. Создать директорию, переместить файл туда.

![image](https://github.com/Natalia-Orlova/Final_2/assets/109914840/a7e7d29a-b5b9-4453-886f-aa8ef838289e)

3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
из этого репозитория.

Для установки репозитория MySQL переходим на страницу https://dev.mysql.com/downloads/, где переходим в раздел MySQL APT Repository и копируем ссылку на последний пакет. Далее переходим в терминал и выполняем следующие команды:

![image](https://github.com/Natalia-Orlova/Final_2/assets/109914840/173f54c1-8ad5-4e8e-903b-39ede762c48f)

Устанавливаем пакет с помощью команды sudo dpkg -i mysql-apt-config_0.8.25-1_all.deb:

![image](https://github.com/Natalia-Orlova/Final_2/assets/109914840/1cf3afc6-e0ed-4698-a8d5-ff0d2a72d48d)

Далее устанавливаем из репозитория MySQL-server: 

![image](https://github.com/Natalia-Orlova/Final_2/assets/109914840/3c4e6fba-d1a4-440b-9b36-be311219efde)

Задаем пароль для пользователя root в процессе установки пакета, а затем выбираем плагин аутентификации по умолчанию (Strong Password Encryption).

![image](https://github.com/Natalia-Orlova/Final_2/assets/109914840/ea5faf2e-b152-41e7-9e10-7650dd6d731f)

4. Установить и удалить deb-пакет с помощью dpkg.

wget https://download.virtualbox.org/virtualbox/7.0.6/virtualbox-7.0_7.0.6-155176~Ubuntu~jammy_amd64.deb

![image](https://github.com/Natalia-Orlova/Final_2/assets/109914840/4c3fcc8e-d5e5-4af1-9c50-65c258ceb50b)

ls -la проверяем наличие файла с расширением .deb, затем копируем название файла

![image](https://github.com/Natalia-Orlova/Final_2/assets/109914840/1f9fa677-f396-429b-ae05-e589b0ac29ab)

dpkg -i + virtualbox-7.0_7.0.6-155176~Ubuntu~jammy_amd64.deb

![image](https://github.com/Natalia-Orlova/Final_2/assets/109914840/adda2a90-32ef-4f0f-9f38-3a4af9dd946e)

sudo apt -f install команда исправляет сломанные пакеты

![image](https://github.com/Natalia-Orlova/Final_2/assets/109914840/70a7dd8b-b5c8-4e0f-bf65-f8d342d54afd)

cd /etc/apt -> ll -> cd sources.list.d/ -> cat > vb.list вставляем скопированную из инструкции на сайте virtualbox.org строку: 
deb [arch=amd64 signed-by=/usr/share/keyrings/oracle-virtualbox-2016.gpg] https://download.virtualbox.org/virtualbox/debian <mydist> contrib} -> ctrl+d

nano vb.list -> в редакторе изменяем <mydist> на jammy

![image](https://github.com/Natalia-Orlova/Final_2/assets/109914840/8211ff59-9bf6-481c-ab6a-d698e00d742d)

копируем из инструкции команду, которая скачает ключ и установит его в систему: 
wget -O- https://www.virtualbox.org/download/oracle_vbox_2016.asc | sudo gpg --dearmor --yes --output /usr/share/keyrings/oracle-virtualbox-2016.gpg
  
![image](https://github.com/Natalia-Orlova/Final_2/assets/109914840/91562d66-1a61-40f5-9a78-e50959d482a0)

sudo apt update -> sudo apt install virtualbox-7.0  обновляем списки пакетов и устанавливаем virtualbox:
  
![image](https://github.com/Natalia-Orlova/Final_2/assets/109914840/7c419822-254c-4aa5-9f4f-844fd8c3c94d)

sudo dpkg -r virtualbox-7.0 удалили пакет
  
![image](https://github.com/Natalia-Orlova/Final_2/assets/109914840/e0e340ed-8e00-4cf1-9c6a-c5feb87685a8)

5. Выложить историю команд в терминале ubuntu
