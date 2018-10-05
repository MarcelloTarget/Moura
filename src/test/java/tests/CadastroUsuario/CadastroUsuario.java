package tests.CadastroUsuario;

import Moura.core.LoginBaseTest;
import org.junit.Test;
import Page.Moura.CadastroUsúario.CadastroUsúario;




public class CadastroUsuario extends LoginBaseTest {
	
	CadastroUsúario page = new CadastroUsúario();
	
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
