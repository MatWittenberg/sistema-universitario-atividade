function carregarPerfil(tipo) {
            fetch(`http://localhost:8080/api/${tipo}`)
                .then(resposta => resposta.json())
                .then(dados => {
                    document.getElementById('tela-nome').textContent = dados.nome;
                    document.getElementById('tela-cpf').textContent = dados.cpf;
                    document.getElementById('tela-matricula').textContent = dados.matriculaInstitucional;

                    const extraGeral = document.getElementById('tela-extra-geral');
                    const dinamicoTitulo = document.getElementById('dinamico-titulo');
                    const dinamicoConteudo = document.getElementById('dinamico-conteudo');
                    const cardTitulo = document.getElementById('card-titulo');

                    if (tipo === 'alunos') {
                        cardTitulo.textContent = "👨‍🎓 Perfil do Aluno";
                        extraGeral.innerHTML = `<div class="info-linha"><span class="destaque">Curso:</span> ${dados.curso}</div>
                                                <div class="info-linha"><span class="destaque">Período:</span> ${dados.periodoAtual}º</div>`;

                        dinamicoTitulo.textContent = "📊 Histórico Escolar (Composição)";
                        dinamicoConteudo.innerHTML = `<div class="info-linha"><span class="destaque">Notas:</span> ${dados.historicoEscolar.notas}</div>
                                                      <div class="info-linha"><span class="destaque">Frequência:</span> ${dados.historicoEscolar.frequencia}%</div>`;
                    } else {
                        cardTitulo.textContent = "👨‍🏫 Perfil do Professor";
                        extraGeral.innerHTML = `<div class="info-linha"><span class="destaque">Titulação:</span> ${dados.titulacao}</div>
                                                <div class="info-linha"><span class="destaque">Salário:</span> R$ ${dados.salario.toFixed(2)}</div>
                                                <div class="info-linha"><span class="destaque">Área de Atuação:</span> ${dados.areaAtuacao}</div>`;

                        dinamicoTitulo.textContent = "📚 Disciplinas Ministradas (Associação)";

                        let listaMedias = "<ul>";
                        dados.disciplinasMinistradas.forEach(d => {
                            listaMedias += `<li>${d.nome} (${d.cargaHoraria}h) - Cód: ${d.codigo}</li>`;
                        });
                        listaMedias += "</ul>";

                        dinamicoConteudo.innerHTML = listaMedias;
                    }
                })
                .catch(erro => {
                    console.error("Erro na requisição:", erro);
                    document.getElementById('tela-nome').textContent = "Erro ao conectar à API!";
                });
        }

        carregarPerfil('alunos');