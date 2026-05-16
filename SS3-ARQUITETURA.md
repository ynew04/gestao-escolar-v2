# SS3 - Arquitetura Inicial do Sistema

## Objetivo do Sistema

Criar um sistema de gestão escolar moderno, rápido e organizado, focado em facilitar o trabalho da coordenação, professores e alunos.

O sistema terá diferentes tipos de usuários, cada um com funções específicas.

---

# Tipos de Usuário

## 1. Diretor / Coordenação

O diretor terá acesso total ao sistema.

Funções:
- cadastrar professores
- cadastrar alunos
- criar turmas
- definir login dos usuários
- visualizar informações gerais
- gerenciar o sistema

---

## 2. Professor

O professor terá acesso apenas às suas turmas e funções relacionadas aos alunos.

Funções:
- visualizar suas turmas
- visualizar alunos das turmas
- atualizar rendimento dos alunos
- lançar notas
- registrar ocorrências
- criar atividades
- usar mural de avisos
- acompanhar desempenho da turma

---

## 3. Aluno

O aluno terá acesso apenas às suas próprias informações.

Funções:
- visualizar notas
- visualizar rendimento
- visualizar atividades
- visualizar mural
- acompanhar histórico escolar

---

# Estrutura Inicial do Sistema

## Professor
Cada professor poderá possuir várias turmas.

Exemplo:
- Professor Carlos
    - 2A
    - 2F
    - 1E

---

## Turma
Cada turma possuirá vários alunos.

Exemplo:
Turma 2A:
- Lucas
- Mariana
- João

---

## Aluno
Cada aluno possuirá:
- nome
- matrícula
- notas
- rendimento
- ocorrências
- histórico

---

# Fluxo Inicial do Sistema

## Menu Principal

1 - Login Diretor
2 - Login Professor
3 - Login Aluno
0 - Sair

---

# Ideias Futuras

- dashboard de desempenho
- alertas automáticos
- histórico completo do aluno
- mural inteligente
- área dos responsáveis
- gráficos de evolução
- sistema web futuramente
- banco de dados
- login real com autenticação

---

# Objetivo do Projeto

O projeto será desenvolvido inicialmente em Java Console para aprendizado de lógica, arquitetura e desenvolvimento de sistemas.

No futuro poderá evoluir para:
- banco de dados
- interface gráfica
- sistema web
- aplicação profissional