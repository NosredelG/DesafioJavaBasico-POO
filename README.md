# DesafioJavaBasico-POO

```mermaid
classDiagram
    class ReprodutorMusical {
        <<interface>>
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) void
    }

    class ReprodutorVideo {
        <<interface>>
        +iniciar() void
        +pausar() void
        +selecionarVideo(String video) void
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero) void
        +selecionarContato(String contato) void
        +atender() void
        +iniciarCorreioVoz() void
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> ReprodutorVideo
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet

  
