# Documentação da Api.

## Ajuda:

Get: /ajuda


## Consulta:

Get: /consultas/id

Delete: /consultas/id

Post : /consultas 

```json
[
{
"pacienteId": Long,
"medicoId": Long,
"dataHora": LocalDateTime,
"descricao": String
}
]
```

## Diagnostico:

Get: /diagnosticos/id

Delete: /diagnosticos/id

Post : /diagnosticos

```json
[
{
"pacienteId": Long,
"medicoId": Long,
"dataHora": LocalDateTime,
"descricao": String
}
]
```

## Medico:

Get: /medicos/id

Delete: /medicos/id

Post : /medicos

```json
[
{
"nome": String,
"especialidade": String,
"contato": String
}
]
```

## Paciente:

Get: /pacientes/id

Delete: /pacientes/id

Post : /pacientes

```json
[
{
"nome": String,
"dataDeNascimento": LocalDateTime,
"contato": String
}
]
```

## Tratamento:

Get: /tratamentos/id

Delete: /tratamentos/id

Post : /tratamentos

```json
[
{
"diagnosticoId": Long,
"medicamentoId": String,
"descricao": String,
"duracao": String
}
]
```
