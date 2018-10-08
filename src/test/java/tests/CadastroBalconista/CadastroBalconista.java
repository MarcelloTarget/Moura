package tests.CadastroBalconista;

import Moura.core.LoginBaseTest;
import Page.Moura.CadastroBalconista.CadastroBalconistaPage;


import org.junit.Test;




public class CadastroBalconista extends LoginBaseTest {
	
	CadastroBalconistaPage page = new CadastroBalconistaPage();
	
	@Test
	
	public void DeveCadastrarNovousuariobalconista() throws InterruptedException {
		
		page.ClicarCadastrese();
		page.InformeCnpjRevenda("46210258000466");
		page.Informecpf();
		page.nomecompleto();
		page.Email();
		page.Tempo(2000);
		page.CEP();
		page.RolarPaginaPageDown();
		page.Numero();
		page.estado();
		page.Telefone();
		page.celular();
		page.sexo();
		page.Data();
		page.senha();
		page.RolarPaginaPageDown();
		page.SelecionarCargo();
		page.Termo();
		page.Botaoenviar();
		
	}

}
