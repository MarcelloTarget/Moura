package Page.Moura.CadastroBalconista;

import static Moura.core.DriverFactory.getDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Moura.core.BasePage;


public class CadastroBalconistaPage extends BasePage {
	
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
		clicarBotaoBy(By.cssSelector("#buscar-cnpj"));
		Thread.sleep(1000);
	}
	
	
	public void Informecpf () throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.id("cpf"));
		Thread.sleep(1000);
		escreveTexto(By.id("cpf"), geracpf(true));
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
		
		Thread.sleep(3000);
		clicarBotaoBy(By.id("numero"));
		Thread.sleep(1000);
		escreveTexto(By.id("numero"),"914");
		Thread.sleep(1000);
		
	}
	
	public void estado() throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.cssSelector(".select2-selection--single"));
		Thread.sleep(1000);
		clicarBotaoBy(By.cssSelector(".select2-search__field"));
		Thread.sleep(1000);
		escreveTexto(By.cssSelector(".select2-search__field"),"São Paulo");
		Thread.sleep(1000);
		clicarBotaoBy(By.cssSelector(".select2-results"));
		//WebElement Formapg = getDriver().findElement(By.cssSelector(".select2-results__options"));
		//Select comboforma = new Select(Formapg);
		//comboforma.selectByValue("56");
		
	}
	
	public void Telefone () throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.id("telefone"));
		Thread.sleep(1000);
		escreveTexto(By.id("telefone"), Geratelefone());
		Thread.sleep(1000);
	}
	
	
	public void celular() throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.id("celular"));
		Thread.sleep(1000);
		escreveTexto(By.id("celular"), GerarCelularAleatorio());
		Thread.sleep(1000);
		
	}
	
	public void sexo() throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.id("sexo"));
		Thread.sleep(2000);
		WebElement Formapg = getDriver().findElement(By.id("sexo"));
		Select comboforma = new Select(Formapg);
		comboforma.selectByValue("N");
		Thread.sleep(1000);
		
	}
	
	public void Data () throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.id("dataNascimento"));
		Thread.sleep(2000);
		escreveTexto(By.id("dataNascimento"), "09101993");
		Thread.sleep(2000);
	}
	
	public void senha() throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.id("senha"));
		Thread.sleep(2000);
		escreveTexto(By.id("senha"), "123456");
		Thread.sleep(2000);
		
	}
	
	public void SelecionarCargo() throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.cssSelector(".radio .radio-inline:nth-of-type(2) .cadastro_cargo"));
		Thread.sleep(2000);
		
	}
	
	public void Termo () throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.cssSelector("#regulamento"));
		Thread.sleep(2000);
		
	}
	
	public void Botaoenviar () throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.cssSelector("#enviar-cadastro-usuario"));
		Thread.sleep(2000);
		
	}
	
	public void RolarPagina() {
		((JavascriptExecutor) getDriver()).executeScript("scroll(0,1200)");
	}
	
	public void RolarPaginaPageDown() {

		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		} catch (AWTException ex) {
			throw new WebDriverException("VK_PAGE_DOWN", ex);

		}
	}

	public void RolarPaginaPageUp() {

		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);
		
		} catch (AWTException ex) {
			throw new WebDriverException("VK_PAGE_UP", ex);

		}
	}
	 
public void Tempo (int Tempo) throws InterruptedException {
		
		Thread.sleep(Tempo);
	}
	}



