CREATE DATABASE db_saaspt;

CREATE TABLE client (
                        id_client BIGINT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(50)
);

CREATE TABLE note (
                      id_note BIGINT AUTO_INCREMENT PRIMARY KEY,
                      id_client BIGINT,
                      title VARCHAR(200),
                      createdAt DATE
);

ALTER TABLE note
    ADD CONSTRAINT fk_note_client
        FOREIGN KEY note(id_client) REFERENCES client(id_client);


INSERT INTO client (name) VALUES
                              ('Carlos Mendoza'),
                              ('Laura Gómez'),
                              ('Andrés Torres'),
                              ('Mariana Rojas'),
                              ('Felipe Castro');

INSERT INTO note (id_client, title, createdAt) VALUES
-- Notas Carlos (id 1)
(1, 'Primera reunión con cliente', '2026-02-01'),
(1, 'Seguimiento propuesta comercial', '2026-02-05'),

-- Notas Laura (id 2)
(2, 'Entrega de documentos legales', '2026-01-20'),
(2, 'Revisión contrato', '2026-02-02'),

-- Notas Andrés (id 3)
(3, 'Plan estratégico Q1', '2026-01-15'),

-- Notas Mariana (id 4)
(4, 'Análisis financiero anual', '2026-02-03'),
(4, 'Ajuste presupuesto marketing', '2026-02-07'),

-- Notas Felipe (id 5)
(5, 'Reunión técnica backend', '2026-02-04');
