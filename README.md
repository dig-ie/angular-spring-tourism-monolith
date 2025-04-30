# 🏨 Resort Tour System

Sistema monolítico fullstack desenvolvido com **Spring Boot** no backend e **Angular** no frontend, com foco em apresentar domínio técnico para vagas Full Stack no setor hoteleiro/turístico. Este projeto simula um módulo de concierge digital, permitindo cadastro e visualização de pontos turísticos e cidades.

## 📌 Stack Utilizada

- ⚙️ **Backend**: Java 17 + Spring Boot
- 🌐 **Frontend**: Angular 17 + Angular Material
- ☁️ **Hospedagem**: AWS Elastic Beanstalk (Java SE + NGINX estático)
- 📦 **Build tools**: Maven + Node/NPM

## 🎯 Aplicação no Contexto Hoteleiro

Este projeto pode ser adaptado como um **sistema de concierge digital** ou **painel interno para recomendação turística**, com potencial de evolução para:

- 📍 Sugestões de passeios personalizados para hóspedes
- 📆 Agendamento de atividades turísticas
- 🗺️ Integração com rotas e pontos próximos ao hotel
- 🤝 Painel interno de gestão para a equipe do hotel cadastrar e gerenciar atividades

## Banco de Dados

O projeto utiliza o **Supabase** como backend-as-a-service, que fornece uma camada completa de autenticação, armazenamento e banco de dados em tempo real. O **banco de dados utilizado é o PostgreSQL**, o que garante robustez, performance e flexibilidade nas operações relacionais.

O Supabase permite:
- Consultas SQL diretas com alto desempenho.
- Integração simples com autenticação e regras de acesso.
- API REST e GraphQL automáticas baseadas no schema do banco.

> 📌 **Nota**: Toda a estrutura de dados, autenticação de usuários e persistência das informações é gerenciada através do Supabase, facilitando a escalabilidade e o desenvolvimento ágil da aplicação.

Demonstra:
- Conhecimento prático em APIs REST
- Domínio de frontend com Angular (responsivo e rápido)
- Camadas organizadas com Clean Architecture
- Prontidão para produção com AWS Elastic Beanstalk
- Banco de dados e integração frontend e backend

## 📁 Estrutura do Projeto

```
resort-tour-system/
│
├── backend/               # Projeto Spring Boot (clean architecture)
│   ├── application/
│   ├── domain/
│   ├── infrastructure/
│   └── web/
│
├── frontend/              # Projeto Angular (SPA)
│   ├── src/app/
│   └── dist/              # Build final copiado para o backend
│
└── README.md
```

## 🚀 Executando Localmente

1. Clone o repositório:
```bash
git clone https://github.com/seuusuario/resort-tour-system.git
```

2. Rode o frontend:
```bash
cd frontend
npm install
ng build --configuration production
```

3. Rode o backend:
```bash
cd ../backend
./mvnw spring-boot:run
```

Acesse em: [http://localhost:8080](http://localhost:8080)

---

## ☁️ Deploy AWS Elastic Beanstalk

1. Crie uma nova aplicação com plataforma "Java"
2. Realize o build do Angular com `ng build`
3. Copie os arquivos gerados para `backend/src/main/resources/public`
4. Gere o JAR final com:
```bash
cd backend
./mvnw clean package
```
5. Faça upload do JAR (`target/*.jar`) no EB

---

Feito por Diêgo de Barros.
