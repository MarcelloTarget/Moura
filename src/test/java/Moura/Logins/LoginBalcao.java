package Moura.Logins;
import Moura.core.BasePage;
import static Moura.core.DriverFactory.getDriver;

public class LoginBalcao extends BasePage  {



	public void acessarTelaInicial() {
		getDriver().get("http://201.43.117.245:9020/");
	}


}
