-- 1. Cria o Banco de Dados (Schema)
CREATE SCHEMA IF NOT EXISTS `loja` DEFAULT CHARACTER SET utf8;
-- 2. Acessa o banco de dados
USE `loja`;

-- 2. Criar a Tabela exatamente com os campos pedidos
CREATE TABLE IF NOT EXISTS `PRODUTO` (
  `id_produto` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `valor` DECIMAL(10,2) NOT NULL,
  `quantidade` INT NOT NULL,
  PRIMARY KEY (`id_produto`)
) ENGINE = InnoDB;

