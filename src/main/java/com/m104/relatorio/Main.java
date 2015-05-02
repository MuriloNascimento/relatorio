package com.m104.relatorio;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRException;

public class Main {

	public static void main(String[] args) {
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno a1 = new Aluno();
		a1.setNome("João");
		a1.setMatricula("1231-23");
		a1.setNota(7.6);
		a1.setFaltas(6);
		
		Aluno a2 = new Aluno();
		a2.setNome("Pedro");
		a2.setMatricula("1231-56");
		a2.setNota(8.3);
		a2.setFaltas(10);
		
		Relatorio relatorio = new Relatorio();
		
		try {
			relatorio.gerar(alunos);
		} catch (JRException e) {
			e.printStackTrace();
		}
		
		
	}

}
