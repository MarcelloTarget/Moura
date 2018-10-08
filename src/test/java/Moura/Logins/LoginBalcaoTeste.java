package Moura.Logins;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Moura.Logins.LoginBalcao;
import static Moura.core.DriverFactory.getDriver;
//import static qa.cnabox.core.DriverFactory.killDriver;




public class LoginBalcaoTeste {

	@Rule
	public TestName testName = new TestName();

	private LoginBalcao page = new LoginBalcao();

	@Before
	public void inicializa() throws InterruptedException {
		
		page.acessarTelaInicial();
		
		
		
	}
	@After
	public void finaliza() throws IOException 
	{
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File print = ss.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(print, new File("target" + File.separator + "screenshot" + File.separator
				+ testName.getMethodName() +  ".jpg"));

		
		}
	
	
}



