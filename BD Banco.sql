CREATE TABLE Usuario(
	nome varchar(50),
    cpf int,
    senha varchar(50),
	PRIMARY KEY(cpf)
);
CREATE TABLE Endereco(
	cidade varchar(50),
    rua varchar(50),
    num int,
    cpfUsuario int,
    PRIMARY KEY(cpfUsuario),
    FOREIGN KEY(cpfUsuario) REFERENCES Usuario(cpf)
);
CREATE TABLE Conta(
	numConta int,
    saldo float,
    agencia int,
    cpfUsuario int,
    PRIMARY KEY(cpfUsuario, numConta),
    FOREIGN KEY(cpfUsuario) REFERENCES Usuario(cpf)
);
CREATE TABLE Cartao(
	numCartao int,
    cvv int,
    limite int,
    numConta int,
    PRIMARY KEY(numConta),
    FOREIGN KEY(numConta) REFERENCES Conta(numConta)
);
Create TABLE Investimento(
	quantia float,
    opcao char,
    rendimento int,
    numConta int,
    PRIMARY KEY(numConta),
    FOREIGN KEY(numConta) REFERENCES Conta(numConta)
);
CREATE TABLE Emprestimo(
	quantia float,
    juros int,
    quantiaPaga int,
    numConta int,
    PRIMARY KEY(numConta),
    FOREIGN KEY(numConta) REFERENCES Conta(numConta)
);
CREATE TABLE Extrato(
	valor float,
    tipo varchar(50),
    usuario varchar(50),
    numConta int,
    PRIMARY KEY(numConta),
    FOREIGN KEY(usuario) REFERENCES Usuario(nome),
    FOREIGN KEY(numConta) REFERENCES Conta(numConta)
);

