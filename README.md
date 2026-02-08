# java-project-61

## Hexlet tests and linter status:
[![Actions Status](https://github.com/Mercer241/java-project-61/workflows/hexlet-check/badge.svg)](https://github.com/Mercer241/java-project-61/actions)

[![Maintainability](https://api.codeclimate.com/v1/badges/ВАШ_КОД/maintainability)](https://codeclimate.com/github/Mercer241/java-project-61/maintainability)
[![Test Coverage](https://api.codeclimate.com/v1/badges/ВАШ_КОД/test_coverage)](https://codeclimate.com/github/Mercer241/java-project-61/test_coverage)

## SonarCloud Status
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Mercer241_java-project-61&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Mercer241_java-project-61)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Mercer241_java-project-61&metric=bugs)](https://sonarcloud.io/summary/new_code?id=Mercer241_java-project-61)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Mercer241_java-project-61&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=Mercer241_java-project-61)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=Mercer241_java-project-61&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=Mercer241_java-project-61)

## Описание
Проект "Игры разума" — набор из 6 консольных игр для тренировки логики.

## Установка и запуск
```bash
git clone https://github.com/Mercer241/java-project-61.git
cd java-project-61/app
./gradlew run
```

## Игры
1. **Even** — проверка на чётность
2. **Calc** — арифметические операции
3. **GCD** — наибольший общий делитель
4. **Progression** — арифметическая прогрессия
5. **Prime** — проверка на простое число

## Примеры запуска игр

### Меню выбора игр
```
$ ./gradlew run
Please enter the game number and press Enter.
1 - Greet
2 - Even
3 - Calc
4 - GCD
5 - Progression
6 - Prime
0 - Exit
Your choice:
```

### Игра "Even" (Проверка на чётность)
```
Your choice: 2
May I have your name? Alex
Hello, Alex!
Answer 'yes' if the number is even, otherwise answer 'no'.
Question: 15
Your answer: no
Correct!
Question: 6
Your answer: yes
Correct!
Question: 7
Your answer: no
Correct!
Congratulations, Alex!
```

### Игра "Calc" (Калькулятор)
```
Your choice: 3
May I have your name? Alex
Hello, Alex!
What is the result of the expression?
Question: 12 * 9
Your answer: 108
Correct!
Question: 17 + 10
Your answer: 27
Correct!
Question: 9 - 11
Your answer: -2
Correct!
Congratulations, Alex!
```

### Игра "GCD" (Наибольший общий делитель)
```
Your choice: 4
May I have your name? Alex
Hello, Alex!
Find the greatest common divisor of given numbers.
Question: 25 50
Your answer: 25
Correct!
Question: 100 52
Your answer: 4
Correct!
Question: 3 9
Your answer: 3
Correct!
Congratulations, Alex!
```

### Игра "Progression" (Арифметическая прогрессия)
```
Your choice: 5
May I have your name? Alex
Hello, Alex!
What number is missing in the progression?
Question: 5 7 9 11 13 .. 17 19 21 23
Your answer: 15
Correct!
Question: 2 5 8 .. 14 17 20 23 26 29
Your answer: 11
Correct!
Question: 14 19 24 29 34 39 44 49 54 ..
Your answer: 59
Correct!
Congratulations, Alex!
```

### Игра "Prime" (Простое ли число?)
```
Your choice: 6
May I have your name? Alex
Hello, Alex!
Answer 'yes' if given number is prime. Otherwise answer 'no'.
Question: 7
Your answer: yes
Correct!
Question: 10
Your answer: no
Correct!
Question: 13
Your answer: yes
Correct!
Congratulations, Alex!
```

## Примеры ошибок

### Ошибка в игре "Even"
```
Question: 15
Your answer: yes
'yes' is wrong answer ;(. Correct answer was 'no'.
Let's try again, Alex!
```

### Ошибка в игре "Calc"
```
Question: 25 * 7
Your answer: 145
'145' is wrong answer ;(. Correct answer was '175'.
Let's try again, Alex!
```

### Ошибка в игре "GCD"
```
Question: 25 50
Your answer: 1
'1' is wrong answer ;(. Correct answer was '25'.
Let's try again, Alex!
```

### Ошибка в игре "Progression"
```
Question: 5 7 9 11 13 .. 17 19 21 23
Your answer: 12
'12' is wrong answer ;(. Correct answer was '15'.
Let's try again, Alex!
```

### Ошибка в игре "Prime"
```
Question: 7
Your answer: no
'no' is wrong answer ;(. Correct answer was 'yes'.
Let's try again, Alex!
```

## Технологии
- Java 17+
- Gradle
- Checkstyle
- GitHub Actions
- SonarCloud

## Автор
Александр Приходько
