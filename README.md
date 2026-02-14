# Игры разума (Mind Games)

## Статус проекта
[![Actions Status](https://github.com/Mercer241/java-project-61/workflows/hexlet-check/badge.svg)](https://github.com/Mercer241/java-project-61/actions)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=Mercer241_java-project-61&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=Mercer241_java-project-61)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=Mercer241_java-project-61&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=Mercer241_java-project-61)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=Mercer241_java-project-61&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=Mercer241_java-project-61)

## О проекте

**«Игры разума»** — это набор консольных игр, разработанных в рамках первого проекта на Хекслете. Проект направлен на изучение основ Java, работы с Gradle, настройки CI/CD и написания чистого кода.

Каждая игра предлагает пользователю ответить на три вопроса. За каждый правильный ответ начисляется балл. Три правильных ответа подряд считаются победой. Неправильный ответ завершает игру и предлагает попробовать снова.

### Список игр

| Номер | Игра | Описание |
|-------|------|----------|
| 1 | **Greet** | Приветствие и знакомство с игроком |
| 2 | **Even** | Определение четного числа (ответ "yes"/"no") |
| 3 | **Calc** | Решение арифметических выражений |
| 4 | **GCD** | Поиск наибольшего общего делителя |
| 5 | **Progression** | Поиск пропущенного числа в арифметической прогрессии |
| 6 | **Prime** | Определение простого числа (ответ "yes"/"no") |

## Технологии

- Java 17
- Gradle 8.14
- Checkstyle
- SonarQube / SonarCloud
- GitHub Actions (CI/CD)

## Установка и запуск

### Требования
- Java 17 или выше
- Gradle (или использование Gradle Wrapper)

### Сборка проекта

1. Клонируйте репозиторий:
   ```bash
   git clone https://github.com/Mercer241/java-project-61.git

2. Перейдите в директорию проекта:
   cd java-project-61/app

3. Соберите проект:
   ./gradlew clean build

## Запуск игр

Способ 1: Запуск JAR-файла (рекомендуется для интерактивной игры)
- java -jar build/libs/app.jar

Способ 2: Запуск через Gradle (без возможности ввода с клавиатуры)
- ./gradlew run

## Как играть

После запуска появится меню:

Please enter the game number and press Enter.

1 - Greet

2 - Even

3 - Calc

4 - GCD

5 - Progression

6 - Prime

0 - Exit

Your choice:

Введите номер игры и следуйте инструкциям на экране.

## Пример игры
### Игра «Калькулятор»:

Welcome to the Brain Games!

May I have your name? John

Hello, John!

What is the result of the expression?

Question: 5 + 3

Your answer: 8

Correct!

Question: 10 - 4

Your answer: 6

Correct!

Question: 7 * 2

Your answer: 14

Correct!

Congratulations, John!

## Структура проекта
app/ 

├── src/main/java/hexlet/code/

│   ├── games/           #Логика всех игр

│   ├── App.java         # Точка входа в приложение

│   ├── Cli.java         # Приветствие и ввод имени

│   ├── Engine.java      # Игровой движок (логика вопросов-ответов)

│   └── Utils.java       # Вспомогательные функции

├── build.gradle.kts     # Конфигурация Gradle

└── README.md            # Документация проекта

## Разработка
### Проверка стиля кода
./gradlew checkstyleMain

### Запуск тестов (если есть)
./gradlew test

### Анализ кода через SonarQube
./gradlew sonar 
