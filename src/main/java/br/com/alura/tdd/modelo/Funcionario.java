package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {

	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;

	public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

    //reajustar o salário, pegar o salário atual e somar com o valor do reajuste
	public void reajustarSalario(BigDecimal reajuste) {
		this.salario = this.salario.add(reajuste);
		/*caso tenha problema com arredodamento
		inserir: .setScale(2, RoundingMode.HALF_UP)
		 */
    }
}
