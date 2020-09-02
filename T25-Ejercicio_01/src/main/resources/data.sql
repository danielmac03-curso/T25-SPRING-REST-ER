DROP TABLE IF EXISTS articulos;
DROP TABLE IF EXISTS fabricantes;

CREATE TABLE fabricantes(
    id bigint AUTO_INCREMENT PRIMARY KEY,
    nombre nvarchar(100) not null
);

CREATE TABLE articulos(
    id bigint AUTO_INCREMENT PRIMARY KEY,
    nombre nvarchar(100) not null,
    precio int not null,
    fabricante int not null,
    FOREIGN KEY (fabricante) REFERENCES fabricantes(id)
);

INSERT INTO fabricantes (nombre) VALUES
('Acer'),
('HP'),
('Lenovo');

INSERT INTO articulos (nombre, precio, fabricante) VALUES 
('Bateria A', 25, 1),
('Bateria B', 30, 3),
('Bateria C', 27, 2);