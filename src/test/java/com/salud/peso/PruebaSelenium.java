package com.salud.peso;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class PruebaSelenium {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Si tienes chromedriver.exe en la raíz del proyecto:
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080"); // Tu app aquí
    }

    @Test
    public void testActualizarPesoDesdeInterfaz() {
        WebElement campoPeso = driver.findElement(By.id("peso"));
        WebElement botonActualizar = driver.findElement(By.id("actualizar"));

        // Simula que el usuario escribe el nuevo peso
        campoPeso.clear();
        campoPeso.sendKeys("68.5");

        // Simula clic en el botón
        botonActualizar.click();

        // Verifica que el nuevo peso sea visible
        WebElement pesoMostrado = driver.findElement(By.id("pesoActual"));
        assertEquals("68.5", pesoMostrado.getText());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
