CREATE TABLE IF NOT EXISTS groups (
                                      id SERIAL PRIMARY KEY,
                                      name NVARCHAR(10) UNIQUE NOT NULL CHECK(name <> ''),
    year INT NOT NULL CHECK(year BETWEEN 1 AND 5),
    department_id INT NOT NULL REFERENCES departments(id)
    );

CREATE TABLE IF NOT EXISTS subjects (
                                        id SERIAL PRIMARY KEY,
                                        name NVARCHAR(100) UNIQUE NOT NULL CHECK(name <> '')
    );

CREATE TABLE IF NOT EXISTS teachers (
                                        id SERIAL PRIMARY KEY,
                                        name NVARCHAR(50) NOT NULL CHECK(name <> ''),
    salary MONEY NOT NULL CHECK(salary > 0),
    surname NVARCHAR(50) NOT NULL CHECK(surname <> '')
    );