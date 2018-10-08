package Page.DistribuidorPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Moura.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import Moura.core.BasePage;

public class AprovacaoGerente extends BasePage {
	
	public void InformeCNPJ() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cnpj"))).click();
		WebDriverWait wait2 = new WebDriverWait(getDriver(), 10);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className("cnpj"))).sendKeys("46210258000113");
		
	}
	
	public void informeSenha() throws InterruptedException{
		
		WebDriverWait wait2 = new WebDriverWait(getDriver(), 20);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className("senha"))).sendKeys("000113");
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void ClicarEnviar() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-primary"))).click();
		
	}

}
