
public class Teste {

   /* public static void main(String[] args) {
        // Defina o caminho para o ChromeDriver
        System.setProperty("webdriver.chrome.driver", "caminho/para/chromedriver");

        // Inicialize o WebDriver do Chrome
        WebDriver driver = new ChromeDriver();

        try {
            // Abra a página
            driver.get("https://nfe.prefeitura.sp.gov.br/publico/verificacao.aspx");

            // Preencher os campos
            WebElement numeroNota = driver.findElement(By.id("ctl00_body_tbNota"));
            numeroNota.sendKeys("4763890");

            WebElement codigoVerificacao = driver.findElement(By.id("ctl00_body_tbVerificacao"));
            codigoVerificacao.sendKeys("ABMP-7U6G");

            WebElement cnpj = driver.findElement(By.id("ctl00_body_tbCPFCNPJ"));
            cnpj.sendKeys("10.864.846/0033-00");

            // Clicar no botão
            WebElement botaoVerificar = driver.findElement(By.id("ctl00_body_btVerificar"));
            botaoVerificar.click();

            // Aguardar e processar os resultados
            // ...

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar o navegador
            driver.quit();
        }
    }*/
}
