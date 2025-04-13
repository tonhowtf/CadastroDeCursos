-- V2: Migrations para adicionar a coluna de RANK na tabela de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN horas int;