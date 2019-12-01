USE db_loja;


SELECT * FROM tb_cliente;


SELECT nm_cliente, dt_nascimento_cliente FROM  tb_cliente
WHERE dt_nascimento_cliente BETWEEN '1989-01-01' AND '1995-01-01'
AND nm_sexo_cliente = 'Feminino'
AND nm_cliente LIKE 'GIS%'
ORDER BY 2;


SELECT COUNT(nm_cliente) AS 'QTDE USUARIOS MULHER' FROM  tb_cliente
WHERE dt_nascimento_cliente BETWEEN '1989-01-01' AND '1995-01-01'
AND nm_sexo_cliente = 'Feminino'
AND nm_cliente LIKE 'GIS%';


