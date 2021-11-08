package l1_testBanco;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Conta {

	private int numConta = 20215511;
	private int numBanco, numAgencia;
	private String nomeAgencia, nomeBanco, tipoConta;	
	private int chooseBank;
	private int chooseType;
	private double saldo, valSaq, valDep;
	
	Scanner scan = new Scanner(System.in);
	
	// Getters and Setters
	

	
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}

	public int getNumBanco() {
		return numBanco;
	}

	public void setNumBanco(int numBanco) {
		this.numBanco = numBanco;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public int getChooseBank() {
		return chooseBank;
	}

	public void setChooseBank(int chooseBank) {
		this.chooseBank = chooseBank;
	}

	public int getChooseType() {
		return chooseType;
	}

	public void setChooseType(int chooseType) {
		this.chooseType = chooseType;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getValSaq() {
		return valSaq;
	}

	public void setValSaq(double valSaq) {
		this.valSaq = valSaq;
	}

	public double getValDep() {
		return valDep;
	}

	public void setValDep(double valDep) {
		this.valDep = valDep;
	}

	public void abrir () {
		
		System.out.println("Bem-vindo ao Tonnybank 24hs");
		System.out.println("Digite 1 para Banco 1 \nDigite 2 para banco 2 \nDigite 3 para banco 3");
		this.setChooseBank(scan.nextInt());
		if (chooseBank == 1) {
			this.setNomeBanco("banco 1");
			this.setNumBanco(101);	
		}else if (chooseBank == 2) {
			this.setNomeBanco("banco 2");
			this.setNumBanco(102);	
		}else if (chooseBank == 3) {
			this.setNomeBanco("banco 3");
			this.setNumBanco(103);	
		}else {
			System.out.println("Banco inexistente");
		}
		
		System.out.println("Digite 1 para conta-corrente \nDigite 2 para conta-poupança \nDigite 3 para conta conjunta");
		this.setChooseType(scan.nextInt());
		if (chooseType == 1) {
			this.setTipoConta("Corrente");
		}else if (chooseType == 2) {
			this.setTipoConta("Poupança");
		}else if (chooseType == 3) {
			this.setTipoConta("Conjunta");
		}else {
			this.setTipoConta("Encerrada");
		}
		
		System.out.println("Digite 1 para Agencia 111  \nDigite 2 para Agencia 222 \nDigite 3 para Agencia 333");
		int chooseAgencia = scan.nextInt();
		if (chooseAgencia == 1) {
			this.setNumAgencia(111);
		}else if (chooseType == 2) {
			this.setNumAgencia(222);
		}else if (chooseType == 3) {
			this.setNumAgencia(333);
		}else {
			this.setTipoConta("Agencia invalida!!!");
		}
		
		numConta += 1;
		this.setSaldo(0);
		
		System.out.println("Sua conta foi criada com sucesso");
		
		check();
		
		
	}
	
	public void check() {
		
		if(this.saldo < 0) {
			this.setTipoConta("Encerrada");
		System.out.println("Esta conta foi e ENCERRADA por saldo negativo");
	}else {
		System.out.println("Conta: "+ this.getNumConta() + "\nAgência:"+ this.getNumAgencia()+ "\nSaldo atual:"+ this.getSaldo());
		System.out.println("Horario da verificação"+ LocalDateTime.now());
	}
	}
	
	public void creditar() {
		if (tipoConta != "Encerrada") {
			System.out.println("Digite o valor que deseja DEPOSITAR:");
			this.setSaldo(this.saldo += scan.nextDouble());
			System.out.println("Deposito efetualdo com sucesso!!! \nVerificando saldo...");
			check();
		}else {
			System.out.println("Esta conta foi encerrada por Saldo negativo");
		}		
	}
	
	public void debitar() {
		if (tipoConta != "Encerrada") {
			System.out.println("Digite o valor que deseja RETIRAR:");
			this.setSaldo(this.saldo -= scan.nextDouble());
			System.out.println("Saque efetualdo com sucesso!!! \nVerificando saldo...");
			check();
		}else {
			System.out.println("Esta conta foi encerrada por Saldo negativo");
		}		
	}
	
	
//	public void menu() {
//		int opt = -1;
//		
//		do {
//		System.out.println("\nSelecione uma ação \n**********************" );
//		
//		System.out.println("Abrir uma conta digite 1 \nConsultar Saldo digite 2 \nDepositar digite 3 \nSaque digite 4 \nPARA SAIR 0");
//		opt = scan.nextInt();
//		
//		
//		switch(opt) {
//		case 1: abrir();
//		break;
//		
//		case 2: check();
//		break;
//		
//		case 3: creditar();
//		break;
//		
//		case 4: debitar();
//		break;
//		
//		default: break;			
//		}
//		
//		}while(opt != 0);
//	}
	
	}



