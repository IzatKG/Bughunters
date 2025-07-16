# 🐛 BugHunters

**BugHunters** - это образовательный Java проект, демонстрирующий различные концепции программирования, включая автоматизированное тестирование с использованием JUnit 5, Allure отчетов и WireMock для мокирования API.

## 📋 Содержание

- [Описание проекта](#описание-проекта)
- [Технологии](#технологии)
- [Структура проекта](#структура-проекта)
- [Установка и запуск](#установка-и-запуск)
- [Использование](#использование)
- [Тестирование](#тестирование)
- [Docker](#docker)
- [Структура кода](#структура-кода)

## 🎯 Описание проекта

BugHunters - это комплексный проект для изучения Java программирования, который включает:

- **Основы Java**: переменные, циклы, методы, ООП
- **Коллекции**: List, Set, Map, LinkedList
- **Enum'ы**: простые и сложные перечисления
- **Исключения**: обработка ошибок
- **Автоматизированное тестирование**: JUnit 5, Allure отчеты
- **API тестирование**: WireMock для мокирования

## 🛠 Технологии

- **Java 17**
- **Gradle 8.4** - система сборки
- **JUnit 5** - фреймворк для тестирования
- **Allure 2.24.0** - генерация отчетов
- **Lombok** - уменьшение boilerplate кода
- **WireMock 3.3.1** - мокирование HTTP API
- **Docker** - контейнеризация

## 📁 Структура проекта

```
BugHunters/
├── src/
│   ├── main/java/
│   │   ├── annotation/          # Аннотации
│   │   ├── arrays/             # Работа с массивами
│   │   ├── collection/         # Коллекции Java
│   │   ├── constructor/        # Конструкторы
│   │   ├── cycles/             # Циклы
│   │   ├── enums/              # Перечисления
│   │   ├── exceptions/         # Обработка исключений
│   │   ├── helpermethods/      # Вспомогательные методы
│   │   ├── hunters/            # Основные классы
│   │   ├── map/                # Работа с Map
│   │   ├── methods/            # Методы
│   │   ├── oop/                # Объектно-ориентированное программирование
│   │   ├── operators/          # Операторы
│   │   ├── streamapi/          # Stream API
│   │   ├── string/             # Работа со строками
│   │   └── stringBuilder/      # StringBuilder
│   └── test/java/
│       ├── CheckEnumsTest.java # Тесты для enum'ов
│       ├── FileTest.java       # Тесты файлов
│       └── WireMockTest.java   # Тесты с WireMock
├── wiremock/
│   ├── mappings/               # WireMock маппинги
│   └── __files/                # Mock данные
├── allure-results/             # Результаты Allure
├── build.gradle               # Конфигурация Gradle
├── docker-compose.yml         # Docker Compose
└── Dockerfile                 # Docker образ
```

## 🚀 Установка и запуск

### Предварительные требования

- Java 17 или выше
- Gradle 8.4 или выше
- Docker (опционально)

### Локальная установка

1. **Клонируйте репозиторий:**
   ```bash
   git clone <repository-url>
   cd BugHunters
   ```

2. **Запустите тесты:**
   ```bash
   ./gradlew test
   ```

3. **Просмотр отчетов Allure:**
   ```bash
   ./gradlew allureServe
   ```

### Запуск с Docker

1. **Запуск всех сервисов:**
   ```bash
   docker-compose up --build
   ```

2. **Только WireMock:**
   ```bash
   docker-compose up wiremock
   ```

## 📖 Использование

### Основные примеры

#### Enum'ы
```java
// Простой enum
Day today = Day.FRIDAY;

// Enum с методами
Season season = Season.SUMMER;
System.out.println(season.getDescription()); // "Hot"
```

#### Коллекции
```java
// Работа с Map
Map<String, Integer> persons = new HashMap<>();
persons.put("Alice", 25);
persons.put("Bob", 30);

// Фильтрация
List<String> filtered = Practice2.filterPersonAge(persons);
```

#### Вспомогательные методы
```java
// Подсчет слов длиннее 5 символов
List<String> words = Arrays.asList("Hello", "World", "Programming");
int count = Util.countWords(words);
```

## 🧪 Тестирование

### Запуск тестов

```bash
# Все тесты
./gradlew test

# Конкретный тест
./gradlew test --tests CheckEnumsTest

# С генерацией отчета
./gradlew test allureReport
```

### Типы тестов

1. **CheckEnumsTest** - тестирование enum'ов
2. **FileTest** - тестирование работы с файлами
3. **WireMockTest** - тестирование API с мокированием

### Allure отчеты

После запуска тестов отчеты доступны в:
- `build/allure-results/` - сырые данные
- `build/reports/allure-report/` - HTML отчет

Для просмотра отчета:
```bash
./gradlew allureServe
```

## 🐳 Docker

### Сервисы

1. **WireMock** (порт 8080)
   - Мокирование HTTP API
   - Конфигурация в `wiremock/mappings/`
   - Mock данные в `wiremock/__files/`

2. **Test Runner**
   - Контейнер для запуска тестов
   - Автоматический запуск при старте

### Конфигурация

```yaml
# docker-compose.yml
services:
  wiremock:
    image: wiremock/wiremock:3.3.1
    ports:
      - "8080:8080"
  
  autotests:
    build: .
    depends_on:
      - wiremock
```

## 📚 Структура кода

### Основные пакеты

- **`annotation/`** - пользовательские аннотации
- **`arrays/`** - работа с массивами и утилиты
- **`collection/`** - примеры использования коллекций
- **`enums/`** - перечисления (Day, Season)
- **`exceptions/`** - обработка исключений
- **`helpermethods/`** - утилитарные методы
- **`map/`** - работа с Map и HashMap
- **`oop/`** - ООП концепции (наследование, полиморфизм)
- **`streamapi/`** - Stream API примеры

### Особенности кода

- **Логирование**: Использование Java Logger в утилитарных методах
- **Null-safety**: Обработка null значений
- **Тестирование**: Покрытие кода unit-тестами
- **Документация**: Подробные комментарии в коде

## 🤝 Вклад в проект

1. Fork репозитория
2. Создайте feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit изменения (`git commit -m 'Add some AmazingFeature'`)
4. Push в branch (`git push origin feature/AmazingFeature`)
5. Откройте Pull Request

## 📄 Лицензия

Этот проект создан в образовательных целях.

## 👨‍💻 Автор

BugHunters Team

---

**Примечание**: Этот проект предназначен для изучения Java программирования и автоматизированного тестирования. Все примеры кода снабжены комментариями для лучшего понимания. 