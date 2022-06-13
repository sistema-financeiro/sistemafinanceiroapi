-- select * from tb_pessoa;

insert into tb_pessoa (nome, usuario_atualizacao, data_atualizacao, e_ativo) values ('José Quintino', 'USUARIO_SISTEMA', now(), true);
insert into tb_pessoa (nome, usuario_atualizacao, data_atualizacao, e_ativo) values ('Priscilla Mariano', 'USUARIO_SISTEMA', now(), true);
insert into tb_pessoa (nome, usuario_atualizacao, data_atualizacao, e_ativo) values ('Governo do Distrito Federal', 'USUARIO_SISTEMA', now(), true);
insert into tb_pessoa (nome, usuario_atualizacao, data_atualizacao, e_ativo) values ('Banco do Brasil', 'USUARIO_SISTEMA', now(), true);
insert into tb_pessoa (nome, usuario_atualizacao, data_atualizacao, e_ativo) values ('PJ Serviços Contábeis', 'USUARIO_SISTEMA', now(), true);

-- select * from tb_categoria_conta_bancaria;

insert into tb_categoria_conta_bancaria (descricao) values ('Conta Corrente');
insert into tb_categoria_conta_bancaria (descricao) values ('Conta Poupança');
insert into tb_categoria_conta_bancaria (descricao) values ('Conta Salário');
insert into tb_categoria_conta_bancaria (descricao) values ('Conta Investimento');

-- select * from tb_conta_bancaria;

insert into tb_conta_bancaria (id_categoria_conta_bancaria, id_pessoa_instituicao_financeira, id_pessoa_titular_conta_bancaria, data_abertura, data_encerramento, numero_agencia, numero_conta, e_ativo) values (
	(select codigo from tb_categoria_conta_bancaria where descricao like 'Conta Corrente'),
	(select codigo from tb_pessoa where nome like 'Banco do Brasil'),
	(select codigo from tb_pessoa where nome like 'José Quintino'),
	'2021-04-28',
	null,
	'0826-5',
	'71.746-0',
	true
);

insert into tb_conta_bancaria (id_categoria_conta_bancaria, id_pessoa_instituicao_financeira, id_pessoa_titular_conta_bancaria, data_abertura, data_encerramento, numero_agencia, numero_conta, e_ativo) values (
	(select codigo from tb_categoria_conta_bancaria where descricao like 'Conta Poupança'),
	(select codigo from tb_pessoa where nome like 'Banco do Brasil'),
	(select codigo from tb_pessoa where nome like 'José Quintino'),
	'2021-04-28',
	null,
	'',
	'510.071.746-3',
	true
);

-- select * from tb_categoria_despesa;

insert into tb_categoria_despesa (descricao) values ('Despesa Fixa');
insert into tb_categoria_despesa (descricao) values ('Despesa Variável');

-- select * from tb_produto_servico;

insert into tb_produto_servico (descricao) values ('Assessoria de Contabilidade Pessoa Física');
insert into tb_produto_servico (descricao) values ('Assessoria de Contabilidade Pessoa Jurídica');

-- select * from tb_despesa;

insert into tb_despesa (id_pessoa_favorecido, id_categoria_despesa, data_vencimento, data_pagamento, valor_final) values ((select codigo from tb_pessoa where nome like 'PJ Serviços Contábeis'), (select codigo from tb_categoria_despesa where descricao like 'Despesa Fixa'), '2022-06-05', null, 199.0);

-- select * from tb_despesa_produto_servico;

insert into tb_despesa_produto_servico (id_despesa, id_produto_servico, valor_unitario, quantidade) values (1, 1, 199.00, 1);
insert into tb_despesa_produto_servico (id_despesa, id_produto_servico, valor_unitario, quantidade) values (1, 2, 99.00, 1);

