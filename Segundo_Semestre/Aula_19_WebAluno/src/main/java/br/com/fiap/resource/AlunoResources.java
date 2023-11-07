package br.com.fiap.resource;

import java.awt.PageAttributes.MediaType;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.fiap.beans.Aluno;
import br.com.fiap.bo.AlunoBO;

@Path("/aluno")
public class AlunoResources {

//	//Teste
//	@GET
//	@Produces(MediaType.TEX)
//	public String buscar() {
//		return "Teste Front";
//	}
	
	
	private AlunoBO alunoBO = new AlunoBO();
	
	public ArrayList<Aluno> selecionar() throws ClassNotFoundException, SQLException{
		return (ArrayList<Aluno>) alunoBO.selecionarBO();
	}
	
	
	
}
