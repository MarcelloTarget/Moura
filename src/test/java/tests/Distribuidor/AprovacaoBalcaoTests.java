package tests.Distribuidor;

import org.junit.Test;

import Moura.Logins.LoginDistribuidorTeste;

import Page.DistribuidorPage.AprovacaoBalcao;


public class AprovacaoBalcaoTests extends LoginDistribuidorTeste{ 

	AprovacaoBalcao page = new AprovacaoBalcao();
	
	@Test
	
	public void DeveaprovarNovousuariobalconista() throws InterruptedException {

		page.InformeCNPJ();
		page.informeSenha();
		
		
		
}
}