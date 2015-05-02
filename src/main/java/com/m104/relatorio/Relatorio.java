package com.m104.relatorio;

import java.io.InputStream;
import java.util.List;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Relatorio {
	
	public void gerar(List<Aluno> alunos) throws JRException{
		
		InputStream font = Relatorio.class.getResourceAsStream("/relatorios/relatorio.jrxml");
		JasperReport jr = JasperCompileManager.compileReport(font);
		JasperPrint print = JasperFillManager.fillReport(jr,null,new JRBeanCollectionDataSource(alunos));
		JasperViewer.viewReport(print, false);
	}

}
