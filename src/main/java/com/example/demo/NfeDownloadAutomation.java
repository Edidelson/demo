package com.example.demo;

import java.io.File;

public class NfeDownloadAutomation {

    public static void main(String[] args) {
       /* // Caminho do seu ChromeDriver (ajuste conforme necessário)
        File chromeDriverFile = new File("C:\\Users\\delso\\Downloads\\demo\\chromedriver.exe");

        // Configurar as opções do Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--headless");  // Se não precisar de interface gráfica

        String downloadDir = "C:\\Users\\delso\\Downloads\\demo";
        options.addArguments("download.default_directory=" + downloadDir);

        // Definir o caminho para o ChromeDriverService
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(chromeDriverFile)
                .usingAnyFreePort()
                .build();

        try {
            // Inicializar o WebDriver com o serviço configurado
            WebDriver driver = new ChromeDriver(service, options);

            // Acessar a página de verificação
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

            // Esperar o arquivo ser baixado (ajustar conforme necessário)
            Thread.sleep(5000);  // Aguarde 5 segundos para o download
// Obtém o URL atual da página
            String currentUrl = driver.getCurrentUrl();
            WebElement pdfLink = driver.findElement(By.linkText("Baixar PDF")); // Ajuste o seletor conforme necessário

            // Clica para baixar o PDF
            pdfLink.click();
            // Exibe o URL no console
            System.out.println("URL atual: " + currentUrl);

            // Fechar o navegador
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
