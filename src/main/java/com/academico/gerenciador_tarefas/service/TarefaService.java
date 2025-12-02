package com.academico.gerenciador_tarefas.service;

import com.academico.gerenciador_tarefas.model.Tarefa;
import com.academico.gerenciador_tarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public Tarefa criarTarefa(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public List<Tarefa> listarTarefas() {
        return repository.findAll();
    }

    public Optional<Tarefa> atualizarTarefa(Long id, Tarefa tarefaAtualizada) {
        return repository.findById(id).map(tarefa -> {
            tarefa.setDescricao(tarefaAtualizada.getDescricao());
            tarefa.setStatus(tarefaAtualizada.getStatus());
            return repository.save(tarefa);
        });
    }

    public void deletarTarefa(Long id) {
        repository.deleteById(id);
    }
}