package Moura.core;
import Moura.core.BasePage;
import static Moura.core.DriverFactory.getDriver;

public class BaseLoginPage extends BasePage  {



	public void acessarTelaInicial() {
		getDriver().get("http://177.68.220.125:9020/#/portal/home");
	}

	public void SetEmail(String email) {
		escreveId("Email", email);
	}

	public void SetSenha(String senha) {
		escreveId("Password", senha);
	}

	public void entrar() {
		clicarbotao("btnLogar");
	}

	public void abrirComboBox() {
		abrirComboBox("select2-EscolaId-container");
	}

	public void digitarNomeEscola(String NomeEscola) {
		escreverClassName("select2-search__field", NomeEscola);
	}

	public void setResultadoEscola() {
		selecionarResultadoEscola("select2-results__option--highlighted");
	}

	public void acessarEscola() {
		clicarbotao("btnTrocaEscola");

	}
	
	

}



