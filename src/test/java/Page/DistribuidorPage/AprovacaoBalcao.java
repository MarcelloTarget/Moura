package Page.DistribuidorPage;

import static Moura.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Moura.core.BasePage;

public class AprovacaoBalcao extends BasePage {


	public void InformeCNPJ() throws InterruptedException {
		
		Thread.sleep(3000);
		clicarBotaoBy(By.cssSelector("[accept-charset] .form-group:nth-child(2) .ng-untouched"));
		Thread.sleep(3000);
		escreveTexto(By.cssSelector("[accept-charset] .form-group:nth-child(2) .ng-untouched"), "46210258000113");
		
	}
	
	public void informeSenha() throws InterruptedException{
		
		Thread.sleep(3000);
		clicarBotaoBy(By.className("senha"));
		Thread.sleep(3000);
		escreveTexto(By.className("senha"),"000113");
		Thread.sleep(3000);
		
	}
	
	public void ClicarEnviar() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-primary"))).click();
		
	}

}




