package Moura.core;
import Moura.core.BasePage;
import static Moura.core.DriverFactory.getDriver;

public class BaseLoginPage extends BasePage  {



	public void acessarTelaInicial() {
		getDriver().get("http://201.68.172.120:9020");
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



