package Page.Moura.CadastroUsúario;

import org.openqa.selenium.By;

import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;

import Moura.core.BasePage;


public class CadastroUsúario extends BasePage {
	
	public void ClicarCadastrese () throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.cssSelector(".btn-cadastrarse .btn-moura"));
		Thread.sleep(1000);
		
	}
	
	public void InformeCnpjRevenda(String CNPJ) throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.id("cnpj"));
		Thread.sleep(1000);
		escreveTexto(By.id("cnpj"), CNPJ);
		Thread.sleep(1000);
		
	}
	
	
	public void Informecpf ( String CPF) throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.id("cpf"));
		Thread.sleep(1000);
		escreveTexto(By.id("cpf"), CPF);
		Thread.sleep(1000);
		
	}
		
	
	
	public void nomecompleto () throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.id("nome"));
		Thread.sleep(1000);
		escreveTexto(By.id("nome"), geraNomeAleatorio());
		Thread.sleep(1000);
		
	}
		
	public void Email() throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.id("email"));
		Thread.sleep(1000);
		escreveTexto(By.id("email"), GeraEmailAleatorio());
		Thread.sleep(1000);
	}
	
	
	public void CEP() throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.id("cep"));
		Thread.sleep(1000);
		escreveTexto(By.id("cep"), GeraCEP());
		Thread.sleep(1000);
	}
	
	public void Numero () throws InterruptedException {
		
		
	}
	
	
	
	
	
	}



