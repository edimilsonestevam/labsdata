CREATE DATABASE db_loja;
COMMIT;


USE db_loja;

CREATE TABLE tb_cliente(
	id_cliente INT NOT NULL AUTO_INCREMENT,
    nm_cliente VARCHAR(250) NOT NULL,
    id_cpf_cliente BIGINT(11) NOT NULL,
    nm_sexo_cliente VARCHAR(9) NOT NULL,
    dt_nascimento_cliente DATE NOT NULL,
    nm_notificacao_cliente CHAR(1),
    
    PRIMARY KEY (id_cliente)
);
COMMIT;