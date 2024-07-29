CREATE TABLE book(
    id INT AUTO_INCREMENT UNIQUE PRIMARY KEY NOT NULL,
    title VARCHAR2(255) NOT NULL,
    author VARCHAR2(255),
    release_date DATE NOT NULL
);

CREATE TABLE library_user(
    id INT UNIQUE PRIMARY KEY NOT NULL,
    name VARCHAR2(100) UNIQUE NOT NULL,
    email VARCHAR2(255) NOT NULL
);




INSERT INTO book (title, author, release_date) VALUES
('Crimen y Castigo', 'Fiódor Dostoyevski', '2001-10-16'),
('Cien Años de Soledad', 'Gabriel García Márquez', '1967-06-05'),
('El Principito', 'Antoine de Saint-Exupéry',  '1943-04-06'),
('Don Quijote de la Mancha', 'Miguel de Cervantes', '1605-01-16'),
('1984', 'George Orwell', '1949-06-08');

INSERT INTO library_user (id, name, email) VALUES
    (123,'David Mesa', 'cadmesa@unicauca.edu.co'),
    (012,'Sebastian Martínez', 'jsmesa@unicauca.edu.co');
