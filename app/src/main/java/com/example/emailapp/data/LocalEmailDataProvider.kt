package com.example.emailapp.data

object LocalEmailDataProvider {
     val allEmail = listOf(
        Email(
            id = 0L,
            sender = LocalAccountsDataProvider.getContactAccountByUid(4L),
            subject = "Prezados colegas!",
            body = """
                Gostaria de informar que concluímos a primeira etapa do projeto dentro do 
                prazo estabelecido. Seguimos com o cronograma conforme planejado. Agradeço o 
                empenho de todos.
                """.trimIndent(),
            createAt = "20 minutos atras"
        ), Email(
            id = 1L,
            sender = LocalAccountsDataProvider.getContactAccountByUid(5L),
            subject = "Caros membros da equipe",
            body = """
                Lembrando que teremos uma reunião amanhã às 10h para discutir os próximos
                 passos do projeto. Conto com a presença de todos para alinharmos as estratégias.
                """.trimIndent(),
            createAt = "40 minutos atras"
        ), Email(
            id = 2L,
            sender = LocalAccountsDataProvider.getContactAccountByUid(6L),
            subject = "Prezado",
            body = """
                Agradeço a participação de todos na apresentação de ontem. Gostaria de solicitar
                 feedbacks individuais para aprimorarmos futuras apresentações. Fico à disposição
                  para qualquer dúvida ou sugestão.
                """.trimIndent(),
            createAt = "60 minutos atras"
        ), Email(
            id = 3L,
            sender = LocalAccountsDataProvider.getContactAccountByUid(7L),
            subject = "Caro time",
            body = """
                Gostaria de parabenizá-los pelo excelente trabalho na última semana. Conseguimos
                 alcançar nossas metas e isso é fruto do esforço de cada um. Continuemos assim!
                """.trimIndent(),
            createAt = "20 minutos atras"
        ), Email(
            id = 4L,
            sender = LocalAccountsDataProvider.getContactAccountByUid(8L),
            subject = "Seu Pedido foi enviado!",
            body = """
                Sua Mascara Facial de Pepino foi enviada.
                Fique de olho para receber mais pacote entre esta quinta
                """.trimIndent(),
            createAt = "10 minutos atras"
        ), Email(
            id = 5L,
            sender = LocalAccountsDataProvider.getContactAccountByUid(9L),
            subject = "Prezados colegas",
            body = """
                Estou buscando aprimorar minhas habilidades e gostaria de pedir feedbacks sobre
                 meu desempenho recente. Qualquer contribuição será muito útil para meu 
                 desenvolvimento profissional.
                """.trimIndent(),
            createAt = "20 minutos atras"
        ), Email(
            id = 6L,
            sender = LocalAccountsDataProvider.getContactAccountByUid(10L),
            subject = "Caros",
            body = """
                Por favor, confirmem sua participação no treinamento agendado para o próximo
                 dia 15. É importante termos a presença de todos para garantir o sucesso do evento.
                """.trimIndent(),
            createAt = "30 minutos atras"
        ), Email(
            id = 7L,
            sender = LocalAccountsDataProvider.getContactAccountByUid(11L),
            subject = "Prezado time,",
            body = """
                Gostaria de sugerir uma melhoria no processo de comunicação interna para
                 otimizarmos nosso fluxo de trabalho. Podemos discutir essa proposta na 
                 próxima reunião?
                """.trimIndent(),
            createAt = "20 minutos atras"
        ), Email(
            id = 8L,
            sender = LocalAccountsDataProvider.getContactAccountByUid(12L),
            subject = "Seu Pedido foi enviado, com sucesso, aproveite!",
            body = """
                Sua Mascara Facial de Pepino foi enviada.
                Fique de olho para receber mais pacote entre esta quinta
                """.trimIndent(),
            createAt = "20 minutos atras"
        ), Email(
            id = 9L,
            sender = LocalAccountsDataProvider.getContactAccountByUid(13L),
            subject = "Caros colegas",
            body = """
                Este é um lembrete amigável de que o prazo de entrega do projeto está
                 se aproximando. Certifiquem-se de que todas as tarefas estejam concluídas 
                 dentro do prazo estabelecido.
                """.trimIndent(),
            createAt = "20 minutos atras"
        ), Email(
            id = 10L,
            sender = LocalAccountsDataProvider.getContactAccountByUid(14L),
            subject = "Prezados",
            body = """
                Estou organizando um café de networking na próxima sexta-feira, às 15h, na sala
                 de reuniões. Será uma ótima oportunidade para nos conhecermos melhor e 
                 fortalecermos nossas conexões profissionais.
                """.trimIndent(),
            createAt = "20 minutos atras"
        )
    )

    fun get(id: Long) = allEmail.first { it.id == id }
}