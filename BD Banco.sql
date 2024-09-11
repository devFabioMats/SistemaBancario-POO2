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
    cpfUsuario int,
	FOREIGN KEY(cpfUsuario, numConta) REFERENCES Conta(cpfUsuario, numConta),
    PRIMARY KEY(numCartao)
);
Create TABLE Investimento(
	quantia float,
    opcao varchar(25),
    rendimento float,
    numConta int,
    cpfUsuario int,
    FOREIGN KEY(cpfUsuario, numConta) REFERENCES Conta(cpfUsuario, numConta)
);
CREATE TABLE Emprestimo(
	quantia float,
    juros int,
    quantiaPaga int,
    numConta int,
    cpfUsuario int,
    FOREIGN KEY(cpfUsuario, numConta) REFERENCES Conta(cpfUsuario, numConta)
);
CREATE TABLE Extrato(
	valor float,
    tipo varchar(50),
    numConta int,
    cpfUsuario int,
    FOREIGN KEY(cpfUsuario, numConta) REFERENCES Conta(cpfUsuario, numConta)
);


