DROP TABLE IF EXISTS empleados;
DROP TABLE IF EXISTS departamentos;

CREATE TABLE departamentos(
    id bigint AUTO_INCREMENT PRIMARY KEY,
    nombre nvarchar(100) not null,
    presupuesto int not null
);

CREATE TABLE empleados(
    id bigint AUTO_INCREMENT PRIMARY KEY,
    nombre nvarchar(100) not null,
    apellidos nvarchar(255) not null,
    departamento int not null,
    FOREIGN KEY (departamento) REFERENCES departamentos(id)
);

INSERT INTO departamentos (nombre, presupuesto) VALUES
('Departamento 1', '20000'),
('Departamentos 2', '30000'),
('Departamento 3', '25000');

INSERT INTO empleados (nombre, apellidos, departamento) VALUES 
('Marc', 'Fernandez', 1),
('Raul', 'García', 3),
('Laura', 'Hernandez', 2);