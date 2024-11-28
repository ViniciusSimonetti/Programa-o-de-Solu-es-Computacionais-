  
-- Passo Visualizar os bancos de dados existentes
SHOW DATABASES;
DROP DATABASE meubanco;
-- Passo Criar o banco de dados
CREATE DATABASE MeuBanco;

-- Passo Selecionar o banco de dados criado
USE MeuBanco;

-- Passo Criar a tabela PESSOAL
CREATE TABLE PESSOAL (
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    CPF CHAR(11) NOT NULL,
    RG CHAR(9) NOT NULL,
    Nome VARCHAR(100) NOT NULL,
    DataNascimento DATE NOT NULL,
    PRIMARY KEY (Id),
    UNIQUE (CPF),
    UNIQUE (RG)
) ENGINE=InnoDB;
DESCRIBE PESSOAL;

-- Passo Criar a tabela ACADEMICO
CREATE TABLE ACADEMICO (
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    RA CHAR(15) NOT NULL,
    Nome VARCHAR(100) NOT NULL,
    NotaTeoria DECIMAL(5,2) NOT NULL,
    NotaLab DECIMAL(5,2) NOT NULL,
    Media DECIMAL(5,2) GENERATED ALWAYS AS ((NotaTeoria + NotaLab) / 2) STORED,
    CPF CHAR(11) NOT NULL,
    PRIMARY KEY (Id),
    FOREIGN KEY (CPF) REFERENCES PESSOAL(CPF)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB;
DESCRIBE ACADEMICO;

-- Passo Inserir uma linha de dados na tabela PESSOAL
INSERT INTO PESSOAL (CPF, RG, Nome, DataNascimento)
VALUES ('12345678901', '123456789', 'João Silva', '1990-01-15');

-- Inserir várias linhas de dados na tabela PESSOAL
INSERT INTO PESSOAL (CPF, RG, Nome, DataNascimento)
VALUES
('98765432109', '987654321', 'Maria Oliveira', '1995-06-20'),
('45678912345', '456789123', 'Ana Santos', '1992-03-10'),
('32165498701', '321654987', 'Carlos Souza', '1985-07-25');

-- Recuperar todos os dados da tabela PESSOAL
SELECT * FROM PESSOAL;

-- Recuperar todos os dados da tabela PESSOAL em ordem alfabética
SELECT * FROM PESSOAL ORDER BY Nome;
-- Recuperar os dados das pessoas sem RG
SELECT Id, Nome FROM PESSOAL WHERE RG IS NULL;

-- Recuperar os dados das pessoas com RG atribuído
SELECT Id, Nome FROM PESSOAL WHERE RG IS NOT NULL;

-- Recuperar os dados das pessoas cujo nome começa com "A"
SELECT * FROM PESSOAL WHERE Nome LIKE 'A%';


-- Recuperar os dados das pessoas cujo sobrenome é "Santos"
SELECT * FROM PESSOAL WHERE Nome LIKE '%Santos';

-- Atualizar o RG de uma pessoa específica
UPDATE PESSOAL SET RG = '999888777' WHERE Id = 2;

-- Excluir uma pessoa pelo ID
DELETE FROM PESSOAL WHERE Id = 4;

-- Inserir uma linha de dados na tabela ACADEMICO
INSERT INTO ACADEMICO (RA, Nome, NotaTeoria, NotaLab, CPF)
VALUES ('RA001', 'João Silva', 8.5, 7.0, '12345678901');

-- Inserir várias linhas na tabela ACADEMICO
INSERT INTO ACADEMICO (RA, Nome, NotaTeoria, NotaLab, CPF)
VALUES
('RA002', 'Maria Oliveira', 9.0, 8.5, '98765432109'),
('RA003', 'Ana Santos', 7.5, 8.0, '45678912345');

-- Recuperar os dados de alunos com RA começando com "RA00"
SELECT * FROM ACADEMICO WHERE RA LIKE 'RA00%';


-- Atualizar a NotaLab de um aluno
UPDATE ACADEMICO SET NotaLab = 9.0 WHERE Id = 3;

-- Excluir um registro de aluno
DELETE FROM ACADEMICO WHERE Id = 2;

-- Consultar a contagem de alunos cadastrados
SELECT COUNT(*) AS TotalAlunos FROM ACADEMICO;

-- Consultar as médias de notas (maior, menor, média geral)
SELECT MAX(Media) AS Maior, AVG(Media) AS MediaGeral, MIN(Media) AS Menor FROM ACADEMICO;

-- Consultar a relação entre PESSOAL e ACADEMICO
SELECT * FROM PESSOAL p INNER JOIN ACADEMICO a ON p.CPF = a.CPF;

-- Consultar apenas algumas colunas da relação
SELECT p.Nome, a.RA, a.Media FROM PESSOAL p INNER JOIN ACADEMICO a ON p.CPF = a.CPF;

-- Usar LEFT JOIN para ver todos os dados de PESSOAL com possíveis correspondências em ACADEMICO
SELECT * FROM PESSOAL p LEFT JOIN ACADEMICO a ON p.CPF = a.CPF;

-- Usar RIGHT JOIN para o mesmo resultado, mas priorizando ACADEMICO
SELECT * FROM ACADEMICO a RIGHT JOIN PESSOAL p ON a.CPF = p.CPF;

--  Subconsulta para encontrar a maior média
SELECT Nome, Media FROM ACADEMICO WHERE Media = (SELECT MAX(Media) FROM ACADEMICO);

--  INNER JOIN vs LEFT JOIN
SELECT * FROM PESSOAL p INNER JOIN ACADEMICO a ON p.CPF = a.CPF;
SELECT * FROM PESSOAL p LEFT JOIN ACADEMICO a ON p.CPF = a.CPF;

--  LEFT JOIN vs RIGHT JOIN
SELECT * FROM PESSOAL p LEFT JOIN ACADEMICO a ON p.CPF = a.CPF;
SELECT * FROM ACADEMICO a RIGHT JOIN PESSOAL p ON a.CPF = p.CPF;

--  Sub-Query para maior valor
SELECT p.Nome, a.RA, a.Media FROM PESSOAL p INNER JOIN ACADEMICO a ON p.CPF = a.CPF 
WHERE a.Media = (SELECT MAX(Media) FROM ACADEMICO);
