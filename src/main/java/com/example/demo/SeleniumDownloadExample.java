package com.example.demo;

import java.io.File;

public class SeleniumDownloadExample {
    public static void main(String[] args) {
       /* // Caminho para o ChromeDriver (ajuste conforme necessário)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\delso\\Downloads\\demo\\chromedriver.exe");

        // Configurar as opções do Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--headless");  // Se não precisar de interface gráfica

        // Inicializar o WebDriver (o Selenium automaticamente configura o ChromeDriverService)
        WebDriver driver = new ChromeDriver(options);

        try {
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

            // Verificar se o arquivo foi baixado
            File arquivoBaixado = new File("C:\\Users\\delso\\Downloads\\demo" + "/nome_do_arquivo.pdf");  // Ajuste o nome do arquivo conforme necessário
            if (arquivoBaixado.exists()) {
                System.out.println("Arquivo baixado com sucesso!");
            } else {
                System.out.println("Falha ao baixar o arquivo.");
            }

            // Fechar o navegador
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
