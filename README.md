# Projekt końcowy studiów Java Web Developer
Aplikacja Dziennik Samochodowy

Użytkownik będzie mógł ustawić i zapisać dane swojego samochodu, takie jak
- stan licznika
- pojemność baku
- numer nadwozia VIN
- numer rejestracyjny

oraz dane dotyczące tankowania:
- stan licznika
- ilość zatankowanego paliwa
- rodzaj paliwa 
- cena jednostkowa lub kwotę całkowitą

Dodawanie poszczególnych tankowań, wraz z aktualizacją stanu licznika, pozwoli stworzyć bazę danych na temat użytkowania samochodu oraz kosztów codziennej eksploatacji. W innej zakładce będzie miejsce na dodawanie informacji na temat napraw oraz przeglądów. 
Pozwoli to na stworzenie wykresów, które zobrazują miesięczne i roczne koszty utrzymania samochodu. Dodatkowo użytkownik będzie mógł wyświetlać informacje na temat ilości przejechanych kilometrów. 


# Aplikacja do oceny
Aplikacja działa pod adresem URL: http://localhost:8080/
Przed uruchomieniem należy skonfigurowaś dostęp do bazy danych w pliku application.properties. Przy uruchomieniu aplikacji z wykorzystaniem innego serwera bazodanowego niż PostgreSQL należy dokonać zmian w pliku pom.xml.

Finalnie aplikacja ma podstawową funkcjonalność w postaci przechowaywania w bazie danych rejestru tankowań. Nie udało mi się wstawić wykresów, które zobrazowałby te dane. Będę jednak chciał rozwijać tą aplikację, aby osiągnęła założoną funkcjonalność. 
