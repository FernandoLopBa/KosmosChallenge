DROP TABLE IF EXISTS citas;
DROP TABLE IF EXISTS doctores;
DROP TABLE IF EXISTS consultorios;
DROP TYPE IS EXISTS esp;

CREATE TYPE esp AS ENUM('Anestesiología', 'Anatomía Patológica', 'Cardiología', 'Pediatría', 'General', 'Cirugía Plástica', 'Dermatología');
CREATE TABLE doctores (
	id_doctor SERIAL PRIMARY KEY,
	nombre VARCHAR(64) NOT NULL,
	apellido_paterno VARCHAR(64) NOT NULL,
	apellido_materno VARCHAR(64) NOT NULL,
	especialidad esp NOT NULL
);

CREATE TABLE consultorios (
	id_consultorio SERIAL PRIMARY KEY,
	numero_consultorio INT NOT NULL,
	piso INT NOT NULL,
	UNIQUE(numero_consultorio, piso)
);
