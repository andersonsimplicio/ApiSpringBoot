# 📝 To-Do List API

Uma API REST para gerenciamento de tarefas (To-Do List) desenvolvida com Spring Boot.

---

## 🚀 Pré-requisitos e Instalação

Antes de começar, você precisará ter as seguintes ferramentas instaladas na sua máquina:

1. **Java Development Kit (JDK):** Versão 21 ou superior (visto que o projeto utiliza recursos recentes).
2. **Maven:** Para gerenciamento de dependências (opcional se usar o `mvnw` incluso).
3. **IDE / Editor:** [Visual Studio Code](https://code.visualstudio.com/) ou [IntelliJ IDEA](https://www.jetbrains.com/idea/).

---

## 🛠️ Configurando o VS Code (Recomendado)

Para que o ambiente Java, Spring Boot e Lombok funcione perfeitamente no VS Code sem erros de compilação, instale as seguintes extensões:

1. **Extension Pack for Java** (Microsoft) - Instala o suporte essencial ao Java e Maven.
2. **Spring Boot Extension Pack** (VMware) - Ajuda na criação e navegação de projetos Spring.
3. **Lombok Annotations Support for VS Code** (GabrielBB) - **Obrigatória** para que o VS Code entenda o `@Data` e não dê erro de compilação nas classes.

### ⚙️ Configurações Automáticas (`settings.json`)
Para ativar o autocomplete inteligente e fazer o VS Code importar as classes (como `@Entity`, `LocalDateTime`) e organizar o código sozinho ao salvar, adicione isso ao seu `settings.json`:

```json
{
    "java.configuration.updateBuildConfiguration": "automatic",
    "editor.suggestOnTriggerCharacters": true,
    "java.completion.enabled": true,
    "editor.codeActionsOnSave": {
        "source.organizeImports": "explicit"
    }
}