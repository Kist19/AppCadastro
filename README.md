# **App Cadastro**

> Aplicativo que realiza cadastro de usuário e o lista em uma tela separada.

## 📱 Descrição

O **App Cadastro** permite inserir dados para registrar um usuário e exibe uma lista dos usuários cadastrados, com botões para visualizar os registros.

## 🔧 Funcionalidades

- [x] Entrada de dados (Nome, Endereco e Telefone)
- [x] Cadastro de usuário
- [x] Listagem de usuários
- [x] Interface simples e intuitiva

## 🚀 Tecnologias Utilizadas

- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **ConstraintLayout** para interface responsiva
- [x] **TextView** e **EditText** para entrada e exibição de dados
- [x] **Button** para cadastrar e navegar pelos usuários

## 🛠️ Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:

    ```bash
    git clone https://github.com/seuusuario/imc-calculator-app.git

    ```

2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.

## 📂 Estrutura do Projeto

```bash
├── app
│   ├── src
│   │   ├── main
│   │   │  ├── java/br/com/senacrs/usuario/appcadastro
│   │   │  │  ├── MainActivity.java          # Atividade principal com appCadastro
│   │   │  │  ├── Registro.java
│   │   │  │  ├── TelaCadastroUsuario.java
│   │   │  │  ├── TelaListagemUsuarios.java
│   │   │  │  ├── TelaPrincipal.java
│   │   │  ├── res
│   │   │  │   ├── layout
│   │   │  │   │   ├── activity_main.xml     #Layout da tela principal
│   │   │  │   └── values
│   │   │  │       ├── strings.xml           # Strings usadas no app
│   │   │  │       ├── colors.xml            # Cores definidas no projeto
│   └── build.gradle                         # Configuração do Gradle
└── README.md                                # Este arquivo
```
## 🎨 Design e Prototipagem
 
A interface do app foi criada usando **ConstraintLayout** para manter a responsividade em diferentes tamanhos de tela.
 
O design é minimalista e fácil de usar, com foco na simplicidade.
 
 ## 🖥️ Telas do Aplicativo

## 1. Tela Principal
   
   Botões de **Cadastrar usuário** e **Listar usuários cadastrado**.
   
![Texto Alternativo](https://github.com/Kist19/AppCadastro/blob/master/telaprincipal_appcadastro.jpg?raw=true)

## 2. Tela Cadastro
   
   Cadastro de usuário com opções de **Cadastrar** para prosseguir e **Cancelar** para voltar à tela inicial.

![Texto Alternativo](https://github.com/Kist19/AppCadastro/blob/master/cadastro_appcadastro.jpg?raw=true)

## 3. Tela Listagem
   
   Listagem de usuários com opções para ir ao **Próximo** e **voltar** ao Anterior.
   
![Texto Alternativo](https://github.com/Kist19/AppCadastro/blob/master/listagem_appcadastro.jpg?raw=true)

## 👨‍💻 Desenvolvedores

**Arthur Kist** - Desenvolvedor - [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Kist19) [![linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/arthur-kist-34b176254/) [![linkedin](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/kist_19_/)

 ## ✅ Licença 
 
 [![NPM](https://img.shields.io/npm/l/react)](https://github.com/Kist19/AppCadastro/blob/master/LICENSE)
