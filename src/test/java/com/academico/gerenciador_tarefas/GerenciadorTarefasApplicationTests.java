package com.academico.gerenciador_tarefas;

import com.academico.gerenciador_tarefas.model.Tarefa;
import com.academico.gerenciador_tarefas.repository.TarefaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MvcApplicationTests {

    @Autowired
    private TarefaRepository repository;

    @Test
    void criarTarefaTest() {
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("Estudar Spring");
        tarefa.setStatus("Pendente");

        Tarefa salva = repository.save(tarefa);

        assertThat(salva.getId()).isNotNull();
        assertThat(salva.getDescricao()).isEqualTo("Estudar Spring");
    }
}