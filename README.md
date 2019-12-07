

# **Submarino Search - Mônica Cachoni**

---


## Tecnologias

* *Para documentar os cenários especificados seguindo BDD*: **Cucumber**
* *Linguagem de programação*: **Java**
* *IDE*: **Visual Studio Code - Version 1.40.2**
* *Bibliotecas*:
>* 		**Selenium**
>*		**JUnit**
>*		**Cucumber**

---

## Projeto
Projeto Maven: *WebAutomation*

---

## Setup do Ambiente para execução dos testes

Para executar os cenários de teste automatizados, é necessário configurar o seu ambiente com os seguintes recursos:

* **JRE**
* **Maven**

---

## Execução dos Testes

Após realizar o setup informado acima, execute os cenários de teste automatizados através do seguinte procedimento:

* *Faça download do projeto*: ****
* *Descompacte o arquivo compactado em um diretório de sua preferência*
* *Acesse o promp de comando*: **Win+R -> CMD -> Enter**
* *Acesse o diretório para onde o arquivo compactado foi descompactado*: **cd <diretório>/WebAutomation -> Enter**
* *Execute o teste do Desafio WebSite*: **mvn test -Dtest=CucumberRunner**
* *Verifique o resultado do teste do Desafio WebSite*: 
>* **<diretório>\reports\test-report\index.html**


## Docker e Jenkinsfile

* *docker run -d -p 5000:5000 my_web_app

* *docker build -t my_web_app:latest .

* * Configurar Jenkins em localhost e start no job
